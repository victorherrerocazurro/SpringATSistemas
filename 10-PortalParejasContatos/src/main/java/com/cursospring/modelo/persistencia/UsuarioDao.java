package com.cursospring.modelo.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursospring.modelo.entidades.Usuario;

public interface UsuarioDao extends JpaRepository<Usuario, String>{
	
	Usuario findByNombreAndPassword(String nombre, String password);
	
}
