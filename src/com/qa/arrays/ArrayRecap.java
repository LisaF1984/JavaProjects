package com.qa.arrays;

import java.util.List;

public class ArrayRecap {
	
		
//ArrayList
	//DataType - Type of data String, Integer, Double,
	//use the methods from the Lisa class!
	static List<String> names = new ArrayList<>();
	
	names.add("Lisa");
	names.add("Joe");
	
	System.out.println(names.size());
	printNames();

	public static void printNames() {
		for(int i=0: i<names.size(); i++) {
			System.out.println(names.get(i));
		}
		
	}



}}