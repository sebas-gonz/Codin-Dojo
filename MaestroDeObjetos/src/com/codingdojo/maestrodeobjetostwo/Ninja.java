package com.codingdojo.maestrodeobjetostwo;
import com.codingdojo.maestrodeobjetos.Human;

public class Ninja extends Human {

	public Ninja(String nombre) {
		setNombre(nombre);
		setStealth(10);
		
	}
	public void robar(Human enemy) {
		enemy.setHealth(enemy.getHealth() - getStealth());
		setHealth(getHealth() + getStealth());
		System.out.println(getNombre() + " ha robado "+ getStealth()+ " puntos de vida a "+ enemy.getNombre());
		
	}
	public void escapar() {
		setHealth(getHealth() - 10);
	}

}
