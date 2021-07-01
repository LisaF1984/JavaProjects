package com.qa.exc;

public class Runner {
	public static void main(String[] args) {
	Calc calc = new Calc();
	calc.checkNumbers(34, 0);
	
	calc.checkNumbers(-44, 4);
	
	calc.checkNumbers("abc", "4");
	
	}

}
