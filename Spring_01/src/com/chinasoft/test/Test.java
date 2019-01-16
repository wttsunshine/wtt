package com.chinasoft.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chinasoft.entity.Student;
import com.chinasoft.service.StudentService;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student=(Student) context.getBean("Student");
		StudentService studentService = (StudentService) context.getBean("studentService");
		studentService.addStudent(student);
	}
	
	
}
