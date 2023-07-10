package com.codingdojo.calculator;

public interface CalculatorInterface {
	void setOperandOne(double operand);
	void setOperation(String operation);
	void setOperandTwo(double operand); 
	void performOperation(); 
	double getResult();
}
