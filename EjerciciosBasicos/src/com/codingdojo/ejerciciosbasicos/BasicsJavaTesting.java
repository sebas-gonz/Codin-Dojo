package com.codingdojo.ejerciciosbasicos;

public class BasicsJavaTesting {

	public static void main(String[] args) {

		BasicsJava javabasico = new BasicsJava();

		// 1. Escriba un método que imprima todos los número del 1 al 255

		javabasico.print255();

		// 2. Escriba un método que imprima todos los número impares entre el 1 al 255.

		javabasico.printImparTo255();

		// 3. Escriba un método que imprima los números desde el 0 hasta el 255, pero
		// esta vez muestre también las suma de los números que ha mostrado en pantalla
		// hasta ahora.

		javabasico.printsuma();

		// 4. Dado un arreglo X, digamos [1,3,5,7,9,13], escriba un método que recorra
		// cada uno de los elementos del arreglo e imprima cada valor
		// Ser capaz de recorrer cada elemento de un arreglo es extremadamente
		// importante.

		int[] arrX = { 1, 3, 5, 7, 9, 10 };
		javabasico.valueaArr(arrX);

		// 5. Escribir un método que tome un arreglo e imprima el valor máximo en el
		// arreglo. Su método debería funcionar también con todos los números en
		// negativo (ejemplo [-3,-5,-7]), o incluso una mezcla de números positivos,
		// números negativos y cero.

		int[] arrX2 = { -3, -5, -7 };
		javabasico.valueMax(arrX2);

		// 6. Escribir un método que tome un arreglo e imprima el promedio de los
		// valores en el arreglo. Por ejemplo en un arreglo hay [2,10,3], su método
		// debería Imprimir “Promedio de 5”. Nuevamente, asegúrese de crear un caso
		// simple y escriba las instrucciones para resolver ese caso primero, luego
		// pruebe sus instrucciones con casos más complicados.

		int[] arrX3 = { 2, 10, 3 };
		javabasico.printAvg(arrX3);

		// 7. Escribir un método que cree un arreglo ‘y’ que contenga todos los números
		// impares entre 1 - 255. Cuando el método haya terminado, ‘y’ debe tener los
		// valores de [1,3,5,7…255].

		javabasico.arrImpar();

		// 8. Escribir un método que tome un arreglo y devuelva el número de valores
		// mayores a un valor Y dado. Por ejemplo, si el arreglo es [1,3,5,7] y Y = 3,
		// después de terminar el proceso el método debe Imprimir el número 2 (ya que
		// hay 2 valores en el arreglo que son mayores que 3).

		int[] arrX4 = { 1, 3, 5, 7 };
		int Y = 3;
		javabasico.printBiggerThan(arrX4, Y);

		// 9. Dado cualquier arreglo x, digamos [1,5,10,-2], escribir un método que
		// multiplique cada valor en el arreglo por sí mismo. Cuando el método haya
		// terminado, el arreglo x debe contener valores que han sido elevados al
		// cuadrado, digamos [1,25,100,4]

		int[] arrX5 = { 1, 5, 10, -2 };
		javabasico.arrSquare(arrX5);

		// 10. Dado un arreglo x, digamos [1,5,10,-2], escribir un método que reemplace
		// cualquier número negativo por 0. Cuando el método haya terminado, x no debe
		// tener valores negativos, digamos como [1,5,10,0].

		int[] arrX6 = { 1, 5, 10, -2 };
		javabasico.noNegative(arrX6);

		// 11. Dado un arreglo x, digamos [1,5,10,-2], escribir un método que devuelva
		// un arreglo con el número máximo, el número mínimo y el valor promedio que hay
		// en el arreglo x. El arreglo devuelto debe contener solo 3 valores [Max, Min,
		// Prom].

		int[] arrX7 = { 1, 5, 10, -2 };
		javabasico.printMaxMinProm(arrX7);

		// 12. Dado un arreglo x, digamos [1,5,10,7,-2], escribir un método que cambie
		// cada valor por el valor que sigue. Por ejemplo, cuando el método haya
		// terminado, un arreglo x [1,5,10,7,-2] se convertirá en [5,10,7,-2,0]. Observe
		// que el último número es 0. El método no necesita ajustarse para los valores
		// que están fuera de los límites.
		
		int[] arrX8 = {1,5,10,7,-2};
		javabasico.cambiarValores(arrX8);
		
	}

}
