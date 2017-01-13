package com.cursospring.controlador;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.cursospring.modelo.entidades.Usuario;

public class MiPropioValidador implements Validator {

	public boolean supports(Class<?> arg0) {
		return arg0.equals(Usuario.class);
	}

	public void validate(Object arg0, Errors arg1) {		
		Usuario usuario = (Usuario) arg0;
		
		if(usuario.getNombre().equals(usuario.getPassword())){
			arg1.rejectValue("password", "usuario.password.igualanombre", "Al no encontrar el mensaje de error, te muestro este, no puedes poner igual nombre que password");
		}
	}
}
