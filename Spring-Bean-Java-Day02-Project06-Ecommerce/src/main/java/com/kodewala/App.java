package com.kodewala;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.pojo.Order;
import com.kodewala.pojo.OrderConfig;

public class App 
{
    public static void main( String[] args )
    {
		ApplicationContext context = new AnnotationConfigApplicationContext(OrderConfig.class);

		Map<String, Order> orderMap = context.getBeansOfType(Order.class);
		for (Order od : orderMap.values()) {
			System.out.println("Order Name :" + od.getOrderName());
			System.out.println("Order Id :" + od.getOrderId());
			System.out.println("Order Amount :" + od.getOrderAmount());
			System.out.println("Payment Mod: " + od.getPaymentMod());
			System.out.println(".......................................");

		}
    }
}
