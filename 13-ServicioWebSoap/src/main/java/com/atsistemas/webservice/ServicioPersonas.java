package com.atsistemas.webservice;

import java.util.Date;

import javax.jws.WebService;

import org.springframework.stereotype.Service;

import com.atsistemas.entidades.Persona;

@Service
@WebService(serviceName="servicioPersonas")
public class ServicioPersonas implements IServicioPersonas {

	/* (non-Javadoc)
	 * @see com.atsistemas.webservice.IServicioPersonas#crear(com.atsistemas.entidades.Persona)
	 */
	@Override
	public void crear(Persona persona){
		System.out.println(persona.getNombre());
	}
	
	/* (non-Javadoc)
	 * @see com.atsistemas.webservice.IServicioPersonas#obtener()
	 */
	@Override
	public Persona obtener(){
		return new Persona(1, "Juan", new Date());
	}
	
}
