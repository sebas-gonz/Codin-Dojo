package com.codingdojo.maestrodeobjetos;

public class HumanTesting {

	public static void main(String[] args) {
		
		Human sebastian = new Human();
		Human renzo = new Human();
		
		
		sebastian.attackHuman(renzo);
		
		renzo.attackHuman(sebastian);
		
		renzo.attackHuman(sebastian);
		
		System.out.println(renzo.getHealth());
		
		System.out.println(sebastian.getHealth());
		
	
	}

}
