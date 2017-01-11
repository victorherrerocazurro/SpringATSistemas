package com.atsistemas;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.atsistemas.entidades.Cliente;
import com.atsistemas.persistencia.ClienteDao;

public class AplicacionJpa {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfiguracionJpa.class);
		
		ClienteDao dao = context.getBean(ClienteDao.class);
		
		dao.alta(new Cliente(3, "Victor"));
		dao.alta(new Cliente(4, "Juan"));
		
		Cliente clienteUno = dao.consultaPorPk(1);
		
		System.out.println(clienteUno.getNombre());
		
	}

}
