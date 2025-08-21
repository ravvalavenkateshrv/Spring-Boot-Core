package com.net.vyv.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Test {

       @Autowired
      
		private Vehicle vehicle;

	   public Vehicle getVehicle() {
		   return vehicle;
	   }

	   public void setVehicle(Vehicle vehicle) {
		   this.vehicle = vehicle;
	   }

	   @Override
	   public String toString() {
		return "Test [vehicle=" + vehicle + "]";
	   }
       
	   
	   
       
       
      

}
