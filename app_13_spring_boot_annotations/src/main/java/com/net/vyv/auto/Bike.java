package com.net.vyv.auto;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;



@Component
public class Bike implements Vehicle {

	@Override
	public String typeOfVehicle(String vehicle) {
	
		return "Bike";
	}
	
	public Bike()
	{
		System.out.println("Bike Object is created");
	}

	@Override
	public String toString() {
		return "Bike [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	
	
}
