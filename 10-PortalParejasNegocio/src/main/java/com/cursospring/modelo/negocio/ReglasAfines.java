package com.cursospring.modelo.negocio;

import com.cursospring.modelo.entidades.Usuario;

public interface ReglasAfines {

	boolean sonAfines(Usuario elQueBusca, Usuario candidato);

}