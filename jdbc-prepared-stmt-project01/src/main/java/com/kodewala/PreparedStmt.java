package com.kodewala;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStmt {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		prepStmt();
	}

	public static void prepStmt() throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/student_db";
		String user = "root";
		String pwd = "403403";

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection(url, user, pwd);
		String query = "select * from student where  id=? and name =? and address=?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, 2);
		ps.setString(2, "Shakir");
		ps.setString(3, "Btm");

		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String address = rs.getString(3);
			System.out.println("id: " + id + " name: " + name + " address: " + address);

		}

	}

}
