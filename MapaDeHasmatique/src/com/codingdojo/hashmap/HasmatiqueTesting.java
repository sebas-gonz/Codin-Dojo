package com.codingdojo.hashmap;

public class HasmatiqueTesting {

	public static void main(String[] args) {
		String cancion = "Cancion";
		String letra = "Letra";

		// Crear un trackList de tipo HashMap.

		Hashmatique hashMap = new Hashmatique(cancion, letra);

		// Agregar al menos 4 canciones que estén almacenadas por título.
		cancion = "\r \n  Lake of fire";
		letra = "\r \n Where do bad folks go when they die?\r\n They don t go to Heaven where the angels fly\r\n They go to the lake of fire and fry\r\n See em again til the fourth of July!";

		hashMap.canciones(cancion, letra);
		
		cancion = "\r \n  Turnaround";
		letra = "\r \n Take a step out of yourself\r\n And you turn around\r\n Take a look at who you are\r\n It s pretty scary";
		
		hashMap.canciones(cancion, letra);
		
		cancion = "\r \n  Last nite";
		letra = "\r \n Last night she said Oh, baby, I feel so down\r\n Oh, it turn' me off when I feel left out\r\n So I, I turned round\r\n Oh, baby, don t care no more \r\n I know this for sure, I m walking out that door";

		hashMap.canciones(cancion, letra);
		
		cancion = "\r \n Muevan Las industrias";
		letra = "\r \n Están paradas esperando a las manos que decidan hacer andar\r\n La neblina las rodea y las oxida y ya piensan en petrificar\r\n Las industrias\r\n Muevan las industrias\r\n Las industrias\r\n Muevan las industrias";
		
		hashMap.canciones(cancion, letra);
		
		// Extraer una canción por su título.
		
		hashMap.extraerCanciones("\r \n Muevan Las industrias");
		
		//Imprimir todos los nombres de las pistas y las letras en un formato Track: Lyrics.
		hashMap.listaCompleta();
	}

}
