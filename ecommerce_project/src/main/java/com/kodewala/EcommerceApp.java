package com.kodewala;

import java.util.Scanner;

public class EcommerceApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("--- ECOMMERCE APP ---");
		System.out.println("1. Login");
		System.out.println("2. Register");
		System.out.println("3. Exit");
		System.out.print("Choose option: ");

		int choice = sc.nextInt();
		sc.nextLine();

		int userId = 0;

		if (choice == 1) {
			userId = UserLogin.login(sc);

		} else if (choice == 2) {
			UserRegistration.register(sc);
			System.out.println("Please login now...");
			userId = UserLogin.login(sc);

		} else {
			System.out.println("Thank you. Exiting...");
			return;
		}

		if (userId <= 0) {
			System.out.println("Login failed. Exiting...");
			return;
		}

		Cart cart = new Cart();

		while (true) {

			System.out.println("\n---- USER MENU ----");
			System.out.println("1. View Products");
			System.out.println("2. Add Product to Cart");
			System.out.println("3. View Cart");
			System.out.println("4. Place Order");
			System.out.println("5. View Order History");
			System.out.println("6. Logout");
			System.out.println("7. Update Cart Quantity");
			System.out.print("Choose option: ");

			int option = sc.nextInt();
			sc.nextLine();

			if (option == 1) {
//				ProductView.viewProducts();
				ProductView.viewProductsWithPagination(sc);

			} else if (option == 2) {

				System.out.print("Enter Product ID: ");
				int pid = sc.nextInt();

				System.out.print("Enter Quantity: ");
				int qnty = sc.nextInt();
				sc.nextLine();

				Product p = ProductView.getProductById(pid);

				if (p != null) {
					cart.addToCart(pid, p.getName(), p.getPrice(), qnty);
				} else {
					System.out.println("Invalid Product ID");
				}

			} else if (option == 3) {
				cart.viewCart();

			} else if (option == 4) {

				if (cart.isEmpty()) {
					System.out.println("Cart is empty. Add items first.");
				} else {
					PlaceOrder.placeOrder(userId, cart);
				}

			} else if (option == 5) {
				OrderHistory.viewOrders(userId);

			} else if (option == 6) {
				System.out.println("Logged out successfully");
				break;

			} else if (option == 7) {

				if (cart.isEmpty()) {
					System.out.println("Cart is empty. Add products first.");
					continue;
				}

				System.out.print("Enter Product ID: ");
				int pid = sc.nextInt();

				System.out.print("Enter New Quantity: ");
				int qnty = sc.nextInt();
				sc.nextLine();

				cart.updateQuantity(pid, qnty);
			} else {
				System.out.println("Invalid option");
			}
		}
	}
}
