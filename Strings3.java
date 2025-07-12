package oops;
import java.util.Scanner;
public class Strings3 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        int length = input.length();

	        // If the string has less than 2 characters, repeat the full string
	        String firstTwo = input.length() < 2 ? input : input.substring(0, 2);

	        StringBuilder result = new StringBuilder();

	        // Append 'n' copies of firstTwo
	        for (int i = 0; i < length; i++) {
	            result.append(firstTwo);
	        }

	        // Output
	        System.out.println("Result: " + result.toString());

	        scanner.close();
	    }
	}



