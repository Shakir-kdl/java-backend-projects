package com.kodewala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.config.WheatherConfig;
import com.kodewala.service.WheatherService;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(WheatherConfig.class);
        
        WheatherService service = context.getBean(WheatherService.class);
        
        service.printWheatherInfo();
    }
}
