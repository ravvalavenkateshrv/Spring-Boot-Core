package com.net.vyv.interfacesClasses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Test {
	
	@Autowired
	
	private Vehicle vehicle;
	
	public void tellVehicleType()
	{
		vehicle.vehicleType("From Car");
	}
	
	

   public Test()
   {
	   System.out.println("Test Object is created");
   }
   
   public Test(Vehicle vehicle)
   {
	   System.out.println("Constructor method call dependency injection");
   }

   public Vehicle getVehicle() {
	return vehicle;
   }

   public void setVehicle(Vehicle vehicle) {
	   System.out.println("Setter method call dependency injection");
	this.vehicle = vehicle;
   }
   
   
   public String vehicleType()
   {
	   return "This is form car";
   }
   

}
