package com.codingdojo.calculator2;

public class CalculatorTesting {
	public static void main(String[] args) {
	Calculator2 calculadora = new Calculator2();

    calculadora.performOperation(10.5);
    calculadora.performOperation("+");
    calculadora.performOperation(5.2);
    calculadora.performOperation("*");
    calculadora.performOperation(10);
    calculadora.performOperation("=");

    System.out.println(calculadora.getResult());
	
   calculadora.performOperation(6.0);
   calculadora.performOperation("*");
   calculadora.performOperation(100.0);
   calculadora.performOperation("=");
   calculadora.performOperation("+");
   calculadora.performOperation(25);
   calculadora.performOperation("=");
   calculadora.performOperation("/");
   calculadora.performOperation(5);
   calculadora.performOperation("=");
   System.out.println(calculadora.getResult());
    
	}
}
