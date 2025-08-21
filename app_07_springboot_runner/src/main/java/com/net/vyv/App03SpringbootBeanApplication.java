package com.net.vyv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
@SpringBootApplication
public class App03SpringbootBeanApplication {

	

	public static void main(String[] args) {
		System.out.println("Before starting spring boot application");
	ConfigurableApplicationContext container=	SpringApplication.run(App03SpringbootBeanApplication.class, args);
	
	
	System.out.println("End of the spring boot application");
	
	
	
	
	}


}
