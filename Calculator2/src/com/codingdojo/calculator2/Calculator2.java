package com.codingdojo.calculator2;

import java.util.Stack;

public class Calculator2 implements CalculatorInterface {
	
	//Instanciacion de una pila de numeros y operaciones
	private Stack<Double> numeros;
	private Stack<String> operaciones;

	public Calculator2() {
		numeros = new Stack<>();
		operaciones = new Stack<>();
	}

	//Se agrega un numero a la pila de numeros
	public void performOperation(double numero) {
		numeros.push(numero);
	}
	//funcion que agrega un operador a la pila de operaciones y ejercuta la operacion segun su procedencia
	public void performOperation(String operacion) {
		//Si el operador es un =, se realiza el cálculo hasta que la pila de operaciones este vacia
    	if (operacion.equals("=")) {
            while (!operaciones.isEmpty()) {
                operacion();
            }
    	}
    	else if (operacion.equals("+") || operacion.equals("-") || operacion.equals("*") || operacion.equals("/")) {
    		// aqui se realiza el calculo segun la procedencia
    		while (!operaciones.isEmpty() && procedencia(operacion, operaciones.peek())) {
                operacion();
            }
    		//Se agrega el operador a la pila de operaciones
            operaciones.push(operacion);
        }	
    
    }
	// aqui utiliza los numeros y operadores almacenados y los manda como parametros para obtener el resultado
	public void operacion() {
		double numero2 = numeros.pop();
		double numero1 = numeros.pop();
		String operacion = operaciones.pop();
		double resultado = getResult(numero1, numero2, operacion);
		
		//se agrega a la pila de numeros el resultado
		numeros.push(resultado);
	}
	// logica para las operaciones segun el operador
	public double getResult(double numero1, double numero2, String operacion) {
		switch (operacion) {
		case "+":
			return numero1 + numero2;
		case "-":
			return numero1 - numero2;
		case "*":
			return numero1 * numero2;
		case "/":
			return numero1 / numero2;
		default:
			return 0;
		}
	}
	// funcion para obtenter el resultado almacenado en la pila
	public double getResult() {
		return numeros.pop();
	}

	// aqui se determina si la operacion2 tiener mayor procedencia que la primera
	public boolean procedencia(String operacion, String operacion2) {
		if ((operacion2.equals("*") || operacion2.equals("/")) && (operacion.equals("+")) || (operacion.equals("-"))) {
			
			//Si la condicion es correcta significa que la operacion2 tiene mayor procedencia que la primera
			return true;
		}
		// de lo contrario se envia false
		return false;
	}

}
