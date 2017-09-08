package com.avizva.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class User {

	public User() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private String userName;

	private String password;

	private String email;

	private String contact;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public User(String userName, String password, String email, String contact) {
		this();
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.contact = contact;
	}

	private Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/avizva", "root", "root");
	}

	public boolean insertUser(String name, String password, String email, String contact) {
		PreparedStatement preparedStatement = null;
		try {
			Connection connection = getConnection();
			preparedStatement = connection.prepareStatement("insert into users values(?,?,?,?)");
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, email);
			preparedStatement.setString(4, contact);
			preparedStatement.setString(3, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if (preparedStatement.executeUpdate() > 0)
				return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return false;

	}

	public User getUser(String userName) {
		PreparedStatement preparedStatement = null;

		try {
			Connection connection = getConnection();
			preparedStatement = connection.prepareStatement("select * from users where username=?");
			preparedStatement.setString(1, userName);
			ResultSet resultSet = preparedStatement.executeQuery();

			if (!resultSet.next())
				return null;
			User user = new User(resultSet.getString("username"), "***", resultSet.getString("email"),
					resultSet.getString("contact"));
			connection.close();
			return user;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public boolean updateUser(String userName, String password) {
		PreparedStatement preparedStatement = null;

		try {
			Connection connection = getConnection();
			preparedStatement = connection.prepareStatement("update users set password = ? where username=?");
			preparedStatement.setString(1, password);
			preparedStatement.setString(2, userName);
			if (preparedStatement.executeUpdate() > 0)
				return true;
			return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public boolean deleteUser(String userName) {
		PreparedStatement preparedStatement = null;
		try {
			Connection connection = getConnection();
			preparedStatement = connection.prepareStatement("delete from users where username=?");
			preparedStatement.setString(1, userName);
			if (preparedStatement.executeUpdate() > 0)
				return true;
			return false;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + ", email=" + email + ", contact=" + contact
				+ "]";
	}

}
