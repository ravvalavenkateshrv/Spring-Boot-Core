package com.net.vyv.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



public class Product implements InitializingBean,DisposableBean {
	
	
	
	@Value("233")
	private int id;
	private String name;
	
	public Product()
	{
		System.out.println("product Object is created");
	}
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}


    @Value("Venkat")
	public void setName(String name) {
    	System.out.println("Value inserted via setter name");
		this.name = name;
	}



	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Initializing Bean using interface");
		
	}



	@Override
	public void destroy() throws Exception {
		
		System.out.println("Deisposable Bean using interface");
	}

}
