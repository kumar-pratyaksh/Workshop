package com.avizva.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class TaskApp {

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

		String query1 = "select * from table1";
		String query2 = "select * from table2";

		ResultSet resultSet = statement.executeQuery(query1);

		// // resultSet.next();
		// // resultSet2.next();
		// System.out.println(resultSet.getString(2));

		ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
		ResultSet resultSet2 = statement.executeQuery(query2);
		ResultSetMetaData resultSetMetaData2 = resultSet2.getMetaData();

		boolean flag = true;
		if (resultSetMetaData.getColumnCount() != resultSetMetaData2.getColumnCount()) {
			System.out.println("Column count different. Tables not identical");
			flag = false;
		} else if (flag) {
			for (int i = 0; i < resultSetMetaData.getColumnCount(); i++) {
				if (resultSetMetaData.getColumnType(i + 1) != resultSetMetaData2.getColumnType(i + 1)) {
					flag = false;
					System.out.println("Column type different");
					break;
				}
			}
		}

		if (flag)
			System.out.println("Tables identical");

		connection.close();

	}
}
