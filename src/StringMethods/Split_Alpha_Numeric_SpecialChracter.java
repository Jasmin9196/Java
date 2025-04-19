package StringMethods;

public class Split_Alpha_Numeric_SpecialChracter {

	public static void main(String[] args) {
		
		 String input = "Welcome234To567Java89Programming0@#!!";

	        // Extracting letters
	        String letters = input.replaceAll("[^A-Za-z]", ""); // Keeps only letters
	        // Extracting digits
	        String digits = input.replaceAll("[^0-9]", ""); // Keeps only digits
	        // Extracting special characters
	        String specialChars = input.replaceAll("[A-Za-z0-9]", ""); // Keeps only special characters

	        System.out.println("Letters: " + letters);
	        System.out.println("Digits: " + digits);
	        System.out.println("Special Characters: " + specialChars);
	    }
	


	}


