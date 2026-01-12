package com.kodewala;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AppUpdate {

	public static void main(String[] args) {

		try {
			doJDBC();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void doJDBC() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company_db", "root", "403403");
		Statement stmt = con.createStatement();
		String sql = "UPDATE employee set name='ASIF',age=23, salary=2500 WHERE emp_id = 6";
		int updated = stmt.executeUpdate(sql);
		System.out.println("Updated Record: " + updated);
	}

}
