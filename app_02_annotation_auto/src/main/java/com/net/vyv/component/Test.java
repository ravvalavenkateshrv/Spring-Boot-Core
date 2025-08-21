package com.net.vyv.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.net.vyv.config.HospitalConfig;
import com.net.vyv.config.StudentConfig;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext container = new AnnotationConfigApplicationContext(ProductConfig.class);
		
		Product product=(Product)container.getBean("product");
		System.out.println(product);

	}

}
