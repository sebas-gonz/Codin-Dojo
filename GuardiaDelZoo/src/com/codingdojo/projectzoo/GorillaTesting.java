package com.codingdojo.projectzoo;

public class GorillaTesting {

	public static void main(String[] args) {
		//Crear una clase GorillaTest, para instanciar al gorila y hacer que lance algo tres veces, coma bananos dos veces y trepe a un árbol una vez.
		
		Gorilla gorilla = new Gorilla("Cesar");
		
		
		gorilla.throwSomething();
		gorilla.throwSomething();
		gorilla.throwSomething();
		
		gorilla.eatBananas();
		gorilla.eatBananas();
		
		gorilla.climb();
		
		gorilla.displayEnergy();
		
		
		
		

	}

}
