package com.kodewala;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.pojo.Course;
import com.kodewala.pojo.CourseConfig;

public class App 
{
    public static void main( String[] args )
    {
     ApplicationContext context = new AnnotationConfigApplicationContext(CourseConfig.class);
     Map<String, Course> courseMap= context.getBeansOfType(Course.class);
     for(Course c : courseMap.values()) {
    	 System.out.println("Name :"+c.getName());
    	 System.out.println("Id :"+c.getId());
    	 System.out.println("Duration :"+c.getDuration());
    	 System.out.println("-----------------------------------------");
     }
    }
}
