package basics;

public class Cities {

	public static void main(String[] args) {
		// Declare and define an array
		String[] cities = {"New York", "San Francisco", "Miami", "Dallas"};
		System.out.println(cities[1]);
		

		
		// Declare an array 
		String[] countries;
		
		countries = new String[3];
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "Mexico";
		
		System.out.println(countries[2]);
		
		
		// Declare the array
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Utah";
		states[4] = "Texas";
		

		System.out.println(states[2]);
		
		
		System.out.println("*********");
		
		int i = 0;
		
		// Do Loop: enters the loop THEN tests condition
		do {
			System.out.println("State " + states[i]);
			i = i + 1;
		} while (i < 5);
		
		
		System.out.println("*********");
		
		// While Loop: tests condition first then enters loop
		int n = 0;
		boolean stateFound = false;
		while (!stateFound) {
			String state = states[n];
			
			if (state == "Utah") {
				stateFound = true;
				System.out.println(stateFound);
			}
			System.out.println("* State: " + states[n] + " *");
			n++;
		}
		
		System.out.println("*********");
		
		
		// For Loop: best structure for iterating through an array
		for (int x = 0; x < 5; x++) {
			System.out.println(states[x]);
		}
		
		
	}

}
