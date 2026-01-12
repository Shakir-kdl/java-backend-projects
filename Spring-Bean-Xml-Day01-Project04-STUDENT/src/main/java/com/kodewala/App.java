package com.kodewala;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodewala.pojo.Student;

public class App {
	public static void main(String[] args) {
		String xmlFile = "resource\\applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(xmlFile);
		Map<String, Student> students = context.getBeansOfType(Student.class);
		for (Student s : students.values()) {
			System.out.println("Student Name: " + s.getName());
			System.out.println("Student Standard: " + s.getStandard());
			System.out.println("Student CGPA: " + s.getCgpa());
			System.out.println("---------------------------------");
		}
	}
}
