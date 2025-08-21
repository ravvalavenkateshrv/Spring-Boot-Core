package com.net.vyv.basic;

import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ApplicationContext container=	new FileSystemXmlApplicationContext("productConfig.xml");

	}

}
