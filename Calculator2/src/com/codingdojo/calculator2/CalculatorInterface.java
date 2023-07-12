package com.codingdojo.calculator2;

public interface CalculatorInterface {
	void performOperation(double numero); 
	boolean procedencia(String operacion, String operacion2);
	void operacion();
	double getResult(double numero1, double numero2, String operacion);
}
