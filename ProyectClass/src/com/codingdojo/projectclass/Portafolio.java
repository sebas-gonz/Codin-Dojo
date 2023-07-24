package com.codingdojo.projectclass;

import java.util.ArrayList;
import java.util.Objects;
public class Portafolio {
	
	Project portafolios = new Project();
	

	//Crear una clase Portfolio que tendrá un Arraylist de Project 

	private ArrayList<Project> projects = new ArrayList<Project>();

	private double portafolioCost;
	
	//Agregar los métodos apropiados de getter y setter y el constructor para que funcione.

	public String getProject(String nombre) {
		
		for(int i = 0; i < projects.size(); i++) {
			if(Objects.equals(projects.get(i).getNombre(), nombre)) {
				return projects.get(i).elevatorPitch();
			}
		}
			return "No existe el projecto";
		
	
	}
	

	public void setProjects(Project object) {
		projects.add(object);
	}
	
	//Agregar el método getPortfolioCost para calcular y devolver el costo total del portafolio completo.

	public String getPortafolioCost() {
		for (int i = 0; i < projects.size(); i++) {

			portafolioCost = portafolioCost + projects.get(i).getInitialCost();

		}
		return "Los costos totales del projecto son: " + portafolioCost;

	}
	
	//Agregar el método showPortfolio que mostrará en pantalla todos los proyectos en formato elevator Pitches, seguido del costo total.
	
	public void showPortafolio() {
		for (int i = 0; i < projects.size(); i++) {
			System.out.println(projects.get(i).elevatorPitch());
			
			portafolioCost = portafolioCost + projects.get(i).getInitialCost();
		}
		System.out.println("Costo total del portafolio\n" + portafolioCost);
	}

}
