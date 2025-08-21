package com.net.vyv.interfacesClasses;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Bike implements Vehicle{


	public String vehicleType(String name) {
		
		System.out.println("This is from bike");
		return "Bike";
	}

}
