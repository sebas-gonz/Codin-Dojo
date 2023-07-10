package com.codingdojo.pokemon;

public class PokemonTesting {

	public static void main(String[] args) {
		
		Pokemon charizard = new Pokemon("Charizard",100, "Fuego");
		
		Pokedex pokedex = new Pokedex();
		
		pokedex.createPokemon(charizard.getName(), charizard.getHealth(), charizard.getType());
		
		Pokemon bulbasur = new Pokemon("Bulbasur",100,"Planta, veneno");
		
		pokedex.createPokemon(bulbasur.getName(), bulbasur.getHealth(), bulbasur.getType());
		
		pokedex.listPokemon();
		
		charizard.attackPokemon(bulbasur);
		
		System.out.println(pokedex.pokemonInfo(bulbasur));

	}

}
