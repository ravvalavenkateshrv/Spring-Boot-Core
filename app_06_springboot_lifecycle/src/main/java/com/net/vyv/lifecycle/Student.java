package com.net.vyv.lifecycle;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;



@Component
public class Student {

	public Student()
	{
		System.out.println("1 Constructor Bean is Created");
	}
	
	@PostConstruct
	public void Do()
	{
		System.out.println("2 Post Constructor init method called");
	}
	@PostConstruct
	public void Dos()
	{
		System.out.println("2 Post Constructor init method called");
	}
	
	
	public void doWork()
	{
		System.out.println("Working");
		
	}
	@PreDestroy
	public void done()
	{
		System.out.println("3 Pre Destroy bean is about the destroy");
	}
	@PreDestroy
	public void dosne()
	{
		System.out.println("3 Pre Destroy bean is about the destroy");
	}
}
