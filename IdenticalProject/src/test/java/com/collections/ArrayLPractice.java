package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayLPractice {

	public static void getArrayL() {
		//2nd approach 
		ArrayList<String> users = new ArrayList<>();
		users.add("Tania");
		users.add("ishrat");
		users.add("Tawhid");
		users.add(null);
		users.add(null);
		for(String name : users) { //Advance loop
		System.out.println(name);
		}
		
	}
	//3rd approach, interface to class
	public static void getList() {
		List<Integer> id = new ArrayList<>();
		id.add(21);
		id.add(30);
		id.add(null);
		id.add(null);
		//for(int identify: id) {
			//System.out.println(identify);
		System.out.println(id);
		}
		
	
	
	//4TH
	public static void getArrayList() {
		List<String> terms = Arrays.asList("Fall","Spring","Winter");	
		for(int i = 0; i<terms.size(); i++) { // For loop through
			System.out.println(terms.get(i));
		}
	
		
	}
		
	public static void getBoole() {
		List<Boolean> info = Arrays.asList(true, false);
		for(boolean confess : info) {
			System.out.println(confess);
		}
	}
	
	
public static void main(String[] args) {
//ArrayLPractice.getArrayL();
//ArrayLPractice.getList();
	//ArrayLPractice.getArrayList();
//ArrayLPractice.getBoole();

List<Integer> myNum = Arrays.asList(20, 21, 29, 33, 40);
int maxNum = Collections.max(myNum);
int minNum = Collections.min(myNum);
System.out.println("This is minimum " + minNum + "  This is maximum no. " + maxNum); 
//System.out.println(maxNum);
	
}
	}
	
	
	

