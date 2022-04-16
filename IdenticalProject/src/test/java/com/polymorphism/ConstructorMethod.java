package com.polymorphism;

import com.encapsulation.ConstructorTest;

public class ConstructorMethod {
	
	//NOTES//
	
//constructor is special kind of method
		//when we create the constructor it invokes implicitly or automatically 
		// 2 types of constructor - 1. parameter 2. default 
		
		// there are many rules to create a constructor 
		//1. same as classname 2. no void 3. can overload but not overriding 
		// constructor removes the null values 
		// we can't call constructor b/c it invokes implicitly 
		
		
//		public ConstructorTest() {
			
		


	//public ConstructorTest(int age) {
//		System.out.println(age);
			

		//public static void main(String[] args) {
	//		ConstructorTest obj = new ConstructorTest(4);
					
			
//_________________________________________
	

	public ConstructorMethod() {
		System.out.println("This is Constructor Method");
		
	}
	
	public ConstructorMethod(int sum, String name) {
		System.out.println(sum + name);
		
	}
	
	public static void main(String[] args) {
		ConstructorMethod obj = new ConstructorMethod();
		ConstructorMethod obj1 = new ConstructorMethod(12123, " tania");
		
	}

}

