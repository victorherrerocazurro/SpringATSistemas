package com.simpson.entidades;

import java.io.Serializable;
import java.util.List;

public class Character implements Serializable{
	private String id;
	private String nombre;
	private int edad;
	//private Character padre;
	//private Character madre;
	//private Character[] hijos;
	//private Character[] hermanos;
	private String idPadre;
	private String idMadre;
	private List<String> idsHijos;
	private List<String> idsHermanos;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getIdPadre() {
		return idPadre;
	}
	public void setIdPadre(String idPadre) {
		this.idPadre = idPadre;
	}
	public String getIdMadre() {
		return idMadre;
	}
	public void setIdMadre(String idMadre) {
		this.idMadre = idMadre;
	}
	public List<String> getIdsHijos() {
		return idsHijos;
	}
	public void setIdsHijos(List<String> idsHijos) {
		this.idsHijos = idsHijos;
	}
	public List<String> getIdsHermanos() {
		return idsHermanos;
	}
	public void setIdsHermanos(List<String> idsHermanos) {
		this.idsHermanos = idsHermanos;
	}
	public Character(String id, String nombre, int edad, String idPadre, String idMadre, List<String> idsHijos,
			List<String> idsHermanos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.idPadre = idPadre;
		this.idMadre = idMadre;
		this.idsHijos = idsHijos;
		this.idsHermanos = idsHermanos;
	}
	public Character() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Character other = (Character) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
