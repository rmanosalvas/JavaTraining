package Application;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc1 = new BankAccount("648938382", 1000);
//		BankAccount acc2 = new BankAccount("903615141", 2000);
//		BankAccount acc3 = new BankAccount("475923578", 24000);

		acc1.setName("Ricardo");
		System.out.println(acc1.getName());
		acc1.makeDeposit(200);
		acc1.makeDeposit(450);
		acc1.payBill(1000.32);
		acc1.accrue();
		System.out.println(acc1.toString());
		
	}

}

class BankAccount implements IInterest {
	// Properties of bank account
	private static int iD = 1000;	// Internal ID
	private String accountNumber;	// iD + random 2-digit number + furst 2 of SSN
	private String SSN;
	private String name;
	private static final String routingNumber = "0053934891";
	private double balance;
	
	// Constructor
	public BankAccount(String SSN, double initDeposit) {
		System.out.println("New Account created");
		balance = initDeposit;
		this.SSN = SSN;
		iD++;
//		System.out.println(iD);
		setAccountNumber();
	}
	
	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
//		System.out.println(random);
		accountNumber = iD + "" + random + SSN.substring(0,2);
//		System.out.println(accountNumber);
		System.out.println("Your Account Number is: " + accountNumber);
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	public String getName() {
		return name;
	}
	
	public void payBill(double amount) {
		System.out.println("Paying Bill");
		balance = balance - amount;
		showBalance();
	}
	
	public void makeDeposit(double amount) {
		System.out.println("Making a deposit");
		balance = balance + amount;
		showBalance();
	}
	
	public void showBalance() {
		System.out.println("Balance is: " + balance);
	}
	

	@Override
	public void accrue() {
		// TODO Auto-generated method stub
		balance = balance * (1 + rate/100);
		showBalance();
	}
	
	@Override
	public String toString() {
		return "[Name: " + name + " ]\n[Account Numer: " + accountNumber + "]\n[Routing Number: " + routingNumber + "]\n[Balance: " + balance + "]";
	}
	
}
