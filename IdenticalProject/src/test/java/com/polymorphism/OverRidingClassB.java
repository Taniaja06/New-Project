package com.polymorphism;

public class OverRidingClassB extends OverRidingClassA{

	public void getTania() {
		System.out.println("Its 03/10/22");	
}
	// This is override method i change the value
	public void getTania(String name, int id) {
		System.out.println(name + id);
		
	}
	public static void main(String[] args) {
		OverRidingClassB obj = new OverRidingClassB();
		obj.getTania();
		obj.getTania("Sumiaya ", 9090);
	}
}
