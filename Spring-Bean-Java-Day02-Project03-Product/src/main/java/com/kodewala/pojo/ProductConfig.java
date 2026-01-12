package com.kodewala.pojo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfig {
@Bean("mobilProduct")
public Product mobilProduct() {
	Product product = new Product();
	product.setName("Apple-16");
	product.setId(101);
	product.setPrice(85000);
	return product;
}
@Bean("tvProduct")
public Product tvProduct() {
	Product product = new Product();
	product.setName("TV");
	product.setId(102);
	product.setPrice(25000);
	return product;
}
@Bean("acProduct")
public Product acProduct() {
	Product product = new Product();
	product.setName("AC");
	product.setId(103);
	product.setPrice(35000);
	return product;
}
}
