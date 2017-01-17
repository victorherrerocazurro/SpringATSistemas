package com.cursospring.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class InicializadorWeb implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext springContext = new AnnotationConfigWebApplicationContext();
		springContext.register(ConfiguracionRest.class);//Para aplicacion que tira de la persistencia como servicio Rest (Microservicios)
		//springContext.register(Configuracion.class);//Para aplicacion MVC normal
		
		ServletRegistration servlet = servletContext.addServlet("spring", new DispatcherServlet(springContext));
		
		servlet.addMapping("/");
	}

}
