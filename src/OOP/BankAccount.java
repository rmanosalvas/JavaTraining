package OOP;

public class BankAccount implements IRate {

	// Define variables
	String accountNumber;
	
	// Static >>> belongs to the CLASS not the object instance
	// Final >>> constant (often static final)
	private static final String routingNumber = "013456";
	private String name;
	private String ssn;
	String accountType;
	double balance = 0;
	
	// Constructor definitions: unique methods
		// 1. They are used to define / setup / initialize properties of an object
		// 2. Constructors are IMPLICITLY called upon instantiation
		// 3. The same name as the class itself
		// 4. Constructors have no RETURN type
	BankAccount() {
		System.out.println("New Account created");
	}
	// Overloading: call same method name iwth different arguments
	
	BankAccount(String accountType) {
		System.out.println("New account created: " + accountType);
	}

	BankAccount(String accountType, double initDeposit) {
		// initDeposit, accountType, Msg are all local variables
		System.out.println("New account created: " + accountType);
		System.out.println("Initional deposit of: " + initDeposit);
		String Msg = null; 
		if (initDeposit < 1000) {
			Msg = ("ERROR: min deposit must be at least $1000");
		} else {
			Msg = ("Thanks for your initial deposit of : $" + initDeposit);
		}
		System.out.println(Msg);
		balance = balance + initDeposit;
	}
	
	
	// Getters / Setters
	
	// Allow user to define the name
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	
	
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	
	// Interface methods
	public void setRate() {
		
	}
	
	public void increaseRate() {
		
	}
	
	
	

	// Define methods
	void deposit(double amount) {
		balance = balance + amount;
		System.out.println(balance);
		showActivity("Deposit");
	}
	
	void withdraw(double amount) {
		balance = balance - amount;
		showActivity("Withdraw");
	}
	
	private void showActivity(String activity) {
		System.out.println("Showing recent activity: " + activity);
		System.out.println("Your most recent balance is: " + balance);
	}
	
	void checkBalance() {
		System.out.println("Balance is: $" + balance);
	}
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[ " + name + ". " + accountNumber + ". Balance: $" + balance + " ]"; 
	}

}
