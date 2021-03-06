package com.atsistemas;

import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.JaxWsPortProxyFactoryBean;

import com.atsistemas.cliente.ClienteServicioPersonas;
import com.atsistemas.webservice.IServicioPersonas;

@Configuration
public class ConfiguracionCliente {

	@Bean
	public JaxWsPortProxyFactoryBean servicio() throws MalformedURLException{
		JaxWsPortProxyFactoryBean factoryBean = new JaxWsPortProxyFactoryBean();
		
		factoryBean.setServiceInterface(IServicioPersonas.class);
		factoryBean.setWsdlDocumentUrl(new URL("http://localhost:8080/servicioPersonas?wsdl"));
		factoryBean.setNamespaceUri("http://webservice.atsistemas.com/");
		factoryBean.setServiceName("servicioPersonas");
		factoryBean.setPortName("ServicioPersonasPort");
		
		return factoryBean;
	}
	
	@Bean
	public ClienteServicioPersonas clienteServicioPersonas(IServicioPersonas servicio){
		ClienteServicioPersonas clienteServicioPersonas = new ClienteServicioPersonas();
		clienteServicioPersonas.setServicio(servicio);
		return clienteServicioPersonas;
	}
	
}
