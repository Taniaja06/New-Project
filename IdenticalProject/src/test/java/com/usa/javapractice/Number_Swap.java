package com.usa.javapractice;

public class Number_Swap {

	//static int x = 100;
	//static int y = 200; // we create global variable so we can reuse it 
	
	// use third variable to swap numbers
	
	public static void SwapWithThirdVariable() {
		int temp; // third variable
		int x= 100; //x value is 100 but we need to swap to 200
		int y = 200;
		
	temp = x; // temp value is 100
	x = y;  // x value is 200
	y = temp; // y value is 100
	
	System.out.println("x= " +x);
	System.out.println("y=" + y);
	
	}
	public static void swapNumberWoThirdVariable() {
		int x= 100; //x value is 100 but we need to swap to 200
		int y = 200; // 
		
		x = x+y;
		y = x-y;
		x = x-y;
		
		System.out.println("x= " +x);
		System.out.println("y= " + y);
	}
	public static void main(String[] args) {
		Number_Swap.swapNumberWoThirdVariable();
		System.out.println();
		
	}


	
}



