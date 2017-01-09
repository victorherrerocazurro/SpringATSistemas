package com.atsistemas.entidades;

public class Contrato {

	//Referencia a la dependencia
	private Persona persona;

	//Inyeccion por contruccion (normalmente cuando existe la necesidad imperiosa de la dependencia para que el bean realice su trabajo)
	public Contrato(Persona persona) {
		super();
		this.persona = persona;
	}

	public Persona getPersona() {
		return persona;
	}

	//Inyeccion por setter
	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@Override
	public String toString() {
		return "Contrato [persona=" + persona.getNombre() + "]";
	}
	
	
	
	
	
}
