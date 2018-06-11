package com.codingdojo.calculator;

class Calculator implements java.io.Serializable {
	private double OperandOne;
	private double OperandTwo;
	private String Operation;
	private double result;
	public Calculator(){
	}
	public double getOperandOne() {
		return OperandOne;
	}
	public void setOperandOne(double operandOne) {
		OperandOne = operandOne;
	}
	public double getOperandTwo() {
		return OperandTwo;
	}
	public void setOperandTwo(double operandTwo) {
		OperandTwo = operandTwo;
	}
	public String getOperation() {
		return Operation;
	}
	public void setOperation(String operation) {
		Operation = operation;
	}
	
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	public double performOperation() {
		if(this.Operation == "+") {
			 this.result = this.OperandOne + this.OperandTwo;
			return this.result;
		}
		else if(this.Operation == "-") {
			this.result = this.OperandOne - this.OperandTwo;
			return this.result;
		}
		return 0;
	}
	
}
