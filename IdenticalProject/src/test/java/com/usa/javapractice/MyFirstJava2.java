package com.usa.javapractice;

public class MyFirstJava2 {

	
// creating method requirements
// 1. name of the method 
// 2. open and close parenthesis 
// 3. open & close curly bracket 
// 4. either void or return types
	
// i.e 1 -void method 
	void getEmployees() {
	}
	
// i.e 2 return method 
	// this is a return method b/c we adding a data type
	// also add a return keyword
	//identify return method
	// first data type & return keyword
	
	int getIncome() {
	return salary;
	}




//METHODS 
// There are many types of methods 
//(void, non-void), (return, non return), (parameter, non-parameter).


	//void method 

public void getSalary() {
	
}

	//non-void method or return method 

public String getInfo() {
	return null;
}


	//parameter and void method 

public void getAge(int age) {
}

	//parameter method also return method 

public String getEmplID() {
	return null;
	
}

//static method - by calling classname
// by creating obj
// we use classname to create object 
//syntax - 

//how to call non-static method 
// by creating obj
// we create obj by classname
// className objectName = new className
//------------------------------------------

//instance variable -- I have access to within the class and any method 	

	//int salary = 1000;
	//String name = "Tania";
	//String info = "123-23-2344";
	
	int salary = 8999;
	String name;
	String info;
	
	public void getSalary2() {
		salary = 10000;
		name = " tania";
		info = " 123-45-6789";
	System.out.println(salary + name + info);
}
	
	public void getName2() {
		salary = 1000;
		name = " taniaa";
		info = " 123-45-0000";
	System.out.println(salary + name + info);
	}
	
	public void getInfo2() {
		salary = 1900;
		name = " Tania";
		info = " 123-45-9090";
	System.out.println(salary + name + info);
	}

// how to call a method inside the main method
	// by creating object 
	// -syntax: className objectName = new className ();

public static void main(String[] args) {
	MyFirstJava2 obj = new MyFirstJava2();
	obj.getSalary2();
	obj.getName2();
	obj.getInfo2();
	
	
//3/6/2022

//swap numbers using third variable

	int a =20;
	int x =30;
	int temp; // this is third value
	
	
	
}
}





