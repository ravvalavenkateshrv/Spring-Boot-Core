package com.net.vyv.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Component
public class Student implements CommandLineRunner {
	
	public Student()
	{
		System.out.println("Studnet object is created");
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("This is from commandLiner runner interface");
		
	}

}
