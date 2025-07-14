package oops;
import java.util.Scanner;
public class Strings4 {
	
	    // Method to return first half of the string if even, otherwise null
	    public static String getFirstHalf(String input) {
	        if (input == null || input.length() % 2 != 0) {
	            return null;
	        }
	        return input.substring(0, input.length() / 2);
	    }

	    // Main method
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String userInput = scanner.nextLine();

	        String result = getFirstHalf(userInput);
	        System.out.println("Output: " + result);

	        scanner.close();
	    }
	}


