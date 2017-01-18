package com.atsistemas.negocio;

import org.springframework.stereotype.Component;

@Component
public class Negocio {

	public int sumarEnteros(int a, int b){
		return a + b;
	}
	
	public int restarEnteros(int a, int b){
		return a - b;
	}
	
}
