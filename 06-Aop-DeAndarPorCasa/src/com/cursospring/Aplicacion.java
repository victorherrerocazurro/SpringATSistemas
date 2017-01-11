package com.cursospring;

public class Aplicacion {
	public static void main(String[] args) {

		Target target = Contexto.getBean(Target.class);
		
		target.metodo();
		
	}
}
