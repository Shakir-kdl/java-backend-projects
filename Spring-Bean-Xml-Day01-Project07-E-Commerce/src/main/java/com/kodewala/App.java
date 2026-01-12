package com.kodewala;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodewala.pojo.Order;
import com.kodewala.pojo.Payment;

public class App 
{
    public static void main( String[] args )
    {
		String xmlFile = "resources\\applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(xmlFile);
		Map<String, Order> orderMap= context.getBeansOfType(Order.class);
		for(Order od: orderMap.values()) {
			System.out.println("Order Id: " + od.getOrdrId());
			System.out.println("Order amount: " + od.getAmount());
			Payment payment = od.getPayment();
			System.out.println("Payment Type: " + payment.getPaymentType());
			System.out.println("-------------------------------");
		}
		
		


    }
}
