package com.kodewala.pojo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CourseConfig {
@Bean("javaCourse")
public Course javaCourse() {
	Course course = new Course();
	course.setName("java-full-stack");
	course.setId(101);
	course.setDuration("8-month");
	return course;
}

@Bean("pythonCourse")
public Course pythonCourse() {
	Course course = new Course();
	course.setName("python-full-stack");
	course.setId(104);
	course.setDuration("5-month");
	return course;
}
	
@Bean("springCourse")
public Course springCourse() {
	Course course = new Course();
	course.setName("Spring-framwwork");
	course.setId(109);
	course.setDuration("3-month");
	return course;
}
	

@Bean("webCourse")
public Course webCourse() {
	Course course = new Course();
	course.setName("web-development");
	course.setId(110);
	course.setDuration("6-month");
	return course;
}
	

}
