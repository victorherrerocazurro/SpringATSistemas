package com.simpson;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class InicializadorContextoWeb implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
				
		//Definicion de contexto de spring para aplicacion servicios rest
		
		AnnotationConfigWebApplicationContext springContextRest = new AnnotationConfigWebApplicationContext();
		springContextRest.scan("com.simpson");
		
		Dynamic servletRest = servletContext.addServlet("springRest", new DispatcherServlet(springContextRest));
		
		servletRest.addMapping("/rest/*");
		servletRest.setLoadOnStartup(1);
	}

}
