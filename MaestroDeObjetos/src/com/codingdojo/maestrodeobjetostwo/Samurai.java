package com.codingdojo.maestrodeobjetostwo;
import com.codingdojo.maestrodeobjetos.Human;
public class Samurai extends Human {
	
	public Samurai(String nombre) {
		setNombre(nombre);
		setHealth(200);
		
	}
	public void deathBlow(Human enemy) {
		enemy.setHealth(0);
		setHealth(getHealth()/2);
		System.out.println(getNombre()+ " asesinó a "+ enemy.getNombre());
	}
	
	public void meditation() {
		System.out.println(getNombre()+ " esta meditando, se cura " + getHealth() / 2 + " puntos de vida" );
		setHealth(getHealth() + getHealth() / 2);
	}

}
