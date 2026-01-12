package com.kodewala;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.pojo.SpringConfig;
import com.kodewala.pojo.Student;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Map<String, Student> studentMap= context.getBeansOfType(Student.class);
        for(Student s:studentMap.values()) {
        	System.out.println("Student Name: "+s.getName());
        	System.out.println("Id: "+s.getId());
        	System.out.println("-------------------------------");
        }
    }
}
