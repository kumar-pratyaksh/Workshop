import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue<>();
		queue.add(4);
		queue.add(5);
		queue.add(1);
		while (queue.size() > 0) {
			System.out.println(queue.peek());
			System.out.println(queue.poll());
		}
	}

}
