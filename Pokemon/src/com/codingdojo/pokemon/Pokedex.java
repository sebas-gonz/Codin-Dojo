package com.codingdojo.pokemon;


public class Pokedex extends AbstractPokemon {
	

	
	public void listPokemon() {
		for(int i = 0; i < listaPokemons.size(); i++) {
			System.out.println(listaPokemons.get(i).getName()+" Salud: "+listaPokemons.get(i).getHealth()+" Tipo: "+listaPokemons.get(i).getType()+ "\n");
		}
		
		
		
	}
	

}
