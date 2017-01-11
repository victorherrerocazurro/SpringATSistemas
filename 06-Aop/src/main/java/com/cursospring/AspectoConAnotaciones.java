package com.cursospring;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectoConAnotaciones {

	@Before("execution(* com.cursospring.Target.alta(String))")
	public void antes(){
		System.out.println("Estamos en el aspecto antes de ejecutar la funcionalidad");
	}
	
}
