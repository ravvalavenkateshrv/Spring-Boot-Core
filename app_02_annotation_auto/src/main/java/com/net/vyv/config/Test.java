package com.net.vyv.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[]args)
	{
		ApplicationContext container = new AnnotationConfigApplicationContext(HospitalConfig.class,StudentConfig.class);
		Student hospital=(Student)container.getBean("hospital");
		System.out.println(hospital);
	
	}

}