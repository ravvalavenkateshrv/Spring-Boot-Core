package com.net.vyv.auto;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Car  implements Vehicle{

	@Override
	public String typeOfVehicle(String vehicle) {
		
		return "Car";
	}
	
	public Car()
	{
		System.out.println("Car object is created");
	}

}
