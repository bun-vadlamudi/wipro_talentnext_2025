package oops;

import java.util.Scanner;

public class Strings8 {
	

	    // Method to remove '*' and its neighboring characters
	    public static String removeStarAndNeighbors(String str) {
	        if (str == null || str.length() == 0) {
	            return "";
	        }

	        StringBuilder result = new StringBuilder();

	        for (int i = 0; i < str.length(); i++) {
	            // If current char is '*', skip it
	            if (str.charAt(i) == '*') {
	                continue;
	            }

	            // If previous char is '*', skip current
	            if (i > 0 && str.charAt(i - 1) == '*') {
	                continue;
	            }

	            // If next char is '*', skip current
	            if (i < str.length() - 1 && str.charAt(i + 1) == '*') {
	                continue;
	            }

	            // Otherwise, include the character
	            result.append(str.charAt(i));
	        }

	        return result.toString();
	    }

	    // Main method
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string with '*': ");
	        String input = scanner.nextLine();

	        String output = removeStarAndNeighbors(input);
	        System.out.println("Output: " + output);

	        scanner.close();
	    }
	}


