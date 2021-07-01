package com.qa.exc;

public class Calc {

	public double divide(double firstnumber, double secondnumber) {
	if ( firstnumber == 0 || secondnumber == 0) {
		throw new ArithmeticException("SORRY CAN'T DIVIDE BY ZERO");
		
	}
	return firstnumber/secondnumber;
	
}
	public void checkNumbers(double firstnumber, double secondnumber) {
//check if the firstnumber is a valid double number!
	try {
		Double.valueOf(firstnumber);
			//if any discrepinces with finding a double number will fall into catch block
	} catch(NumberFormatException e) {
		System.out.println("First number is invalid; " + e);
	}finally {
		System.out.println("The first number is" + firstnumber);
	}
	
	try {
		Double.valueOf(secondnumber);
	}catch(NumberFormatException e) {
		System.out.println("Second number is invalid; " + e);
	}finally {
		System.out.println("The Second number is: " + secondnumber);
	}
	//switch case - call different methods
	//Divide functionality
	
	try {
		System.out.println(firstnumber + "/" + secondnumber + "=" + divide(firstnumber, secondnumber));
	}catch(ArithmeticException e) {
		System.out.println("sorry something went wrong" + e.getMessage());
	}
}

}

