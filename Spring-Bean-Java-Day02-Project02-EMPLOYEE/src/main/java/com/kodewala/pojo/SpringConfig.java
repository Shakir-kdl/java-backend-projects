package com.kodewala.pojo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	@Bean("emp1")
	public Employee employeeObj1() {
		Employee employee1 = new Employee();
		employee1.setEmpName("Shakir");
		employee1.setEmpId(101);
		employee1.setSalary(12500);
		return employee1;
	}
	
	@Bean("emp2")
	public Employee employeeObj2() {
		Employee employee2 = new Employee();
		employee2.setEmpName("Sajid");
		employee2.setEmpId(102);
		employee2.setSalary(55000);
		return employee2;
	}
	
	@Bean("emp3")
	public Employee employeeObj3() {
		Employee employee3 = new Employee();
		employee3.setEmpName("Faisal");
		employee3.setEmpId(103);
		employee3.setSalary(150000);
		return employee3;
	}


	
}
