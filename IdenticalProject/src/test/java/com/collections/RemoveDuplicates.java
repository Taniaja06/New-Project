package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {
	
	public void getFindDup() {
//declare a string array with multiple value in a single unit 
	String[] values = {"tania", "sumiaya", "sumona", "tania"};
	
	//set cannot handle duplicate values 
	// so get help from set interface to remove the duplicate values
	// set is a interface and hashset is a class
	
	//declare a hashset
	Set<String> store = new HashSet<>(); 
	
	//3rd step create a for-loop, there are many for loop, advance loop(for each loop), while loop, do while etc.
	
	for (String dup :values ) {
		
		//now 4th step use java condition
		if(store.add(dup)==false) {
			System.out.println(dup);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		RemoveDuplicates obj = new RemoveDuplicates();
		obj.getFindDup();
		RemoveDuplicates obj2= new RemoveDuplicates();
		obj2.getRemoveFromNum();
		RemoveDuplicates obj3= new RemoveDuplicates();
		obj3.getMaxMin();
		
// 2nd highest
		/*int[] sum = {10, 20, 40, 60, 80, 90};
		
		int sum1 = sum.length;
		Arrays.sort(sum);
		int sum2 =sum[sum1 - 2];
			System.out.println(sum2);*/
		
	
		
//		
/*how to find the second highest from array
		int[] salary = {10,70,50,20,22,45,67,90};
		
		//find the length and store int variable 
	int size = salary.length;
	
	//then sort method from array to sort the values
	Arrays.sort(salary);
	//array variable passing the parameter[length object]
	int result = salary[size-2];
	System.out.println("2nd highest number"+ result);
		
	
//how to convert int-string & string-int
	int value = 12345;
	String convertString = new Integer(value).toString();
	System.out.println("convert int to string" + convertString);
	
	String variable = "56678";
	int convertInt = Integer.parseInt(variable);
	System.out.println("convert string to int " +convertInt);
	
//to break the sentence or words ???
	String name = "United States of America";
	//use looping concept
	
	for(String split: name.split(" ")) {
		System.out.println(split);
	
	/*??String name []= {"break this sentence"};
	for (String split : name) {
		if(split == sentence) {
			break;
		}
		
	}*/
		
/*verify a value is present in an array 
		String[] values = new String[]  {"selenium", "java", "maven", "cucumber"};
		List<String>list = Arrays.asList(values);
		if(list.contains("tani")) {
			System.out.println("my element is present");
		}else 
			System.out.println("element is not present");
		
//how to reverse a string without inbuilt method of predefined method 
	
		String text = "sysofnI"; 
		//char array b/c char handles characters
		char[] reverse = text.toCharArray();
		//use loop and decrement the text using i--
		for (int i = reverse.length-1; i>=0; i--) {
			
			//System.out.print(reverse[i]);
		}
		
//how to compare the 2 data/string
		//difference between == and equals method
		//variable to variable is true if we use == 
		String user = "tania"; //expected data 
		String user1 = "tania"; //actual data
		System.out.println("variable to variable  " + (user == user1)); // true
		System.out.println("variable to variable  " + (user.equals(user1))); //false
		
		//object to variable cannot compare using == , object -object .equal method true , obj to obj == false
		// but can be compared using equal method 
		String user2= new String("tania"); //false
		System.out.println("variable to object  " + (user == user2 )); //?? // false
		System.out.println("variable to variable  " + (user.equals(user2))); // true
	}
	
	
	
//remove duplicate from numeric 
	public void getRemoveFromNum() {
		//declare a arraylist
		List<Integer> num = new ArrayList<>();
		num.add(10);
		num.add(10);
		num.add(20);
		num.add(40);
		num.add(50);
		
		//remove the duplicate using stream Api and the syntax is below
		
	List<Integer> duplicate = num.stream().distinct().collect(Collectors.toList());
		System.out.println(duplicate);
	}
//find max & min from arraylist 
	//collection is a java utility class
	//help of collection i can call max min nmethod and pass arraylist object
	//
	public void getMaxMin() {
		List<Integer> num = new ArrayList<>();
		num.add(10);
		num.add(10);
		num.add(20);
		num.add(40);
		num.add(50);
		int max = Collections.max(num);
		System.out.println(max);
		
		int min = Collections.min(num);
		System.out.println(min);
	}
}*/
