package com.avizva.dao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {

	java.sql.Connection connection;

	public UserDao() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/avizva", "root", "root");
	}

	public boolean validateUser(String userName, String password) throws SQLException {
		PreparedStatement statement = connection
				.prepareStatement("select * from users where username=? and password=?");
		statement.setString(1, userName);
		statement.setString(2, password);
		ResultSet resultSet = statement.executeQuery();
		if (resultSet.next())
			return true;
		return false;
	}

}
