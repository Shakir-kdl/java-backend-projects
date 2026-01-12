package com.kodewala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.pojo.Product;
import com.kodewala.pojo.ProductConfig;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(ProductConfig.class);
       
       Product mobile = (Product) context.getBean("mobilProduct");
       System.out.println("Name: "+mobile.getName());
       System.out.println("Id: "+mobile.getId());
       System.out.println("Price: "+mobile.getPrice());
       System.out.println("-------------------------");
       Product tv = (Product) context.getBean("tvProduct");
       System.out.println("Name: "+tv.getName());
       System.out.println("Id: "+tv.getId());
       System.out.println("Price: "+tv.getPrice());
       System.out.println("-------------------------");
       Product ac = (Product) context.getBean("acProduct");
       System.out.println("Name: "+ac.getName());
       System.out.println("Id: "+ac.getId());
       System.out.println("Price: "+ac.getPrice());
       System.out.println("-------------------------");
    }
}
