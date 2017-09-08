package com.avizva.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DbApp2 {
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/avizva", "root", "root");
		connection.setAutoCommit(false);
		String string = "select * from employee";
		Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rSet = statement.executeQuery(string);

		ResultSetMetaData rMetaData = rSet.getMetaData();
		while (rSet.next()) {
			int salary = rSet.getInt("salary") + 1;
			rSet.updateInt("salary", salary);
			rSet.updateRow();
			System.out.println(rSet.getInt("salary") + " " + rSet);
		}

		statement = connection.createStatement();
		statement.executeUpdate("insert into employee values(14,'kp','ggn',20000)");
		statement.executeUpdate("insert into employee values(15,'kp','mbd',20000)");
		connection.commit();
		connection.close();

	}
}
