package com.inheritance;

public class ClassB extends ClassA{

	public void getNurul() {
		String vehicle = "Bicycle";
		int savings = 900000;
		
		System.out.println("Tawhid bhai's babar assets are ");
		System.out.println("Nurul Owns a " + vehicle + " also " + savings);
		
		
	}
	
	public static void main(String[] args) {
		ClassB obj = new ClassB();
		obj.getGrandpa();
		obj.getNurul();
	}
}



