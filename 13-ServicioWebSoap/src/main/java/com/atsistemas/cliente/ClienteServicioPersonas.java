package com.atsistemas.cliente;

import com.atsistemas.entidades.Persona;
import com.atsistemas.webservice.IServicioPersonas;

public class ClienteServicioPersonas {

	private IServicioPersonas servicio;
	
	public void setServicio(IServicioPersonas servicio) {
		this.servicio = servicio;
	}

	public void metodo(){
		Persona persona = servicio.obtener();
		
		System.out.println("Persona obtenida del servicio: " + persona.getNombre());
		
		persona.setNombre("Juan Ramon");
		
		servicio.crear(persona);
	}
	
}
