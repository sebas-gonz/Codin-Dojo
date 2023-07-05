package com.codingdojo.maestrodeobjetos;

public class Human {
	
	private int strength;
	
	private int intelligence;
	
	private int stealth;
	
	private int health;

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getStealth() {
		return stealth;
	}

	public void setStealth(int stealth) {
		this.stealth = stealth;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	public Human() {
		setStrength(3);
		setIntelligence(3);
		setStealth(3);
		setHealth(100);	
	}
	
	
	public void attackHuman(Human Object) {
		Object.setHealth(Object.getHealth() - getStrength());
		
		System.out.println("El Humano ha atacado");
		
	}

}
