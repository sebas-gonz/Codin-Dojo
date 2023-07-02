package com.codingdojo.ejerciciosbasicos;

import java.util.ArrayList;
import java.util.Arrays;

public class BasicsJava {

	ArrayList<Integer> y = new ArrayList<Integer>();
	ArrayList<Integer> arreglo = new ArrayList<Integer>();

	// 1. Escriba un método que imprima todos los número del 1 al 255

	public void print255() {
		for (int i = 1; i <= 255; i++) {
			System.out.println(i);
		}
	}

	// 2. Escriba un método que imprima todos los número impares entre el 1 al 255.

	public void printImparTo255() {
		for (int i = 1; i <= 255; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

	// 3. Escriba un método que imprima los números desde el 0 hasta el 255, pero
	// esta vez muestre también las suma de los números que ha mostrado en pantalla
	// hasta ahora

	public void printsuma() {
		int suma = 0;
		for (int i = 0; i <= 255; i++) {
			suma = suma + i;
			System.out.println("Nuevo numero: " + i + " Suma: " + suma);
		}
	}

	// 4. Dado un arreglo X, digamos [1,3,5,7,9,13], escriba un método que recorra
	// cada uno de los elementos del arreglo e imprima cada valor
	// Ser capaz de recorrer cada elemento de un arreglo es extremadamente
	// importante.

	public void valueaArr(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("El indice: " + i + " del arreglo: " + Arrays.toString(array) + " es: " + array[i]);
		}
	}

	// 5. Escribir un método que tome un arreglo e imprima el valor máximo en el
	// arreglo. Su método debería funcionar también con todos los números en
	// negativo (ejemplo [-3,-5,-7]), o incluso una mezcla de números positivos,
	// números negativos y cero.

	public void valueMax(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("El valor maximo del arreglo: " + Arrays.toString(array) + " es: " + max);
	}

	// 6. Escribir un método que tome un arreglo e imprima el promedio de los
	// valores en el arreglo. Por ejemplo en un arreglo hay [2,10,3], su método
	// debería Imprimir “Promedio de 5”. Nuevamente, asegúrese de crear un caso
	// simple y escriba las instrucciones para resolver ese caso primero, luego
	// pruebe sus instrucciones con casos más complicados.

	public void printAvg(int[] array) {
		int total = 0;
		for (int i = 0; i < array.length; i++) {
			total = total + array[i];
		}
		System.out.println( "El promedio es: " + total / array.length);
	}

	// 7. Escribir un método que cree un arreglo ‘y’ que contenga todos los números
	// impares entre 1 - 255. Cuando el método haya terminado, ‘y’ debe tener los
	// valores de [1,3,5,7…255].

	public void arrImpar() {
		for (int i = 0; i <= 255; i++)
			if (i % 2 != 0) {
				y.add(i);
			}
		System.out.println(y);
	}

	// 8. Escribir un método que tome un arreglo y devuelva el número de valores
	// mayores a un valor Y dado. Por ejemplo, si el arreglo es [1,3,5,7] y Y = 3,
	// después de terminar el proceso el método debe Imprimir el número 2 (ya que
	// hay 2 valores en el arreglo que son mayores que 3).

	public String printBiggerThan(int[] array, int Y) {
		int contador = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > Y) {
				contador++;
			}
		}
		return "Los valores mayores que: " + Y + " En el arreglo: " + Arrays.toString(array) + " Son: " + contador;
	}

	// 9. Dado cualquier arreglo x, digamos [1,5,10,-2], escribir un método que
	// multiplique cada valor en el arreglo por sí mismo. Cuando el método haya
	// terminado, el arreglo x debe contener valores que han sido elevados al
	// cuadrado, digamos [1,25,100,4]

	public void arrSquare(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = array[i] * array[i];
		}
		System.out.println(Arrays.toString(array));
	}

	// 10. Dado un arreglo x, digamos [1,5,10,-2], escribir un método que reemplace
	// cualquier número negativo por 0. Cuando el método haya terminado, x no debe
	// tener valores negativos, digamos como [1,5,10,0].
	
	public void noNegative(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if(array[i] < 0) {
				array[i] = 0;
			}
		}
		System.out.println(Arrays.toString(array));
	}
	
	// 11. Dado un arreglo x, digamos [1,5,10,-2], escribir un método que devuelva
	// un arreglo con el número máximo, el número mínimo y el valor promedio que hay
	// en el arreglo x. El arreglo devuelto debe contener solo 3 valores [Max, Min,
	// Prom].
	
	public void printMaxMinProm(int[] array) {
		int max = array[0];
		int min = array[0];
		int prom = 0;
		
		for(int i = 1; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
			else if(array[i] < min) {
				min = array[i];
			}
			prom = prom + array[i];
		}
		prom = prom/array.length;
		arreglo.add(max);
		arreglo.add(min);
		arreglo.add(prom);
		
		System.out.println(arreglo);
	}
	
	// 12. Dado un arreglo x, digamos [1,5,10,7,-2], escribir un método que cambie
			// cada valor por el valor que sigue. Por ejemplo, cuando el método haya
			// terminado, un arreglo x [1,5,10,7,-2] se convertirá en [5,10,7,-2,0]. Observe
			// que el último número es 0. El método no necesita ajustarse para los valores
			// que están fuera de los límites.
	
	public void cambiarValores(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[arr.length-1] = 0;
		System.out.println(Arrays.toString(arr));
	}
}