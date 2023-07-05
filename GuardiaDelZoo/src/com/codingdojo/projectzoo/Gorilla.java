package com.codingdojo.projectzoo;

public class Gorilla extends Mammal {

	// Crear una clase a parte Gorilla que puede throwSomething(), eatBananas() y
	// climb()
	private String nombre;

	public Gorilla() {
	}

	public Gorilla(String nombre) {

		this.nombre = nombre;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void throwSomething() {
		if (getEnergyLevel() >= 5) {
			System.out.println(getNombre() + " ha lanzado algo");
			setEnergyLevel(getEnergyLevel() - 5);
		} else {
			System.out.println(getNombre() + " esta cansado");
		}
	}

	public void eatBananas() {
		System.out.println(getNombre() + " esta comiendo bananas");
		setEnergyLevel(getEnergyLevel() + 10);
	}

	public void climb() {
		if (getEnergyLevel() >= 10) {
			System.out.println(getNombre() + " ha trepado un arbol");
			setEnergyLevel(getEnergyLevel() - 10);
		} else {
			System.out.println(getNombre() + " esta cansado");
		}
	}
}
