package com.cursospring.modelo.negocio;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.cursospring.modelo.entidades.Usuario;

@Component
public class PortalParejasNegocioClienteServicioRestPersistencia implements PortalParejasNegocio{

	@Autowired
	private ReglasAfines reglasAfines;
	
	@Autowired
	private ReglasIdeal reglasIdeal;
	
	public List<Usuario> buscarUsuariosAfinesAUsuario(Usuario elQueBusca) {
		List<Usuario> candidatos;
		try {
			candidatos = (List<Usuario>) new RestTemplate().getForEntity(new URI("http://localhost:8080/10-PortalParejasPersistenciaRest/rest/Usuarios"), List.class);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		List<Usuario> afines = new LinkedList<Usuario>();
		for (Usuario candidato : candidatos) {
			if(reglasAfines.sonAfines(elQueBusca, candidato)){
				afines.add(candidato);
			}
		}
		return afines;
	}

	public Usuario buscarIdeal(Usuario elQueBusca) {
		List<Usuario> candidatos;
		try {
			candidatos = (List<Usuario>) new RestTemplate().getForEntity(new URI("http://localhost:8080/10-PortalParejasPersistenciaRest/rest/Usuarios"), List.class);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		for (Usuario candidato : candidatos) {
			if(reglasIdeal.sonIdeales(elQueBusca, candidato)){
				return candidato;
			}
		}
		return null;
	}

}
