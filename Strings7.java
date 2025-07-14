package oops;

import java.util.Scanner;

public class Strings7 {

	    // Method to remove 'x' from start and end if present
	    public static String removeX(String str) {
	        if (str == null || str.isEmpty()) {
	            return str;
	        }

	        if (str.startsWith("x")) {
	            str = str.substring(1);
	        }

	        if (str.endsWith("x")) {
	            str = str.substring(0, str.length() - 1);
	        }

	        return str;
	    }

	    // Main method
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        String result = removeX(input);
	        System.out.println("Output: " + result);

	        scanner.close();
	    }
	}

