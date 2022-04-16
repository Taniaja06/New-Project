package com.polymorphism;

public class OverRidingClassA {

	//NOTES//
	
	// What is the polymorphism ?
		// polymorphism is many forms, Which one can change the behaver based on the situation 
		
		// polymorphism i can approach two way
		// 1. Method overloading, Static binding or compile time polymorphism
		// 2. Method overriding, dynamic or run time polymorphism
		
		
		// What is method overriding?
			// Ans: Same method i can use again & again by changing the parameter 
		// and finish within the 2nd class or sub class
			
			// How you change the parameter?
			// Ans: I can change the parameter by using the data type & location of data type 
//__________________________________________________________	
	
	
	public void getTania() {
		System.out.println("its thursday");
	}
	
	public void getTania(String name, int id) {
		System.out.println(name + id);
	}
	
	public static void main(String[] args) {
		OverRidingClassA obj = new OverRidingClassA();
		obj.getTania();
		obj.getTania("Its Tania ", 6780);
	}
	
}
