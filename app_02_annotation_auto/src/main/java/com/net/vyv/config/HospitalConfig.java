package com.net.vyv.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HospitalConfig {
	
	/*
	
	@Bean
	public Hospital hospital()
	{
		
		Hospital hos=new Hospital();
		hos.setId(3);
	    hos.setName("venkat");
	    return hos;
	}
	
*/
	@Bean(name="hospital")
	public Hospital hospital1()
	{
		System.out.println("1 Hospital");
		
		Hospital hos=new Hospital();
		hos.setId(3);
	    hos.setName("venkat");
	    return hos;
	}
	
	@Bean(name="hospital")
	public Hospital hospital2()
	{
		
		System.out.println("2 Hospital");
		Hospital hos=new Hospital();
		hos.setId(33);
	    hos.setName("pavan");
	    return hos;
	}
	


}
