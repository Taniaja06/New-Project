package com.inheritance;

public class Parents {
	
	// NOTES//
	
	// What is the inheritance? Inheritance is one of the OOPS concept.
		// We can transfer the common properties one class to another class 
		
		// How you use inheritance?
		// Ans: We have to use protected  access modifier & Extends key word 
		
		// There are many types of inheritance 
		// 1, Single level inheritance
		// 2. Multi level inheritance
		// 3. Multiple inheritance
		
		// What is the single level inheritance?
		// Ans: transfer the common properties one class to another class or Class A to B, or Parent to child 
		
		// What is the Multi level inheritance?
		// Ans: transfer the common properties from Grandparent to parent to child, Or Class A to B to C, 
		
		// What is the Multiple inheritance?
		// Ans: Multiple is not possible in  inheritance concept or class level inheritance 
		// Because of diamond issues
		// but It is possible with interface level using implements key word  
		

	public class Parents extends GrandParent {
		// This is a single level inheritance
		// Parent extends the grandparent class
		protected void getBigHouse() {
			System.out.println("I have a big house ");
		}
		public static void main(String[] args) {
			// if i create parent class object then i get access both class properties
			// If i create a grandparent class object then i get only grandparent properties
			// GrandParent obj1 = new GrandParent();
			Parents obj = new Parents();
			obj.getBuildings();
			obj.getBigHouse();

		}

	}
