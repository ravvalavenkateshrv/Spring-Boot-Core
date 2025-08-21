package com.net.vyv.component;

import org.springframework.stereotype.Component;

@Component(value="product")
public class Cart {
	
	private int id;
	private int price;
	
	Cart()
	{
		System.out.println("Cart Object is Created");
	}

}
