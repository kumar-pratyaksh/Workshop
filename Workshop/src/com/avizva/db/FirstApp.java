package com.avizva.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class FirstApp {

	public static void main(String[] args) throws SQLException {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/avizva", "root", "root");
		// Statement reference is used when we want to execute static
		// queries.
		// And prepared statement reference is used for executing dynamic
		// queries.
		Statement statement = connection.createStatement();
		String query = "select * from employee";
		ResultSet resultSet = statement.executeQuery(query);
		while (resultSet.next()) {
			System.out.println(resultSet.getInt("eid"));
			System.out.println(resultSet.getString("ename"));
			System.out.println(resultSet.getString("address"));

		}

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter id:");
		int id = Integer.parseInt(scanner.nextLine());
		System.out.println("Enter name:");
		String name = scanner.nextLine();
		System.out.println("ENter address:");
		String address = scanner.nextLine();

		String string = "update employee set ename=? , address=? where eid=?";
		PreparedStatement preparedStatement = connection.prepareStatement(string);
		preparedStatement.setString(1, name);
		preparedStatement.setString(2, address);
		preparedStatement.setInt(3, id);

		preparedStatement.executeUpdate();
		statement.close();
		connection.close();

	}

}
