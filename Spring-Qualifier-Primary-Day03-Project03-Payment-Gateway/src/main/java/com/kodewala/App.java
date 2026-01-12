package com.kodewala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.config.PaymentConfig;
import com.kodewala.service.PaymentService;

public class App 
{
    public static void main( String[] args )
    {
		ApplicationContext context = new AnnotationConfigApplicationContext(PaymentConfig.class);

		PaymentService service = context.getBean(PaymentService.class);

		service.doPaymentMethod();
    }
}
