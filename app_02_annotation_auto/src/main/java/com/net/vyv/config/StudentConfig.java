package com.net.vyv.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
	
	
	@Bean("hospital")
	public Student getStudent()
	{
		System.out.println("Hospital From Student");
		return new Student();
	}

}
