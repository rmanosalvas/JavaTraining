package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "Lord of the Rings";
	
		if (bookTitle.contains(wordChoice)) {
			System.out.println("The book contains the word " + wordChoice);
		}
		
		
		String browser = "Chrome";
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is chrome");
		};
		
		String firstName = "Ricardo";
		String lastName = "Manosalvas";
		String SSN = "2123123213";
		
		System.out.print(firstName.substring(0, 1));
		System.out.print(lastName.substring(0, 1));
		
		System.out.println(SSN.substring(5));
		
		System.out.println("There are " + SSN.length() + " digits");
		
		
		
		
		

	}

}
