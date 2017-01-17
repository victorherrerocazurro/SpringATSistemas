package com.cursospring.modelo.negocio;

import com.cursospring.modelo.entidades.Usuario;

public interface ReglasIdeal {

	boolean sonIdeales(Usuario elQueBusca, Usuario candidato);

}