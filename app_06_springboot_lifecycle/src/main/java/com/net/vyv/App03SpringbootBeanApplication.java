package com.net.vyv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.net.vyv.lifecycle.Product;
import com.net.vyv.lifecycle.Student;

@SpringBootApplication
public class App03SpringbootBeanApplication {
	
	

	public static void main(String[] args) {
	ConfigurableApplicationContext container=	SpringApplication.run(App03SpringbootBeanApplication.class, args);
	//  Product product=(Product)container.getBean("product");
	
	
	
	}


}
