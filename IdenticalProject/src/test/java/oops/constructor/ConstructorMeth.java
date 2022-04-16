package oops.constructor;

public class ConstructorMeth {

	public ConstructorMeth(int salary) {
		System.out.println(salary);
	}
	
	public ConstructorMeth() {
		System.out.println("this is default");
	}
	
	public ConstructorMeth(String name, int salary) {
		System.out.println(name + salary);
	}
	
	public static void main(String[] args) {
	ConstructorMeth result = new ConstructorMeth(70000);
	ConstructorMeth result1 = new ConstructorMeth();
	ConstructorMeth result2 = new ConstructorMeth("tania ", 90909);
	}

}
