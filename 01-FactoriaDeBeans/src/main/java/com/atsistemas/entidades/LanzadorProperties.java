package com.atsistemas.entidades;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LanzadorProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext_Properties.xml");
		
		//Opcion 1
		//context.getEnvironment().setActiveProfiles("Desarrollo");
		
		Persona juan = context.getBean("Juan", Persona.class);
		
		System.out.println(juan.getNombre());
		
	}

}
