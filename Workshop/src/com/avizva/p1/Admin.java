package com.avizva.p1;

public class Admin extends User {
	private int adminId;

	public Admin() {

	}

	public Admin(String username, String password, int adminId) {
		super(username, password);
		this.adminId = adminId;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + "]" + super.toString();
	}

	public void display() {
		super.display();
		System.out.println("Admin ID : " + adminId);
	}

	public static void main(String[] args) {
		Admin admin = new Admin("kp", "kp1239172398172938", 7);
		System.out.println(admin);
		admin.display();
		User admin2 = new Admin();
		admin2.display();

	}

}
