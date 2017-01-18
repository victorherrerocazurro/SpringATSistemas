package com.atsistemas.entidades;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Persona {
	private int id;
	private String nombre;
	private Date fecha;
	public Persona(int id, String nombre, Date fecha) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fecha = fecha;
	}
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	@XmlElement(name="identificador")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}
