package com.codingdojo.projectzoo;

public class Mammal {

	// Crear una clase Mammal que tenga un energyLevel y un método desiplayEnergy().
	
	private int energyLevel;
	
	public Mammal() {
		this.energyLevel = 100;
	}
	
	// El método displayEnergy() debe imprimir el nivel de energía del animal y
		// devolverlo.

	public int displayEnergy() {

		System.out.println("La energia actual es: "+ this.energyLevel + "\n");	
		return this.energyLevel;
	}

	public int getEnergyLevel() {
		return energyLevel;
	}

	public int setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
		return this.energyLevel;
	}

}
