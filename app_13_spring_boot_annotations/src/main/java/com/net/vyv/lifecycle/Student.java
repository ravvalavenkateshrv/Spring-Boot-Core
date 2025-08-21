package com.net.vyv.lifecycle;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Student {

	
	public Student()
	{
		System.out.println("Student Object is created");
	}
	
	@PostConstruct
	public void initDo()
	{
		System.out.println("Student class from initilizing Bean");
	}
	
	@PreDestroy
	public void dispoDo()
	{
		System.out.println("Disposable Bean from student");
	}
}
