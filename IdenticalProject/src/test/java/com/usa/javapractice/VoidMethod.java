package com.usa.javapractice;

public class VoidMethod {
	
	int salary;
	int bonus;
	int performance;
	int cola;
	//non static method & void method
public void getEmployeesInfo() {
	int total;
	salary = 98000;
	bonus = 3000;
	performance = 2000;
	cola = 6000;
	
	total = salary + bonus + performance - cola;
	System.out.println("This is my total salary:" +total);
}
	
	public static void main(String[] args) {
		VoidMethod total = new VoidMethod();
		total.getEmployeesInfo();
		
	}

}
