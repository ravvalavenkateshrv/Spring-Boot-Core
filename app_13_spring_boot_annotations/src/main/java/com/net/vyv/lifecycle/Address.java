package com.net.vyv.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;


public class Address implements InitializingBean,DisposableBean {
	
	private int id;
	private String name;
	
	
	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("Intitilzing bean from address class");
		
	}


	@Override
	public void destroy() throws Exception {
	
		System.out.println("Disposable Bean from address class");
		
	}

}
