package com.codingdojo.pokemon;

import java.util.ArrayList;

public abstract class AbstractPokemon implements PokemonInterface {
	private static int myPokemons;
	ArrayList<Pokemon> listaPokemons = new ArrayList<Pokemon>();

	public Pokemon createPokemon(String name, int health, String type) {
		Pokemon pokemon = new Pokemon(name,health, type);
		myPokemons++;
		
		listaPokemons.add(pokemon);
		
		
		return pokemon;
		
	}
	
	public static int getMyPokemons() {
		return myPokemons;
	}
		
	
	
	public String pokemonInfo(Pokemon pokemon) {
		
		return pokemon.getName()+ " Salud " +pokemon.getHealth()+ " Tipo " + pokemon.getType();
		
	}

}
