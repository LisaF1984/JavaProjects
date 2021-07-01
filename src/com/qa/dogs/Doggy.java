package com.qa.dogs;

public class Doggy {

	public static void whileLoop() {
		System.out.println("---------while");
		int dogs = 2;

		while (dogs < 2) {
			System.out.println("give me dog");
			dogs++;
			System.out.println("Dogs = " + dogs);

		}
	}

	public static void doLop() {
		System.out.println("------------do");
		int dogs = 2;
		do {
			System.out.println("gimme dog");
			dogs++;
			System.out.println("dogs =" + dogs);

		} while (dogs < 2);

	}

}
//	public static void iceCreamLoop() {
//		int iceCream = 0;
//		boolean eaten = true;
//		
//		while (eaten) {
//			System.out.println( "iceCream =" + iceCream);
//			System.out.println("Have an ice cream");
//			
//			iceCream++;
//			
//			if (iceCream ==10) {
//				eaten = false;
//				System.out.println("Limit reached");
//				
//			}
//			
//		
//		}

//}
