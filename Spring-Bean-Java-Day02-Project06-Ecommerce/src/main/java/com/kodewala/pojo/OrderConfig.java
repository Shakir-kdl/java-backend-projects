package com.kodewala.pojo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderConfig {
	@Bean("electronicsProduct")
	public Order createElectronics() {
		Order order = new Order();
		order.setOrderName("AC");
		order.setOrderId(1020);
		order.setOrderAmount(25800.200);
		order.setPaymentMod("Credit Card");
		return order;
	}

	@Bean("fashionProduct")
	public Order createFashion() {
		Order order = new Order();
		order.setOrderName("T-Shirt");
		order.setOrderId(1880);
		order.setOrderAmount(1250.10);
		order.setPaymentMod("COD");
		return order;
	}

	@Bean("groceriesProduct")
	public Order createGroceries() {
		Order order = new Order();
		order.setOrderName("Cooking Oil");
		order.setOrderId(2300);
		order.setOrderAmount(180.00);
		order.setPaymentMod("UPI");
		return order;
	}

	@Bean("stationaryProduct")
	public Order createStationary() {
		Order order = new Order();
		order.setOrderName("Children Books");
		order.setOrderId(1102);
		order.setOrderAmount(260);
		order.setPaymentMod("Debit Card");
		return order;
	}

}
