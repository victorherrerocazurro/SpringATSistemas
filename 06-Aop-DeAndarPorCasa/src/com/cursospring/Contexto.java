package com.cursospring;

public class Contexto {

	public static Target getBean(Class<Target> class1) {
		// Aqui es donde el contexto, decide por la configuracion, que no ha de
		//retornar una instancia de Target, sino que retorna una instancia de 
		//ProxySeguridad
		//return new ProxySeguridad();
		return new Target();
	}

}