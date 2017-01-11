package com.cursospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AplicacionJavaConfig {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.cursospring");
		
		Target target = context.getBean(Target.class);
		
		target.alta("Pepito");

	}

}
