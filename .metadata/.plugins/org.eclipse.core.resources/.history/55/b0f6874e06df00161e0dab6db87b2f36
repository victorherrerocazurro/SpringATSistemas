package com.cursospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controlador {

	@Autowired
	private Servicio servicio;
	
	@RequestMapping(path="/",method=RequestMethod.GET)
	public String altaDeUsuario(@RequestParam String dato, Model model){
		
		String resultado = servicio.alta(dato);
		model.addAttribute("resultado", resultado);
		
		return "exito";	
	}
	
}
