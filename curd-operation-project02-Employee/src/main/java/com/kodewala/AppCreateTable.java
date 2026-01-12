package com.kodewala;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AppCreateTable {

	public static void main(String[] args) {

		try {
			doJDBC();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public static void doJDBC() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company_db", "root", "403403");
		Statement stmt = con.createStatement();
		String sql = "CREATE TABLE employee1 (emp_id int PRIMARY KEY AUTO_INCREMENT,name VARCHAR(50),age int,salary int)";
		stmt.execute(sql);
		System.out.println("Table 'employee' Created Successfully!");
	}

}
