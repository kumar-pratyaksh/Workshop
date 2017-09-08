package com.avizva.db;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSetDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();
		jdbcRowSet.setUrl("jdbc:mysql://localhost:3306/avizva");
		jdbcRowSet.setUsername("root");
		jdbcRowSet.setPassword("root");
		// JdbcRowSet jdbcRowSet2 =
		// RowSetProvider.newFactory().jdbcRowSet.setCommand("select * from
		// employee");
		jdbcRowSet.execute();
		while (jdbcRowSet.next()) {
			System.out.println(jdbcRowSet.getInt("eid"));
			System.out.println(jdbcRowSet.getString("ename"));

		}
	}

}
