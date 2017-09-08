package com.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbHelper {

	public DbHelper() throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
	}

	private Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/avizva", "root", "root");
	}

	public boolean authenticateUser(String userName, String password) {
		boolean validated = false;
		try {
			Connection connection = getConnection();
			PreparedStatement preparedStatement = connection
					.prepareStatement("select * from users where username=? and password=?");
			preparedStatement.setString(1, userName);
			preparedStatement.setString(2, password);
			ResultSet resultSet;
			resultSet = preparedStatement.executeQuery();
			validated = resultSet.next();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return validated;
	}

}
