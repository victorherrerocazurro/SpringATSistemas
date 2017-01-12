package com.cursospring.modelo.negocio;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cursospring.modelo.entidades.Usuario;
import com.cursospring.modelo.persistencia.UsuarioDao;

@Component
public class PortalParejasNegocioImpl implements PortalParejasNegocio {

	@Autowired
	private UsuarioDao dao;
	
	public void setDao(UsuarioDao dao) {
		this.dao = dao;
	}

	public Usuario buscarIdeal(Usuario arg0) {
		List<Usuario> candidatos = dao.findAll();
		//TODO algoritmo de comporbacion ideal
		return null;
	}

	public List<Usuario> buscarUsuariosAfinesAUsuario(Usuario arg0) {
		List<Usuario> candidatos = dao.findAll();
		List<Usuario> afines = new LinkedList<Usuario>();
		//TODO algoritmo de comprobacion afin
		return afines;
	}

}
