package com.cursospring.modelo.servicio;

import java.util.List;

import com.cursospring.modelo.entidades.Usuario;

public interface PortalParejasServicio {

	void registrar(Usuario usuario);
	Usuario loguear(String nombre, String password);
	List<Usuario> buscarAfin(Usuario elQueBusca);
	Usuario buscarIdeal(Usuario elQuebusca);
	
}
