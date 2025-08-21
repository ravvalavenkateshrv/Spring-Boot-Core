package com.net.vyv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import com.net.vyv.auto.Bike;
import com.net.vyv.auto.Product;
import com.net.vyv.auto.Test;

@SpringBootApplication
public class App13SpringBootAnnotationsApplication {


	public static void main(String[] args) {
		ConfigurableApplicationContext container=SpringApplication.run(App13SpringBootAnnotationsApplication.class, args);
	 
		
	}
	
	


}
