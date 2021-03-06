package com.cursospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Aplicacion {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Target target = context.getBean(Target.class);
		
		target.alta("Pepito");
		
		((Extension)target).nuevoMetodo();
		
		Target target2 = new Target();
		
		((Extension)target2).nuevoMetodo();

	}

}
