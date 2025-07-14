package oops;
import java.util.Scanner;
public class Strings5 {
	

	    // Method to remove the first and last character
	    public static String removeFirstAndLast(String input) {
	        if (input == null || input.length() <= 2) {
	            return ""; // Return empty string if input is too short
	        }
	        return input.substring(1, input.length() - 1);
	    }

	    // Main method
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String userInput = scanner.nextLine();

	        String result = removeFirstAndLast(userInput);
	        System.out.println("Output: " + result);

	        scanner.close();
	    }
	}


