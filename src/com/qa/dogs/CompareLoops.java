package com.qa.dogs;

public class CompareLoops {

	public static void whileL() {
		System.out.println("----While Loop");
		int count = 2;
		
		
		while(count<2) {
			count++;
			System.out.println(count);
		}
	
	}

	
	public static void doWhile() {
		System.out.println("-----Do While Loop");
		int count = 2;
		
		do {
			count++;
			System.out.println(count);
			
		}while(count<2);
		
		
	}
}


