package com.kodewala.pojo;

public class Order {

	private String orderName;
	private int orderId;
	private double orderAmount;
	private String paymentMod;

	public String getPaymentMod() {
		return paymentMod;
	}

	public void setPaymentMod(String paymentMod) {
		this.paymentMod = paymentMod;
	}

	public String getOrderName() {
		return orderName;
	}

	public int getOrderId() {
		return orderId;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}


}
