package com.usa.javapractice;

public class GlobalVariable {
	
	static int age = 109; //global in btw class and main method

		
		static int salary;
		static String name;
		static String information;
		
		
		public void getAddress() {
			salary = 10000;
			name = " tania";
			information = " 123-45-6789 ";
		
		System.out.println(salary + name + information);
	}
		
		public void getID() {
			salary = 1000;
			name = " taniaa";
			information = " 123-45-0000";
		System.out.println(salary + name + information);
		}
		
		public void getEdu() {
			salary = 1900;
			name = " Tania";
			information = " 123-45-9090";
		System.out.println(salary + name + information);
		}

		public static void main(String[] args) {
			GlobalVariable obj = new GlobalVariable();
			obj.getID();
			obj.getAddress();
			obj.getEdu();
			GlobalVariable.getTaniaInfo(); //call static method by classname.
		}

		

public static void getTaniaInfo() {
	salary = 10000;
	name = " AHDJDJ";
	System.out.println("My salary " + salary + name);
	
}
}


