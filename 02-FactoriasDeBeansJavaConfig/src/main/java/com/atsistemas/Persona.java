package com.atsistemas;

public class Persona {

	private String nombre;
	private Persona pareja;
	
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Persona(String nombre, Persona pareja) {
		super();
		this.nombre = nombre;
		this.pareja = pareja;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Persona getPareja() {
		return pareja;
	}
	public void setPareja(Persona pareja) {
		this.pareja = pareja;
	}
	
	
	
}
