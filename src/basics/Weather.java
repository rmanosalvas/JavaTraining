package basics;

public class Weather {
	public static void main(String[] args) {
		// This program will give suggestions of what to wear based on the weather (temperature)
		
		int temperature = 38;
		String sunCondition = "Sunny";
		
		if (temperature > 80) {
			System.out.println("Its pretty pleasant. Wear shorts and t shirt");
		} else if ((temperature > 60) && (sunCondition == "Sunny")) {
			System.out.println("Wear a jacket and pants");
			System.out.println("Wear a hat to keep the sun out of your eyes");
		} else if ((temperature > 50) || (sunCondition == "Overcast")) {
			System.out.println("This is a cool day for coding");
		}
		else {
			System.out.println("Looks like a cold day");
		}
		
		System.out.println("This program is ending");
		
	}
}
