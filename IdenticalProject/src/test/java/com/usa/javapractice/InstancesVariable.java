package com.usa.javapractice;

public class InstancesVariable { //this is a class
	
	//int salary = 1000; //instance variable 
	//int age = 89;
	
//instance variable -- I have access to within the class and any method 	

		//int salary = 1000;
		//String name = "Tania";
		//String info = "123-23-2344";
		
		int income;
		String title;
		String info;
		
		public void getSalary() {
			GlobalVariable.information = "9000-777";
			income = 8999;
			title = " tania";
			info = " 123-45-6789";
		System.out.println(income + title + info);
	}
		
		public void getName() {
			income = 1000;
			title = " taniaa";
			info = " 123-45-0000";
		System.out.println(income + title + info);
		}
		
		public void getInfo() {
			income = 1900;
			title = " Tania";
			info = " 123-45-9090";
		System.out.println(income + title + info);
		}

	// how to call a method inside the main method
		// by creating object 
		// -syntax: className objectName = new className ();

	public static void main(String[] args) {
		InstancesVariable obj = new InstancesVariable();
		obj.getSalary();
		obj.getName();
		obj.getInfo();
		GlobalVariable.getTaniaInfo();
		LocalVariable result = new LocalVariable();
		result.getScores();
		result.mathscore = 1000;
	}
}
