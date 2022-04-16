package oops.constructor;

import com.polymorphism.ConstructorMethod;

public class ConstructorM {
//constructor is special kind of method
	//when we create the constructor it invoke implicitly or automatically 
		// 2 types of constructor - 1. parameter 2. default 
		
		// there are many rules to create a constructor 
		//1. same as classname 2. no void 3. can overload but not overriding 
		
	// constructor removes the null values 
		// we can't call constructor it invokes implicitly 
		
	
		
//		public ConstructorM() {
	public ConstructorM(int age) {
		System.out.println(age);
			
		}

		//public static void main(String[] args) {
			ConstructorM obj = new ConstructorM(4);
			
		public ConstructorM() {
				System.out.println("This is Constructor Method");
				
			}
			
		public ConstructorM(int sum, String name) {
				System.out.println(sum + name);
				
			}
			
			public static void main(String[] args) {
				ConstructorM obj = new ConstructorM();
				ConstructorM obj1 = new ConstructorM(12123, " tania");
				
					}
}


