package com.net.vyv.field;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.net.vyv.field")
public class StudentConfig {
	
	@Bean
	public Address address()
	{
		Address add=new Address();
		add.setId(3);
		add.setStreet("Tpt");
		return add;
	}

}
