package com.codingdojo.calculator;

public class Calculator implements CalculatorInterface {
	private double operand;
	private double operandotwo;
	private String operation;
	private double result;

	public void setResult(double result) {
		this.result = result;
	}

	public Calculator() {
		// Metodo constructor
	}

	@Override
	public void setOperandOne(double operand) {
		this.operand = operand;

	}
	public double getOperandOne() {
		return operand;
	}


	public double getOperandTwo() {
		return operandotwo;
	}

	

	public String getOperation() {
		return operation;
	}

	@Override
	public void setOperation(String operation) {
		this.operation = operation;

	}

	@Override
	public void setOperandTwo(double operand) {
		this.operandotwo = operand;

	}

	@Override
	public void performOperation() {
		if ("+".equals(getOperation()) || "-".equals(getOperation())) {
			if ("+".equals(getOperation())) {
				setResult(getOperandOne() + getOperandTwo());
			} else {
				setResult(getOperandOne() - getOperandTwo());
			}
		} else {
			System.out.println("no se puede procesar esta operacion");
		}
	}

	@Override
	public double getResult() {
		return result;

	}

}
