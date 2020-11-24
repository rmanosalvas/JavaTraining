package OOP;

class Person {
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void eat() {
		System.out.println(email);
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
	}
}

public class Demo {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		// Instantiating an object
		
		
		// Defining properties
		person1.email = "gmail.com";
		person1.name = "Nico";
		person1.phone = "123123123";
		
		// Abstraction
		person1.walk();
		person1.eat();
		person1.sleep();
//		// TODO Auto-generated method stub
//		
//		
//		String name = "Ricardo";
//		String email = "mano@gmail.com";
//		String phone = "7035959692";
//		
//		// Action, activity, behavior
//		System.out.println(name + " is walking");
//		System.out.println("Here is " + name + " phone number " + phone);
//		
//		// WHat if we wanted to do this for another person?
//		
//		String name2 = "Les";
//		String email2 = "les@gmail.com";
//		String phone2 = "7035086414";
//		
//		// Action, activity, behavior
//		System.out.println(name2 + " is walking");
//		System.out.println("Here is " + name2 + " phone number " + phone2);
//		
//	}
//	
//	static void walking(String name) {
//		System.out.println(name + " is walking");
	}

}
