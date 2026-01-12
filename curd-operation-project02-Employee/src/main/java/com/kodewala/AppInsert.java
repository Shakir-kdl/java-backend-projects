package com.kodewala;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AppInsert {

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
		String sql = "INSERT INTO employee1(name,age,salary)VALUES('Shakir',27,12000),('Faisal',24,1000),('Abid',29,14000)";
		int inserted = stmt.executeUpdate(sql);
		System.out.println("Record Inserted: " + inserted);
	}

}
