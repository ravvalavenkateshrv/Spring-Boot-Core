package com.net.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext container=new FileSystemXmlApplicationContext("D:\\SPRING BOOT\\SPRING CORE\\app_11_First_Application\\src\\com\\net\\constructor\\StudentConfig.xml");
	    Student student=(Student)container.getBean("student");
	    System.out.println(student);
	}

}
