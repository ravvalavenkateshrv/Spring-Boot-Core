package com.net.vyv.runner;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;




@Component
public class Product {
	
	
	public Product()
	{
		System.out.println("product Object is created");
	}
	

}
