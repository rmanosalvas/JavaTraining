package OOP;

public class BankAccountApp {

	public static void main(String[] args) {
		// Creating a new bank account >>> think instantiate an object
		
		BankAccount acc1 = new BankAccount();
		acc1.accountNumber = "1232133";
//		acc1.name = "Ricardo";
//		acc1.balance = 10000;
		acc1.setSsn("2343222");
		System.out.println("Your SSN is: " + acc1.getSsn());
//		System.out.println(acc1.toString());
//		
//		acc1.deposit(2000);
//		acc1.deposit(100);
//		acc1.deposit(90);
		acc1.withdraw(3000);
		
		acc1.setRate();
		acc1.increaseRate();

		acc1.setName("Esperanza");
		System.out.println(acc1.getName());
		
		
		
		// Polymorphism through overloading
//	 	BankAccount acc2 = new BankAccount("Checking Account");
//		acc2.accountNumber = "34535345";
//		
//		BankAccount acc3 = new BankAccount("Savings Account", 5000);
//		acc3.accountNumber = "48345345";
//		
//		System.out.println(acc1.routingNumber);
//		System.out.println(acc2.routingNumber);
//		System.out.println(acc3.routingNumber);
//		
//		acc3.checkBalance();
//		
//		
//		// Demo for inheritance
//		
//		CDAccount cd1 = new CDAccount();
//		cd1.compount();
//		cd1.balance = 30000;
//		cd1.interestRate = "4.5";
//		cd1.name = "Charles";
//		cd1.accountType = "My own jaunt";
//		System.out.println(cd1.toString());
//		cd1.compount();
//		
	}

}
