package com.usa.javapractice;



public class JavaSwapingNum {
	
	static int a = 10;
	static int b = 9;
	
	public void getSwap() {
	
		int temp;
		int a = 600;
		int b = 400;
		
		temp = a; // temp is 600
		a = b; // a = 400
		b = temp; // 
		System.out.println("the value for a is " + a );
		System.out.println("the value for b is " + b);
		
	}
	
	public void getWO3rdVariable() {
		int  x = 100;
		int y = 200;
		
		x = x + y; // x is 300
		y = x - y; // y is 100
		x = x- y; //  x is 200 
		
		System.out.println("The value for x is " + x);
		System.out.println("The value for y is " + y);
	}
	
	
	public static void main(String[] args) {
		JavaSwapingNum obj = new JavaSwapingNum();
		obj.getSwap();
		obj.getWO3rdVariable();
	}
}


