package com.codingdojo.pokemon;

public class Pokemon {
	private String name;
	private int health;
	private String type;
	private static int count;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public Pokemon(String name, int health, String type) {
		
		setName(name);
		setHealth(health);
		setType(type);
		count++;
	}
	
	void attackPokemon(Pokemon pokemon) {
		System.out.println(getName()+" ha atacado a "+ pokemon.getName());
		
		pokemon.setHealth(pokemon.getHealth() - 10);
	}
	public static int count() {
		return count;
	}
}
