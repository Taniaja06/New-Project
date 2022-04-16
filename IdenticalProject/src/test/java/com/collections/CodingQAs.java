package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CodingQAs {
	
// Example
//1. max min
	public static void main(String[] args) {
		List<Integer> num = new ArrayList();
		num.add(10);
		num.add(20);
		num.add(70);
		num.add(50);
		int max = Collections.max(num);	
		System.out.println(max);
		int min = Collections.min(num);
		System.out.println(min);

//2. max min-- 4th arraylist approach
		List<Integer> nums = Arrays.asList(11,20,34,60,79);
		int max1 = Collections.max(nums);
		System.out.println(max1);
		int min1 =Collections.min(nums);
		System.out.println(min1);

//Example
//1. 2nd highest
		int[] sum = {10, 20, 40, 60, 80, 90};
		
		int sum1 = sum.length;
		Arrays.sort(sum);
		int sum2 =sum[sum1 - 2];
			System.out.println("2nd highest value is " +sum2);
			
//2. 3rd highest 
			
			int[] digits = {33, 45, 67, 89,90, 98};
			int digi = digits.length;
			Arrays.sort(digits);
			int digit = digits[digi-3]; 
			System.out.println(digit);
		
//e.g		
//1. Remove duplicate from numeric
		// arraylist
		List<Integer> dup = new ArrayList();
		dup.add(20);
		dup.add(20);
		dup.add(40);
		dup.add(50);
		dup.add(10);
		List<Integer> numer = dup.stream().distinct().collect(Collectors.toList());
		System.out.println(numer);
		
//2. Remove using for loop
		Set<Integer> dup4 =new HashSet();
		for(int dupl:dup) {
		if(dup4.add(dupl)==false) {
		System.out.println("this is my numeric duplicate value " +dupl);
			}
		}
		// revoming dup;icates from array
		//int[] sum = {10,20, 10, 90};
		//List<Integer> sum1 = sum.stream().distinct().collect(Collectors.toList())
		
	
		
//3. Remove duplicate from array
		String[] dup1 = {"tania","sumiaya","tania"};
		Set<String> character = new HashSet();
		for(String dup2: dup1) {
			if(character.add(dup2)==false) {
			//if(character.add(dup2)==true) {
				System.out.println(dup2);
			}
		}
		
// break words-- split method
		//without "" space split each character, 
		//with space " "
		String brand = "Banana Republic";
		for(String name : brand.split(" ")) {
			System.out.println(brand);
		}
		//for(String brand : "Banana Republic".split(" ")) ://Another way
		
		
//reverse 
		String brand1 = "cilbupeR";
		char[] brand2 = brand1.toCharArray();
		for(int i =brand2.length-1; i>=0;i--) {
			System.out.print(brand2[i]);
		}

// compare  - variable to variable *(true) w ==operator
		String doc = "document";
		String word = "document";
		System.out.println(doc==word); // true
		
//v-v equal method *(TRUE)
		System.out.println(doc.equals(word)); //true
		
// Compare- varible to object, (false) with == operate
		// with equals method --  (TRUE)
	String docx = new String("document");
		System.out.println(doc==docx);// false
		System.out.println(doc.equals(docx));// true
		
	//obj to obj, with == false 
		//obj to obj equal method --true 
		String ppt = new String("document");
		System.out.println(docx==ppt); // false
		System.out.println(docx.equals(ppt)); // true 

//Convert -- int to string
		int a = 90;
		String b = new Integer(a).toString();
		System.out.println("converting int to string " +b);
		
	// string to int 
		String aa = "67";
		int bb = Integer.parseInt(aa);
		System.out.println(bb);
		

	}
}
	
	



