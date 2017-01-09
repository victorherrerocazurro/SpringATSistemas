package com.atsistemas;

public class Singleton {

	private static Singleton instance = new Singleton();
	
	private Singleton() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static Singleton getInstance(){
		return instance;
	}
	
}
