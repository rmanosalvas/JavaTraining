package basics;

public class NumbersCalc {
	
	public static void main(String[] args) {
		System.out.println("Program is starting");
		printName();
		int numA = 10;
		int numB = 20;
		
		addNumbers(numA, numB);
		
		int product = multipleNumbers(numA, numB);
		
		System.out.println(product);
	}
	static void printName() {
		System.out.println("My name is Ricardo");
	}
	
	static void addNumbers(int numberA, int numberB) {
		int sum = numberA + numberB;
		System.out.println(sum);
	}
	
	static int multipleNumbers(int valueA, int valueB) {
		int product = valueA * valueB;
		addNumbers(product, product);
		return product;
	}
}
