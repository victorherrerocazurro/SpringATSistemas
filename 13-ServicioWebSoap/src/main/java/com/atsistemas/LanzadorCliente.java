package com.atsistemas;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.atsistemas.cliente.ClienteServicioPersonas;

public class LanzadorCliente {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfiguracionCliente.class);
		
		ClienteServicioPersonas bean = context.getBean(ClienteServicioPersonas.class);
		
		bean.metodo();

	}

}
