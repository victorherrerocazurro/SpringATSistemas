package com.cursospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Servicio {

	@Autowired
	private IPersistencia persistencia;
	
	public String alta(String dato){
		long identificador = persistencia.salvar(dato);
		return identificador + sufijo();
	}
	
	private String sufijo(){
		return "User";
	}
	
}
