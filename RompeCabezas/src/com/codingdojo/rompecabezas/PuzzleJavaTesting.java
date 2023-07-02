package com.codingdojo.rompecabezas;

public class PuzzleJavaTesting {
	public static void main(String[] args) {
		
		
		PuzzleJava puzzleTesting = new PuzzleJava();
		
		
		// 1. Crear un arreglo con los siguientes valores: 3,5,1,2,7,9,8,13,25,32.
		// Imprimir la suma de todos los números en el arreglo. El método también debe
		// retornar un arreglo que incluya solo los números que son mayores a 10 (Por
		// ejemplo cuando envía el arreglo anterior, debe retornar un arreglo con los
		// valores de 13,25,32).

		System.out.println(puzzleTesting.sumaValores());
		
		//2. Crear un arreglo con los siguientes valores: Nancy, Jinichi, Fujibayashi,
		// Momochi, Ishikawa. Mezcle el arreglo e imprima el nombre de cada persona.
		// Haga que el método también devuelva un arreglo con los nombres que tienes más
		// de 5 caracteres.
		
		System.out.println(puzzleTesting.nombresAleatorios());
		
		
		// 3. Crear un arreglo que contiene las 26 letras del alfabeto (este arreglo
		// debe tener 26 valores). Mezcle el arreglo y, después de mezclarlo, imprima la
		// última letra del arreglo. También debe imprimir la primera letra del arreglo.
		// Si la primera letra del arreglo es una vocal, haga que muestre un mensaje.
		
		puzzleTesting.desordenAlfabetico();
		
		// 4. Generar y devolver un arreglo con 10 números aleatorios entre 55 - 100.
		
		System.out.println(puzzleTesting.numerosAleatorios());
		
		// 5. Generar y devolver un arreglo con 10 números aleatorios entre 55 - 100 y
		// hacer que estén ordenados (mostrar el número más pequeño en el principio del
		// arreglo). Imprimir todos los números del arreglo. Luego, Imprimir el valor
		// mínimo del arreglo, así como el valor máximo.
		
		puzzleTesting.numerosRandomOrdenados();
		
		//6. Crear una cadena aleatoria con 5 caracteres de longitud.
		
		puzzleTesting.cadenaAleatoria();
		
		// 7. Generar un arreglo con 10 cadenas aleatorias y cada una con 5 caracteres
		// de longitud.
		
		puzzleTesting.arrStringRandom();
	}

}
