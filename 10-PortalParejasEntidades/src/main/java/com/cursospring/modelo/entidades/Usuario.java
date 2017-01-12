package com.cursospring.modelo.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Access(AccessType.FIELD)
public class Usuario implements Serializable{

	@Id
	private String nombre;
	private String password;
	private float altura;
	private Date fechaNacimiento;
	private String genero;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Usuario(String nombre, String password, float altura, Date fechaNacimiento, String genero) {
		super();
		this.nombre = nombre;
		this.password = password;
		this.altura = altura;
		this.fechaNacimiento = fechaNacimiento;
		this.genero = genero;
	}
	public Usuario() {
		super();
	}
	public Usuario(String nombre, String password) {
		super();
		this.nombre = nombre;
		this.password = password;
	}
}
