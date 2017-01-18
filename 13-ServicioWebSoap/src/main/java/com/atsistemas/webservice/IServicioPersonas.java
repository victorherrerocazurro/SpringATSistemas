package com.atsistemas.webservice;

import javax.jws.WebService;

import com.atsistemas.entidades.Persona;

@WebService
public interface IServicioPersonas {

	void crear(Persona persona);

	Persona obtener();

}