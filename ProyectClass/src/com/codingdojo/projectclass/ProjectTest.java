package com.codingdojo.projectclass;

public class ProjectTest {

	public static void main(String[] args) {

		Project iLearn = new Project();

		iLearn.setNombre("iLearn");
		
		iLearn.setInitialCost(2500.0);

		iLearn.setDescripcion(" Una plataforma educativa en línea que ofrece cursos interactivos en una amplia variedad de temas.");

		System.out.println(iLearn.elevatorPitch());
		
		
		

		Project foodExplorer = new Project("Food Explorer");
		
		foodExplorer.setInitialCost(3500.0);

		foodExplorer.setDescripcion(" Una plataforma en línea donde los amantes de la comida pueden descubrir nuevos restaurantes, compartir reseñas, recomendar platos y conectarse con otros entusiastas de la gastronomía.");
		
		System.out.println(foodExplorer.elevatorPitch());
		
	

	

		Project x = new Project("Fiesta de cumpleaños","Preparacion de una fiesta de cumpleaños sorpresa para Sebastian, con más de 2000 invitados!");
		
		x.setInitialCost(10000.0);

		System.out.println(x.elevatorPitch());
		
		
		
		Portafolio portafolio = new Portafolio();
		
		portafolio.setProjects(foodExplorer);
		
		portafolio.setProjects(x);
		
		portafolio.setProjects(iLearn);
		
		
		
		System.out.println(portafolio.getPortafolioCost());
		
		portafolio.showPortafolio();
		
		System.out.println(portafolio.getProject("Fiesta de cumpleaños"));
		

		

	}

}
