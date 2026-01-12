package com.kodewala;

import java.util.HashMap;
import java.util.Map;

public class Cart {

	private Map<Integer, CartItem> cart = new HashMap<>();

	public void addToCart(int productId, String name, double price, int quantity) {
		if (quantity <= 0) {
			System.out.println("Quantity must be greater than zero");
			return;
		}

		if (cart.containsKey(productId)) {
			CartItem item = cart.get(productId);
			item.setQuantity(item.getQuantity() + quantity);
		} else {
			cart.put(productId, new CartItem(productId, name, price, quantity));
		}
	}

	public void viewCart() {
		if (cart.isEmpty()) {
			System.out.println("Cart is empty");
			return;
		}

		double total = 0;

		for (CartItem item : cart.values()) {
			double itemTotal = item.getPrice() * item.getQuantity();
			total += itemTotal;

			System.out.println("Product ID: " + item.getProductId());
			System.out.println("Product Name: " + item.getProductName());
			System.out.println("Quantity: " + item.getQuantity());
			System.out.println("Price: " + item.getPrice());
			System.out.println("Item Total: " + itemTotal);
			System.out.println("--------------------");
		}

		System.out.println("Total Amount: " + total);
	}

	public void updateQuantity(int productId, int newQuantity) {
		if (!cart.containsKey(productId)) {
			System.out.println("Product not found in cart");
			return;
		}

		if (newQuantity <= 0) {
			cart.remove(productId);
		} else {
			cart.get(productId).setQuantity(newQuantity);
			System.out.println("Quantity Updated");
		}
	}

	public boolean isEmpty() {
		return cart.isEmpty();
	}

	public void clearCart() {
		cart.clear();
	}

	public Map<Integer, CartItem> getCartItems() {
		return cart;
	}
}
