package com.polymorphism;

public class OverLoadingClassA {
	
	//NOTES//
//*OOPS concents 
	
	// What is the polymorphism ?
		// polymorphism is many forms, Which one can change the behaver based on the situation 
		
		// polymorphism i can approach two way
		// 1. Method overloading, Static binding or compile time polymorphism
		// 2. Method overriding, dynamic or run time polymorphism
		
		
		// What is method over loading?
		// Ans: Same method i can use again & again by changing the parameter 
		// and finish within the class 
		
		// How you change the parameter?
		// Ans: I can change the parameter by using the data type & location of data type 
		
//____________________________________________________
	
// overloading/ compile time/ static binding

	public void getSumiaya(int id) {
		System.out.println(id);
	}
	public void getSumiaya(double id) {
		System.out.println(id);
		
	}
	
	public void getSumiaya(String name, int id) {
		System.out.println(name + id);
		
	}
	
	public void getSumiaya(int id, String name) {
		System.out.println(id + name);
	
	
	}
	public static void main(String[] args) {
		OverLoadingClassA obj = new OverLoadingClassA();
		obj.getSumiaya(1234);
		obj.getSumiaya(123.50);
		obj.getSumiaya("Sara ", 123);
	}
}
