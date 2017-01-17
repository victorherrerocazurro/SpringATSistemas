package com.cursospring.modelo.servicio;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cursospring.modelo.entidades.Usuario;
import com.cursospring.modelo.negocio.PortalParejasNegocio;

@Service
public class PortalParejasServicioClienteServicioRestPersistencia implements PortalParejasServicio {

	@Autowired
	private PortalParejasNegocio negocio;
	
	public void registrar(Usuario usuario) {
		try {
			new RestTemplate().postForEntity(new URI("http://localhost:8080/10-PortalParejasPersistenciaRest/rest/Usuarios"), usuario, Usuario.class);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	public Usuario loguear(String nombre, String password) {
		Map<String, String> variables = new HashMap<String, String>();
		variables.put("nombre", nombre);
		variables.put("password", password);
		return new RestTemplate().postForEntity(
				"http://localhost:8080/10-PortalParejasPersistenciaRest/rest/Usuarios/ConsultaPorNombreYPassword?nombre={nombre}&password={password}", 
				null, 
				Usuario.class,
				variables).getBody();
	}

	public List<Usuario> buscarAfin(Usuario elQueBusca) {
		return negocio.buscarUsuariosAfinesAUsuario(elQueBusca);
	}

	public Usuario buscarIdeal(Usuario elQueBusca) {
		return negocio.buscarIdeal(elQueBusca);
	}

}
