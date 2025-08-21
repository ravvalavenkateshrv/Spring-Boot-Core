package com.net.auto.byType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

	
	public static void main(String[]args)
	{
	 ApplicationContext container=	new FileSystemXmlApplicationContext("D:\\SPRING BOOT\\SPRING CORE\\app_01_First_Application\\src\\com\\net\\auto\\byType\\spring.xml");
	 College college=(College)container.getBean("college");
	 System.out.println(college);
	}

}
