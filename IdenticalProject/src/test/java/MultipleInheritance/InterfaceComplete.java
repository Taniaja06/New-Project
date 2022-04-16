package MultipleInheritance;

//Multiple Inheritance is not possible 

//NOTES//

//public interface {
//
//	// Interface contain the 100% abstract method
//	// Abstract method is incomplete method
//	// Why? Because of there are only method name or signatures without body
//	public void getSalary(); // This is a abstract method
//
//	// How you identify the Abstract method?
//	// Method is closing by semicolon and there are no curly bracket open & closed
//
//
//}
//
public class InterfaceComplete implements InterfaceTestA, InterfaceTestB {

		public static void main(String[] args) {
			InterfaceComplete obj = new InterfaceComplete();
			obj.getEmployee();
			obj.getEmplInfo();
			obj.getName();
			obj.getInfo();
			obj.getMe();

		}

		public void getEmplInfo() {
			System.out.println("I am from interface classA");
			
			
		}

		public void getEmployee() {
			System.out.println("Interface classB");
			
			
		}

		public void getInfo() {
			int Id = 12345;
			System.out.println(Id);
		}

		public void getName() {
			String name = "Sumiaya";
			System.out.println(name);
		}

		public void getMe() {
			int age = 90;
			System.out.println(age);
		}

	}


