package com.kodewala;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.pojo.Employee;
import com.kodewala.pojo.SpringConfig;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        
        Map<String, Employee> empMap = context.getBeansOfType(Employee.class);
        for(Employee e: empMap.values()) {
        	System.out.println("Name: "+e.getEmpName());
        	System.out.println("Name: "+e.getEmpId());
        	System.out.println("Name: "+e.getSalary());
        	System.out.println("-------------------------------------");
        }
    }
}
