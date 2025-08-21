package com.net.vyv.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext container=new FileSystemXmlApplicationContext("ProductConfig.xml");
		Product product=(Product)container.getBean("product");
		product.setId(3);
		System.out.println(product);
		

	}

}
