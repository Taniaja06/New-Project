package com.usa.javapractice;

public class LocalVariable {

	int mathscore;
	int historyscore;
	static int x;
	
public void getNumber() {
	// local var and we have access within the method we cannot use outside the method
	// static method cannot handle the instance variable or non static variable
	
	int age = 10000;
	String ID = " tania";
	String name = " 100-10-1111";
	System.out.println(age + ID + name);
}



public void getScores() {
	int artscore = 100;
	mathscore = 10;
	historyscore = 99;
	System.out.println(artscore + "," + mathscore +  "," + historyscore);


}


public static void main(String[] args) {
	LocalVariable scores = new LocalVariable();
	scores.getScores();
}
}