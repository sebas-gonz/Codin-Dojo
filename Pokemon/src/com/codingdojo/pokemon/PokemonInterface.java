package com.codingdojo.pokemon;

public interface PokemonInterface {
	
	Pokemon createPokemon(String name, int heatlh, String type);
	
	
	String pokemonInfo(Pokemon pokemon);
	
	void listPokemon();
	
	

}
