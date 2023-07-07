package com.codingdojo.maestrodeobjetostwo;
import com.codingdojo.maestrodeobjetos.Human;
public class Wizard extends Human {
	
	public Wizard (String nombre) {
		setNombre(nombre);
		setHealth(50);
		setIntelligence(8);
		
	}
	public void curar(Human friend) {
		friend.setHealth(friend.getHealth() + getIntelligence());
		System.out.println(getNombre() + " curo "+ getIntelligence()+ " puntos de vida a "+ friend.getNombre());
	}
	public void bolaDeFuego(Human enemy) {
		enemy.setHealth(enemy.getHealth() - getIntelligence()*3);
		System.out.println(getNombre()+ " ha lanzado una bola de fuego "+ enemy.getNombre());
	}
}
