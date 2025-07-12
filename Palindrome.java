package oops;
import java.util.Scanner;
public class Palindrome {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input
	        System.out.print("Enter a string: ");
	        String original = scanner.nextLine();

	        // Preprocess: Remove spaces and convert to lowercase
	        String processed = original.replaceAll("\\s+", "").toLowerCase();

	        // Reverse the string
	        String reversed = new StringBuilder(processed).reverse().toString();

	        // Check if palindrome
	        if (processed.equals(reversed)) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is NOT a palindrome.");
	        }

	        scanner.close();
	    }
	}



