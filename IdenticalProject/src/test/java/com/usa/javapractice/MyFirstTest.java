package com.usa.javapractice;

public class MyFirstTest {
	//after the class
	
	//instance variable 
	//int salary = 8000;
	//String name = "Tania";
	//String info = "";
	
	// instance variable and i have the access to instance variable within the class and any method
	
	int salary;
	String name;
	String info;
	
	//Global variable and i have an access the global variable within my project any packages any class
	//how to call static variable in other classes  = 
	static int income;
	static String firstname;
	static String eduinfo;
	
	

	public void getID() {	
		salary = 10080;
		name = "Ttata" ;
		info = "1234w";
		System.out.println();
	}
	
	public void getAddress() {
		salary;
		name;
		info;
		System.out.println();
	}
	
	public void getEducation() {
		salary;
		name;
		info;
	}
	
	
	
	public void getSalary() {
	salary = 1000;
	name = "tania";
	info = "123-34-4566"
		System.out.println(salary + name);
	}
	
	public void getName() {
		System.out.println(salary + name);
	}
	
	public void getInfo() {
		System.out.println(salary + name);
	}
	
	static int age = 89; //global
	int salary = 10000; // instance 
	
	
	//how you call the method inside the main method
	//--by creating object
	//creat object by class name
	// synyax to create an object
	// --ClassName objectNmae = new ClassName();
	// how jvm understand you create an object? 
	// whenever create an obj by help with new keyword jvm understand.
	
	//above the method
	
	public static void main(String[] args) {
	//inside the method
		
		MyFirstTest obj = new MyFirstTest();
		obj.getsalary
		
		
		String name = "TaniaJahan"; // local variable 
		
		
		// method contain a block of code where we can write the automation script & test script
		// method creation requirement
		// 1. name of method 
		// 2. Parenthesis open and close
		// 3. curly bracket open & close 
		// 4. we have to select either void or return 
		

	//void method b/c of void keyword 
	// this method returns nothing 
		
	void getEmployees () {
		
	}
	
	
	//how identify to return method
	//first data type and use return keyword 
	int getSalary() {
		
	return salary;
	}
	}
	
	
	// there are many kind of method available like,
	//void, non-void, return or non-return, parameter non-parameter method
	
	//void method
	
	public void getSalary() {
	}
	
	//non-void method or return mehtod 
	public String getInfo() {
		return null;
 }
	
	//void method also parameter method 
	public void getAge(int age) {
		
	}
	
	//return as well as parameter method 
	public String getEmployees(String name) {
		return null;
	}
	
	
	