package com.net.vyv.delivery;

import org.springframework.stereotype.Component;

@Component
public class Cart {
	
	private int id;
	private String items;
	
	Cart()
	{
		System.out.println("Cart object is created");
	}
	

}
