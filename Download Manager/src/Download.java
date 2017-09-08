import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Download implements Runnable {

	public final int BUFFER_SIZE = 4096;

	AtomicBoolean paused = new AtomicBoolean(false);
	AtomicBoolean stopped = new AtomicBoolean(false);

	Lock lock = new ReentrantLock();
	Condition isResumed = lock.newCondition();

	private int numThread = 32;

	public AtomicInteger totalDownloaded = new AtomicInteger(0);
	public AtomicInteger runningThreads = new AtomicInteger(0);

	private URL url;
	private int totalSize = 0;
	public String path;
	public String name;
	private String initSize;
	private String status = "IDLE";

	private long startTime;
	private long pausedTime;

	public Download(URL url, String path, String name, String initSize, String threads) {
		super();
		this.url = url;
		this.path = path;
		this.name = name;
		this.initSize = initSize;
		this.numThread = Integer.parseInt(threads);
		startTime = System.currentTimeMillis();
	}

	public String getName() {
		return name;
	}

	public String getInitSize() {
		return initSize;
	}

	public int getTotalSize() {
		return totalSize;
	}

	public String getStatus() {
		return status;
	}

	public String getSpeed() {
		if ("DOWNLOADING".equals(status)) {
			DecimalFormat decimalFormat = new DecimalFormat();
			decimalFormat.setMaximumFractionDigits(1);
			float speed = (float) totalDownloaded.get() / (float) (System.currentTimeMillis() - startTime);
			if (speed > 1000)
				return decimalFormat.format(speed / 1000) + "MB/s";
			else
				return decimalFormat.format(speed) + "KB/s";
		} else if ("COMPLETE".equals(status)) {
			return "DONE!";
		} else if ("FINISHING".equals(status)) {
			return "FINISHING...";
		} else if ("STOPPED".equals(status)) {
			return "STOPPED.";
		} else if ("PAUSED".equals(status)) {
			return "PAUSED";
		} else if ("CONNECTING".equals(status)) {
			return "CONNECTING";
		} else {
			return "";
		}
	}

	public String getNumThread() {
		return String.valueOf(runningThreads.get());
	}

	public void pause() {
		if ("DOWNLOADING".equals(status)) {
			status = "PAUSED";
			paused.set(true);
			pausedTime = System.currentTimeMillis();
			for (int i = 0; i < numThread; i++)
				runningThreads.getAndDecrement();
		}
	}

	public void stop() {
		if ("DOWNLOADING".equals(status) || "PAUSED".equals(status)) {
			status = "STOPPED";
			stopped.set(true);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for (int i = 1; i < numThread; i++) {
				runningThreads.decrementAndGet();
				File file = new File(path + "\\" + name + "." + i);
				file.delete();
			}
		}
	}

	@Override
	public void run() {

		try {
			runningThreads.incrementAndGet();
			status = "CONNECTING";
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestProperty("Range", "bytes=" + 0 + "-");
			int size = connection.getContentLength();
			totalSize = size;
			if (connection.getResponseCode() == 200) {
				RandomAccessFile file = new RandomAccessFile(path + "\\" + name, "rw");
				InputStream stream = connection.getInputStream();
				int downloaded = 0;
				status = "DOWNLOADING";
				while (true) {
					if (stopped.get()) {
						file.close();
						return;
					}
					lock.lock();
					try {
						while (paused.get()) {
							isResumed.await();
						}
					} finally {
						lock.unlock();
					}

				}
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
