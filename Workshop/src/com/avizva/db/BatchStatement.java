package com.avizva.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchStatement {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/avizva", "root", "root");
		connection.setAutoCommit(false);
		String string = "insert into employee values(20,'kp1','ghz',30000)";
		String string1 = "insert into employee values(21,'kp1','ghz',30000)";
		Statement statement = connection.createStatement();
		statement.addBatch(string);
		statement.addBatch(string1);
		statement.executeBatch();
		connection.commit();
		connection.close();

	}

}
