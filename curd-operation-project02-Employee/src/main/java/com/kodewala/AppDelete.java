package com.kodewala;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AppDelete {

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
		String sql = "DELETE FROM employee WHERE emp_id = 5";
		String sql2 = "DELETE FROM employee WHERE name = 'ASIF'";
		int deleted = stmt.executeUpdate(sql);
		int deleted1 = stmt.executeUpdate(sql2);

		System.out.println("Record Deleted: " + deleted);
		System.out.println("Record Deleted : " + deleted1);
	}

}
