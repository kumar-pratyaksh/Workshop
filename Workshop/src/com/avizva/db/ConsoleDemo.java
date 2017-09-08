package com.avizva.db;

import java.io.Console;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsoleDemo {

	public static void main(String[] args) throws SQLException {
		Console console = System.console();
		String userName, password;

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/avizva", "root", "root");
		connection.setAutoCommit(false);
		System.out.println("Enter username");
		userName = console.readLine();
		System.out.println("Enter password");
		password = String.valueOf(console.readPassword());
		String query = "select * from users where username=? and password=?";
		PreparedStatement pStatement = connection.prepareStatement(query);
		pStatement.setString(1, userName);
		pStatement.setString(2, password);
		ResultSet resultSet = pStatement.executeQuery();
		if (resultSet.next())
			System.out.println("Authenticated");
		else {
			System.out.println("Unauthenticated");
		}
	}

}
