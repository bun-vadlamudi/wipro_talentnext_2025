package oops;

import java.util.Scanner;

public class Strings9 {
	

	    // Method to combine characters from two strings alternately
	    public static String mergeAlternating(String a, String b) {
	        StringBuilder result = new StringBuilder();
	        int lenA = a.length();
	        int lenB = b.length();
	        int maxLength = Math.max(lenA, lenB);

	        for (int i = 0; i < maxLength; i++) {
	            if (i < lenA) {
	                result.append(a.charAt(i));
	            }
	            if (i < lenB) {
	                result.append(b.charAt(i));
	            }
	        }

	        return result.toString();
	    }

	    // Main method
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter first string: ");
	        String str1 = scanner.nextLine();

	        System.out.print("Enter second string: ");
	        String str2 = scanner.nextLine();

	        String merged = mergeAlternating(str1, str2);
	        System.out.println("Output: " + merged);

	        scanner.close();
	    }
	}


