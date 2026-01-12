package com.kodewala.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.kodewala.pojo.Shipping;

@Configuration
@ComponentScan("com.kodewala")
public class ShippingConfig {

	@Bean("blueDartDelivery")

	public Shipping blueDartDelivery() {
		System.out.println("Blue Dart Delivery..First Bean");
		return new Shipping();
	}

	@Bean("ekartDelivery")
	public Shipping ekartDelivery() {
		System.out.println("Blue Dart Delivery..Second Bean");
		return new Shipping();
	}

	@Bean("dhlDelivery")
	@Primary
	public Shipping dhlDelivery() {
		System.out.println("Blue Dart Delivery..Third Bean");
		return new Shipping();
	}
}
