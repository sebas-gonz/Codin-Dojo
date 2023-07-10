package com.codingdojo.calculator;

public class CalculatorTesting {

	public static void main(String[] args) {
		Calculator calculadora = new Calculator();
		
		calculadora.setOperandOne(400);
		calculadora.setOperation("-");
		calculadora.setOperandTwo(600);
		calculadora.performOperation();
		
		System.out.println(calculadora.getResult());
		
		calculadora.setOperandOne(10);
		calculadora.setOperation("-");
		calculadora.setOperandTwo(20);
		calculadora.performOperation();
		
		System.out.println(calculadora.getResult());
		
		calculadora.setOperandOne(23285);
		calculadora.setOperandTwo(4434578);
		calculadora.setOperation("+");
		calculadora.performOperation();
		
		System.out.println(calculadora.getResult());
	}

}
