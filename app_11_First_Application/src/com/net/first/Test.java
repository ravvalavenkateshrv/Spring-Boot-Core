package com.net.first;

import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext container=new FileSystemXmlApplicationContext("D:\\SPRING BOOT\\SPRING CORE\\app_11_First_Application\\src\\StudentConfig.xml");
        Student student=(Student)container.getBean("student");
        System.out.println(student);
	}

}
