package com.codingdojo.projectzootwo;
import com.codingdojo.projectzoo.Mammal;

public class Bat extends Mammal {
	
	public Bat() {
		setEnergyLevel(300);
	}
	
	public void fly() {
		if(getEnergyLevel() >= 50) {
		System.out.println("*Alas moviendose* \n");
		setEnergyLevel(getEnergyLevel() - 50);
		}
		else {
			System.out.println("No hay energia \n");
		}
	}
	
	public void eatHumans() {
		if(getEnergyLevel() >= 300) {
			System.out.println("El Murcielago esta saciado \n");
		}
		else {
		System.out.println("Comiendo humanos* \n");
		setEnergyLevel(getEnergyLevel() + 25);
		}
	}
	
	public void attackTown() {
		if(getEnergyLevel() >= 100){
		System.out.println("ciudad en llamas \n");
		setEnergyLevel(getEnergyLevel() - 100);
		}
		else {
			System.out.println("No hay energia \n");
		}
	}

}
