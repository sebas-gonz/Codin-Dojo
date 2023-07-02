package com.codingdojo.rompecabezas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PuzzleJava {
	// 1. Crear un arreglo con los siguientes valores: 3,5,1,2,7,9,8,13,25,32.
	// Imprimir la suma de todos los números en el arreglo. El método también debe
	// retornar un arreglo que incluya solo los números que son mayores a 10 (Por
	// ejemplo cuando envía el arreglo anterior, debe retornar un arreglo con los
	// valores de 13,25,32).

	public ArrayList<Integer> sumaValores() {
		List<Integer> arreglo = Arrays.asList(3, 5, 1, 2, 7, 9, 8, 13, 25, 32);
		ArrayList<Integer> mayorQue = new ArrayList<Integer>();

		int sum = 0;

		for (int i = 0; i < arreglo.size(); i++) {
			sum = sum + arreglo.get(i);
			if (arreglo.get(i) > 10) {
				mayorQue.add(arreglo.get(i));
			}
		}
		System.out.println(sum);
		return mayorQue;

	}

	// 2. Crear un arreglo con los siguientes valores: Nancy, Jinichi, Fujibayashi,
	// Momochi, Ishikawa. Mezcle el arreglo e imprima el nombre de cada persona.
	// Haga que el método también devuelva un arreglo con los nombres que tienes más
	// de 5 caracteres.

	public ArrayList<String> nombresAleatorios() {
		List<String> nombres = Arrays.asList("Nancy", "Jinichi", "FujiBanashi", "Momochi", "Ishikawa");
		ArrayList<String> nombresLargos = new ArrayList<String>();

		for (int i = 0; i < nombres.size(); i++) {
			if (nombres.get(i).length() > 5) {
				nombresLargos.add(nombres.get(i));

			}
		}
		Collections.shuffle(nombres);
		System.out.println(nombres);
		return nombresLargos;
	}

	// 3. Crear un arreglo que contiene las 26 letras del alfabeto (este arreglo
	// debe tener 26 valores). Mezcle el arreglo y, después de mezclarlo, imprima la
	// última letra del arreglo. También debe imprimir la primera letra del arreglo.
	// Si la primera letra del arreglo es una vocal, haga que muestre un mensaje.

	public void desordenAlfabetico() {
		List<Character> abecedario = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
				'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');

		Collections.shuffle(abecedario);

		System.out.println("La ultima letra es: " + abecedario.get(abecedario.size() - 1));

		if (abecedario.get(0) == 'a' || abecedario.get(0) == 'e' || abecedario.get(0) == 'i' || abecedario.get(0) == 'o'
				|| abecedario.get(0) == 'u') {
			System.out.println("La primera letra es una vocal");

		} else {
			System.out.println("La primera letra es: " + abecedario.get(0));

		}
	}

	// 4. Generar y devolver un arreglo con 10 números aleatorios entre 55 - 100.

	public List<Integer> numerosAleatorios() {

		List<Integer> numAleatorios = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			numAleatorios.add((int) (Math.random() * (100 - 55 + 1) + 55));
		}
		return numAleatorios;
	}

	// 5. Generar y devolver un arreglo con 10 números aleatorios entre 55 - 100 y
	// hacer que estén ordenados (mostrar el número más pequeño en el principio del
	// arreglo). Imprimir todos los números del arreglo. Luego, Imprimir el valor
	// mínimo del arreglo, así como el valor máximo.

	public String numerosRandomOrdenados() {
		int[] numAleatorio = new int[10];
		for (int i = 0; i < numAleatorio.length; i++) {
			numAleatorio[i] = ((int) (Math.random() * (100 - 55 + 1) + 55));
		}
		Arrays.sort(numAleatorio);

		System.out.println(Arrays.toString(numAleatorio));

		int max = numAleatorio[0];
		int min = numAleatorio[0];

		for (int i = 0; i < numAleatorio.length; i++) {
			if (numAleatorio[i] > max) {
				max = numAleatorio[i];
			} else if (numAleatorio[i] < min) {
				min = numAleatorio[i];
			}
		}
		System.out.println("El numero minimo es: " + min);
		System.out.println("El numero maximo es: " + max);

		return Arrays.toString(numAleatorio);
	}

	// 6. Crear una cadena aleatoria con 5 caracteres de longitud.

	public void cadenaAleatoria() {

		String caracteres = "qwetiyhmgmvnhxdfldeotpultyjdebacswhre´+{}ñ´6432e4032838<zwe";

		String cadena = "";

		for (int i = 0; i < 5; i++) {

			int numeroAleatorio = ((int) (Math.random() * (caracteres.length() + 1)));

			char caracterRandom = caracteres.charAt(numeroAleatorio);

			cadena = cadena + caracterRandom;
		}
		System.out.println(cadena);
	}

	// 7. Generar un arreglo con 10 cadenas aleatorias y cada una con 5 caracteres
	// de longitud.

	public void arrStringRandom() {
		
		Random numAleatorio = new Random();
		
		String[] cadenasRandom = new String[10];

		String caracteres2 = "qwetiyhmgmvnhxdfldeotpultyjdebacswhrdkjfhdsskfjl4390trerj34lfñdcdslfm3042eowjworñfjdlksfwlrtqlñwfelwkñfjqwlñk";
		

		for (int i = 0; i < cadenasRandom.length; i++) {
			cadenasRandom[i] = "";

			for (int z = 0; z < 5; z++) {

				int numeroAleatorio = numAleatorio.nextInt(caracteres2.length());

				char caracterRandom = caracteres2.charAt(numeroAleatorio);

				cadenasRandom[i] = cadenasRandom[i] + caracterRandom;

			}
		}
		System.out.println(Arrays.toString(cadenasRandom));
	}
}
