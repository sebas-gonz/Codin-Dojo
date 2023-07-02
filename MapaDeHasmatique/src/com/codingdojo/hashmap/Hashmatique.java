package com.codingdojo.hashmap;

import java.util.HashMap;
import java.util.Set;

public class Hashmatique {

	// Crear un HashMap para almacenar las canciones

	HashMap<String, String> trackList;

	public Hashmatique(String cancion, String letra) {
		this.trackList = new HashMap<String, String>();
	}

	public void canciones(String cancion, String letra) {
		trackList.put(cancion, letra);
	}

	// Extraer una canción por su título

	public void extraerCanciones(String cancion) {
		if (cancion != null) {
			System.out.println("Letra de " + cancion + ": " + trackList.get(cancion));
		} else {
			System.out.println("La canción no se encontró en el trackList.");
		}
	}

	// Imprimir todos los nombres de las pistas y las letras

	public void listaCompleta(){
		Set<String> titulos = trackList.keySet();
		for (String titulo: titulos){

			System.out.println(titulo);
			System.out.println(trackList.get(titulo));
		}
	}		
}
