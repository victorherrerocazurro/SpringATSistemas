package com.cursospring.modelo.negocio;

import static org.junit.Assert.fail;

import org.junit.Test;

import com.cursospring.modelo.entidades.Usuario;

public class PortalParejasNegocioImplTest {

	@Test
	public void pruebaDeEncontrarUnIdeal() {
		
		//Inicializacion
		//	Sut
		PortalParejasNegocioImpl sut = new PortalParejasNegocioImpl();
		
		//TODO Aplicar SpringTest para la creacion de un Mock del UsuarioDo.
		//sut.setDao(dao);
		
		sut.buscarIdeal(new Usuario());
		
		
		
		
		fail("Not yet implemented");
	}

}
