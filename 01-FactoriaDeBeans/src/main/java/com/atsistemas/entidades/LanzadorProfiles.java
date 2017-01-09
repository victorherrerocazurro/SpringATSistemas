package com.atsistemas.entidades;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LanzadorProfiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext_Profiles.xml");
		
		//Opcion 1
		//context.getEnvironment().setActiveProfiles("Desarrollo");
		
		Persona juan = context.getBean("juan", Persona.class);
		
		System.out.println(juan);
		
	}

}
