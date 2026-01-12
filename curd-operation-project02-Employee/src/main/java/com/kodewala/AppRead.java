package com.kodewala;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AppRead {

	public static void main(String[] args) {
		try {
			doJDBC();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void doJDBC() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company_db", "root", "403403");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM employee1");
		while (rs.next()) {
			int emp_id = rs.getInt(1);
			String name = rs.getString(2);
			int age = rs.getInt(3);
			int salary = rs.getInt(4);
			System.out.println("emp_id: " + emp_id + " name: " + name + " age: " + age + " salary: " + salary);

		}

	}

}
