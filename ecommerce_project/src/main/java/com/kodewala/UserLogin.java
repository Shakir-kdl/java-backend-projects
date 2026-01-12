package com.kodewala;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class UserLogin {

	public static int login(Scanner sc) {

		while (true) {

			System.out.print("Enter email: ");
			String email = sc.nextLine().trim().toLowerCase();

			System.out.print("Enter password: ");
			String password = sc.nextLine().trim();

			String sql = "SELECT user_id, name FROM users WHERE email=? AND password=?";

			try (Connection con = DatabaseConnection.getConnection();
					PreparedStatement ps = con.prepareStatement(sql)) {

				ps.setString(1, email);
				ps.setString(2, password);

				ResultSet rs = ps.executeQuery();

				if (rs.next()) {
					System.out.println("Login successful");
					System.out.println("WELCOME, " + rs.getString("name"));
					return rs.getInt("user_id");
				} else {
					System.out.println("Invalid email or password. Try again.");
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
