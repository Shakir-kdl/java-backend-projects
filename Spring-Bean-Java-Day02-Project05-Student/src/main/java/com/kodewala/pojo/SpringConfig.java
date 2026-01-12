package com.kodewala.pojo;

import java.beans.BeanProperty;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class SpringConfig {

	@Bean("std1")
	public Student createObj1() {
		Student student1 = new Student() ;
		student1.setName("Shaikh");
		student1.setId(101);
		return student1;
	}
	
	@Bean("std2")
	public Student createObj2() {
		Student student2 = new Student();
		student2.setName("Faisal");
		student2.setId(102);
		return student2;
	}
	@Bean("std3")
	public Student createObj3() {
		Student student3 = new Student();
		student3.setName("Sunil");
		student3.setId(103);
		return student3;
	}
	@Bean("std4")
	public Student createObj4() {
		Student student4 = new Student();
		student4.setName("Vimal");
		student4.setId(104);
		return student4;
	}
	
}
