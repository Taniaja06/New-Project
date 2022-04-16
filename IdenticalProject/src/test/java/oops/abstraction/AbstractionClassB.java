package oops.abstraction;

public class AbstractionClassB extends AbstractionClassA {

	@Override
	public void getSalary() {
	System.out.println("abstract method");	
		
	}

public static void main(String[] args) {
	AbstractionClassB obj = new AbstractionClassB();
	obj.getSalary();
	obj.geetInfo();
}
}
