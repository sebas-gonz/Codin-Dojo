package com.codingdojo.maestrodeobjetostwo;

public class HumanTest {

	public static void main(String[] args) {
		Wizard kassay = new Wizard("Kassadin");
		Ninja yahiko = new Ninja("Yahiko");
		Samurai hojo = new Samurai ("Hojo");
		Wizard merlin = new Wizard("Merlin");
		
		hojo.deathBlow(kassay);
		
		System.out.println("La vida de hojo es " +hojo.getHealth());
		
		hojo.meditation();
		
		System.out.println("La vida de hojo es " +hojo.getHealth());
		
		yahiko.robar(hojo);
		
		System.out.println("La vida de "+ yahiko.getNombre()+ " es "+ yahiko.getHealth());
		
		System.out.println("La vida de hojo es " +hojo.getHealth());
		
		merlin.curar(kassay);
		
		System.out.println("La vida de "+ kassay.getNombre()+ " es "+kassay.getHealth());
		
		kassay.bolaDeFuego(hojo);
		
		System.out.println("La vida de hojo es " +hojo.getHealth());

	}

}
