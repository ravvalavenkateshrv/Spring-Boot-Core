package com.net.vyv.interfacesClasses;

import org.springframework.stereotype.Component;

@Component

public class Car implements Vehicle  {

	
	public String vehicleType(String name) {
		System.out.println("This is From Car");
		return "Car";
	}

}
