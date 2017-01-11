package com.cursospring;

public class ProxySeguridad extends Target {
	
	private Aspecto aspecto = new Aspecto();
	
	private Target target = new Target();
	
	@Override
	public void metodo() {
		aspecto.antes();
		
		//Ejecutar la logica del Target
		target.metodo();
		
		System.out.println("Estamos en el Proxy, despues de ejecutar la logica del Target");
		
	}
}
