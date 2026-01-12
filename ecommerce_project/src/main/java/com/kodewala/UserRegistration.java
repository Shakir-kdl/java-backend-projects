package com.kodewala;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class UserRegistration {

	public static void register(Scanner sc) {

		String name;
		String email;
		String password;
		while (true) {
			System.out.println("Enter name: ");
			name = sc.nextLine();
			if (name.matches("[a-zA-Z ]+")) {
				break;
			} else {
				System.out.println("Invalid name! Digit are not allowed");
			}
		}
		while (true) {

			System.out.println("Enter email: ");
			email = sc.nextLine();
			try (Connection con = DatabaseConnection.getConnection()) {
				String checkSql = "SELECT user_id FROM users WHERE email=?";
				PreparedStatement checkps = con.prepareStatement(checkSql);
				checkps.setString(1, email);
				ResultSet rs = checkps.executeQuery();
				if (rs.next()) {
					System.out.println("Email already used.Please try another.");

				} else {
					break;
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		System.out.println("Enter password: ");
		password = sc.nextLine();

		String insertSql = "INSERT INTO users(name,email,password) values(?,?,?)";
		try (Connection con = DatabaseConnection.getConnection()) {

			PreparedStatement insertPs = con.prepareStatement(insertSql);
			insertPs.setString(1, name);
			insertPs.setString(2, email);
			insertPs.setString(3, password);
			insertPs.executeUpdate();
			System.out.println("User registered successfully!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
