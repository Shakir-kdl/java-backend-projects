package com.kodewala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodewala.pojo.Employee;

public class App {
	public static void main(String[] args) {
		String xmlFile = "resource\\applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(xmlFile);

		Employee employee = (Employee) context.getBean("emp1");
		System.out.println("Employee Name: " + employee.getEmpName());
		System.out.println("Employee Address: " + employee.getAddress());
		System.out.println("Employee Id: " + employee.getEmpId());
		System.out.println("Employee Salary: " + employee.getSalary());

	}
}
