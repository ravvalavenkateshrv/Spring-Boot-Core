package com.net.vyv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.net.vyv.interfacesClasses.Test;
import com.net.vyv.interfacesClasses.Vehicle;

@SpringBootApplication
public class App03SpringbootBeanApplication {
	
	

	public static void main(String[] args) {
	ConfigurableApplicationContext container=	SpringApplication.run(App03SpringbootBeanApplication.class, args);
	
	Test test=(Test)container.getBean("test");
	System.out.println(test);
	Vehicle vehicle=test.getVehicle();
	System.out.println(vehicle.getClass());
	
	
	
	;
	
	}

}
