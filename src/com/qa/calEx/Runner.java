package com.qa.calEx;

public class Runner {
	
	public static void main(String[] args) {
		
		System.out.println(Calculator.add(4, 11));//4+11 = 15
		System.out.println(Calculator.sub(67, 11));//67 - 11 = 56
		System.out.println(Calculator.mul(4, 11));//4*11 = 44
		System.out.println(Calculator.div(5, 2)); 
		System.out.println(Calculator.remainder(5, 2));//-get the remainder which is 1
		System.out.println(Calculator.oddEven(5)); // as 5 is an odd number and not equal to 2 this will show as 1
		System.out.println(Exceptions.div(1, 5));
	}

}
