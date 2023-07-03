package com.codingdojo.projectclass;


public class Project {
	
	//Crear una clase Project que tenga los campos nombre y descripcion.

	private String nombre;
	private String descripcion;
	
	 // Agregar una variable initialCost de tipo double y tenga su propio getter and setter.
	private double initialCost;
	
	//Crear una instancia de método que se llame elevatorPitch que devolverá nombre y descripcion separados por dos puntos ( : ).

	public String elevatorPitch() {
		return "Nombre "+nombre+"\n Coste inicial ("+initialCost+")"+": "+"\n Descripcion del Proyecto: " + descripcion;
	}
	
	//Sobrecargar el método constructor en tres diferentes formas:

	public Project() {

	}

	public Project(String nombre) {
		this.nombre = nombre;
	}

	public Project(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;

	}
	
	public Project(String nombre, String descripcion, double coste) {
		this.nombre = nombre;
		this.descripcion = nombre;
		initialCost = coste;
	}
	
	//Crear getter y setter para cada campo.

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getInitialCost() {
		return initialCost;
	}

	public void setInitialCost(double initialCost) {
		this.initialCost = initialCost;
	}
	
}
