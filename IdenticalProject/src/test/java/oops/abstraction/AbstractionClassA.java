package oops.abstraction;

public abstract class AbstractionClassA {
//
	//abstraction: incomplete class, is the process of hiding the implementation and showing functionality
	// can be implemented with either ways:
	//1. abstract class- it can contain 0-100% abstract method
	// or concrete and abstract method. if inside the class one abstract method is present class automatically will be abstract class
	//abstract class finish with 2nd class/subclass or another class
	// abstract class can inherit by using extends key word
	
	//	2. interface- interface can only contain abstract method or 100% abstract method
	// interface do not need abstract keyword in the class
	// interface inherit by using implements key word
	
	//1..
//abstract class and abstract key word in the method
public abstract void getSalary();


//(concrete) method
public void geetInfo() {
	System.out.println("Complete Method");
	
}

public static void main(String[] args) {
	//AbstractionClassA obj = new AbstractionClassA();
	//cannot create object with in the class *use subclass
	
}
}
