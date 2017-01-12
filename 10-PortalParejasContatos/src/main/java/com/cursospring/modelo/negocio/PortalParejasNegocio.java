package com.cursospring.modelo.negocio;

import java.util.List;

import com.cursospring.modelo.entidades.Usuario;

public interface PortalParejasNegocio {

	List<Usuario> buscarUsuariosAfinesAUsuario(Usuario elQueBusca);
	Usuario buscarIdeal(Usuario elQueBusca);
	
}
