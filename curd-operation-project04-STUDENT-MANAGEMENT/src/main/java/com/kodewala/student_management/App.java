package com.kodewala.student_management;

// Import JDBC classes
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
// Import Scanner for CMD input
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		// MySQL server URL (no database selected)
		String rootUrl = "jdbc:mysql://localhost:3306/?useSSL=false";

		// MySQL database URL
		String dbUrl = "jdbc:mysql://localhost:3306/student_db?useSSL=false";

		// Database username and password
		String user = "root";
		String pwd = "403403";

		try {
			// Load MySQL JDBC Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Connect to MySQL server and create database if not exists
			Connection conRoot = DriverManager.getConnection(rootUrl, user, pwd);
			Statement stmtRoot = conRoot.createStatement();
			stmtRoot.execute("CREATE DATABASE IF NOT EXISTS student_db");
			conRoot.close();

			// Connect to student_db and create table if not exists
			Connection conDb = DriverManager.getConnection(dbUrl, user, pwd);
			Statement stmtDb = conDb.createStatement();
			stmtDb.execute("CREATE TABLE IF NOT EXISTS student (" + "id INT PRIMARY KEY AUTO_INCREMENT,"
					+ "name VARCHAR(50)," + "address VARCHAR(100))");

			// Scanner object for user input
			Scanner sc = new Scanner(System.in);

			// Infinite loop to display menu again and again
			while (true) {

				// Display menu options
				System.out.println("\n----------- Student Menu -----------");
				System.out.println("1. Insert Student");
				System.out.println("2. Get Students");
				System.out.println("3. Update Student");
				System.out.println("4. Delete Student");
				System.out.println("5. Exit");
				System.out.print("Enter choice: ");

				// Read menu choice
				int choice = sc.nextInt();
				sc.nextLine(); // Clear newline from buffer

				switch (choice) {

				// Insert student data
				case 1:
					String name;
					String address;

					// Take name input until valid
					while (true) {
						System.out.print("Enter name: ");
						name = sc.nextLine().trim();

						// Name validation: only letters and spaces
						if (!name.matches("[a-zA-Z]+( [a-zA-Z]+)*")) {
							System.out.println("Name must contain only letters and spaces");
							continue;
						}
						break;
					}

					// Take address input until valid
					while (true) {
						System.out.print("Enter address: ");
						address = sc.nextLine().trim();

						// Address validation: letters, numbers, space and comma
						if (!address.matches("[a-zA-Z0-9]+([ ,][a-zA-Z0-9]+)*")) {
							System.out.println("Address contains invalid characters");
							continue;
						}
						break;
					}

					// Insert record into student table
					String insertSql = "INSERT INTO student(name,address) VALUES ('" + name + "','" + address + "')";

					stmtDb.executeUpdate(insertSql);
					System.out.println("Student inserted successfully");
					break;

				// Read all students
				case 2:
					ResultSet rs = stmtDb.executeQuery("SELECT * FROM student");

					// Display column headings
					System.out.println("\nID\tNAME\tADDRESS");

					// Read each record from ResultSet
					while (rs.next()) {
						System.out.println(
								rs.getInt("id") + "\t" + rs.getString("name") + "\t" + rs.getString("address"));
					}
					break;

				// Update student data
				case 3:
					System.out.print("Enter student id: ");
					int uid = sc.nextInt();
					sc.nextLine(); // Clear buffer

					String newName;
					String newAddress;

					// Take new name until valid
					while (true) {
						System.out.print("Enter new name: ");
						newName = sc.nextLine().trim();

						if (!newName.matches("[a-zA-Z]+( [a-zA-Z]+)*")) {
							System.out.println("Name must contain only letters and spaces");
							continue;
						}
						break;
					}

					// Take new address until valid
					while (true) {
						System.out.print("Enter new address: ");
						newAddress = sc.nextLine().trim();

						if (!newAddress.matches("[a-zA-Z0-9]+([ ,][a-zA-Z0-9]+)*")) {
							System.out.println("Address contains invalid characters");
							continue;
						}
						break;
					}

					// Update record in database
					String updateSql = "UPDATE student SET name='" + newName + "', address='" + newAddress
							+ "' WHERE id=" + uid;

					stmtDb.executeUpdate(updateSql);
					System.out.println("Student updated");
					break;

				// Delete student by id
				case 4:
					System.out.print("Enter student id: ");
					int did = sc.nextInt();

					stmtDb.executeUpdate("DELETE FROM student WHERE id=" + did);
					System.out.println("Student deleted");
					break;

				// Exit program
				case 5:

					sc.close();
					conDb.close();
					System.out.println("Program exited");
					System.exit(0);

					// Invalid menu choice
				default:
					System.out.println("Invalid choice");
				}
			}

		} catch (Exception e) {
			// Print exception details if any error occurs
			e.printStackTrace();
		}
	}
}
