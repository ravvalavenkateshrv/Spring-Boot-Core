package com.net.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext container = new FileSystemXmlApplicationContext("D:\\SPRING BOOT\\SPRING CORE\\app_01_First_Application\\src\\com\\net\\autowiring\\spring.xml");

		Cart cart=(Cart)container.getBean("cart");
		System.out.println(cart);

	}

}
