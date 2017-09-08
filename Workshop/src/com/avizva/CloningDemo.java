package com.avizva;

class Z1 implements Cloneable {

	int x;
	String y;

	public Z1(int x, String y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Z1 [x=" + x + ", y=" + y + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public String getY() {
		return y;
	}

	public void setY(String y) {
		this.y = y;
	}

}

public class CloningDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		Z1 z1 = new Z1(4, "Google");
		Z1 z12 = (Z1) z1.clone();
		System.out.println(z1);
		System.out.println(z12);
		z12.setY("Yahoo");
		System.out.println(z1);
		System.out.println(z12);
	}
}
