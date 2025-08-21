package com.net.vyv.delivery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Order {

	
	private int id;
	
	
	private Cart cart;
	
	
	@Autowired
	Order()
	{
		System.out.println("by using Constructior injection");
		System.out.println("Order Object is created");
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public Cart getCart() {
		return cart;
	}


	//  @Autowired
	public void setCart(Cart cart) {
		System.out.println("Cart Object creating using setter injection");
		this.cart = cart;
	}
	
	
}
