package com.kodewala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.config.ShippingConfig;
import com.kodewala.service.ShippingService;

public class App 
{
    public static void main( String[] args )
    {
		ApplicationContext context = new AnnotationConfigApplicationContext(ShippingConfig.class);

		ShippingService service = context.getBean(ShippingService.class);

		service.doShippingPartner();
    }
}
