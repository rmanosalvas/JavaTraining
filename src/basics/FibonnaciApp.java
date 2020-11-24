package basics;

public class FibonnaciApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Fibonnaci number is defined by the sum of the 2 precious fibonnaci numbers
		// fib(0) = 0
		// fib(1) = 1
		// fib(2) = fib(1) + fib(0) = 0 + 1 = 1
		// fib(3) = fin (2) + fin(1) = 1 + 1 = 2
		// fub(4) = fib(3) + fib(2) = 2 + 1 = 3
		// fib(5) = fib(4) + fib(3) = 3 + 2 = 5
		System.out.println(fib(10));
		
		
		// 1! = 1 * 1 
		// 2! = 2 * 1 
		// 3! = 3 * 2 * 1
		// 4! = 4 * 3 * 2 * 1
	}
	
	public static int fib(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}
		return (fib(n-1) + fib(n-2));
	}

}
