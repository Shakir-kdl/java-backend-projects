package com.kodewala.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.kodewala.pojo.Payment;

@Configuration
@ComponentScan("com.kodewala")
public class PaymentConfig {

	@Bean("creditCardPayment")
	public Payment creditCardPayment() {
		System.out.println("Credit Card Payment......First Bean");
		return new Payment();
	}

	@Bean("upiPayment")
	@Primary
	public Payment upiPayment() {
		System.out.println("UPI Payment......Second Bean");
		return new Payment();
	}

	@Bean("codPayment")
	public Payment codPayment() {
		System.out.println("Cash On Delivery Payment......Third Bean");
		return new Payment();
	}

}
