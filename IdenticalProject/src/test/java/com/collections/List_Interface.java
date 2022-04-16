package com.collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class List_Interface {

	public static void main(String[] args) {
/*What is the collection in JAVA?
		-The collection in java is advance framework that provide an architecture to store and manupulate
		the group of objects.
		-The java collection can achive all the operations that you perform on a data such as searching, sorting,
		insertion, manupulation and deletion
		-The collection means a single unit object. It provede many interface(Set, List,Queue, Deque, Map & many more)
		
		Collection provides many interfaces(100% abstract methods)
		
		as a QA I am using Set, List and Map in my framework
		
		
		-------------------------Collection------------------------------------
		Interface : List, Set, Map, SortedMap, SortedSet*/
		
//ArrayList
		//the arraylist class is a **resizeable array** which can be found in the java.util package
		//arraylist can be modified, elements can be added or removed from an arraylist.
/*LIST Interface
				-List allow to store duplicate elements
				- List allows to store as many as null value needed
				-List maintain the insertion order
				-List follow the index theory by get() method
				-List is Non-sychonized - Faster 
				************Sychonize maintain the order(slower performence)*******************
				***********Non-Sychonize can do multiple task together(methods/test cases)**********
				-List implements many classes, Arraylist, linkedList, vector
					1. ArrayList
						a. ArrayList is dynamic
						b. ArrayList use the size() method
						c. It is non-sychonized 
						d. It can handle as many null values 
						e. ArrayList folloow the index theory
						f. It implements from list interface
						g. ArrayList is resizable, 
					so if add any value then the size will be increase 50%. */
		
	//2way	
java.util.ArrayList name = new java.util.ArrayList();
//add method
	name.add("tania");
	name.add("jahan");
	name.add("sumi-aya ");
	System.out.println(name);
	
//	//3rd way
//List interface to Arraylist class
List<Integer> num = new java.util.ArrayList<Integer>();
	num.add(20);
	num.add(10);
	num.add(20);
	num.add(null);
	System.out.println(num);


//	
//	//4th way
List<Integer> id = Arrays.asList(2,3,4,5);
System.out.println(id);

//Linked list 
LinkedList<String> terms  = new LinkedList<>();
terms.add("Spring");
terms.add("fall");
terms.add("winter");
terms.add(null);
System.out.println(terms);


//vector 
Vector<Integer> vect = new Vector<>();
vect.add(null);




////---------------
////Basic loop; Loop through an ArrayList, i++ increases value 
//	for (int i = 0; i < name.size(); i++) {
//		//System.out.println(name.get(i));
//	}
////for loop- when you know exactly how many times you want to loop through a block of code 
//// require 3 statements
//	for (int i = 0; i <10; i= i+2) { // this will give you even values between 0-10
//		//System.out.println(i);
//	}
//	
////e.g use for-[p--loop to print "yes" 5 times
//	for (int i = 0; i < 5; i++) {
//		//System.out.println("Yes");
//	}
////--------------
//	
////For-each loop or advanced loop-- to loop through an array
////for (data type variableName : arrayName){
//	
// int nums [] = {10, 20, 30, 40, 50};
//	for(int numbers : nums ) {
//		System.out.println(Arrays.asList(nums));
//	}
//	
////String [] names = {"tania, sumiaya, ishrat, shikha"};
////for(String i : names) {
//	//System.out.println(i);
	
}
	}


