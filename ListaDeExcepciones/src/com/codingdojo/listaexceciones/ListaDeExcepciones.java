package com.codingdojo.listaexceciones;

import java.util.Arrays;
import java.util.List;

public class ListaDeExcepciones {
	public void castANumeros(String cadena1, String cadena2, int numero, String cadena3) {

		List<Object> listaObjetos = Arrays.asList(cadena1, cadena2, numero, cadena3);

		for (int i = 0; i < listaObjetos.size(); i++) {
			try {
				int valorCasteado = Integer.parseInt((String) listaObjetos.get(i));
				listaObjetos.set(i, valorCasteado);
			} catch (java.lang.NumberFormatException e) {

				System.out.println("No se puede castear a int");

				System.out.println("Índice: " + i);

				System.out.println("Valor: " + listaObjetos.get(i));

			} catch (java.lang.ClassCastException e) {

				if (listaObjetos.get(i) instanceof Integer) {
					listaObjetos.set(i, listaObjetos.get(i));
				}

			}
		}
		System.out.println(listaObjetos);

	}
}
