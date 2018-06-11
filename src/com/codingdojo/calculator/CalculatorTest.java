package com.codingdojo.calculator;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.setOperandOne(2);
		c.setOperation("hi");
		c.setOperandTwo(5.2);
		c.performOperation();
		System.out.println(c.getResult());
	}
}
