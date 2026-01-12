package com.kodewala.pojo;

public class Order {
	private int ordrId;
	private double amount;
	Payment payment;

	public int getOrdrId() {
		return ordrId;
	}

	public double getAmount() {
		return amount;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setOrdrId(int ordrId) {
		this.ordrId = ordrId;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

}
