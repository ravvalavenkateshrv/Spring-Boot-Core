package com.net.vyv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.net.vyv.scope.Student;


@SpringBootApplication
public class App03SpringbootBeanApplication {
	
	

	public static void main(String[] args) {
	ConfigurableApplicationContext container=	SpringApplication.run(App03SpringbootBeanApplication.class, args);
	Student student=(Student)container.getBean("student");
	student.setId(2);
	student.setName("venkat");
	System.out.println(student);
	Student student2=(Student)container.getBean("student");
	System.out.println(student2);
	
	Student student3=(Student)container.getBean("student3");
	System.out.println(student3);
	
	
	
	
	}
	
	@Bean
	public Student student3()
	{
		return new Student();
	}

}
