package oops;
import java.util.Scanner;
public class Strings6 {
	

	    // Method to return string in short+long+short format
	    public static String shortLongShort(String a, String b) {
	        if (a.length() < b.length()) {
	            return a + b + a;
	        } else {
	            return b + a + b;
	        }
	    }

	    // Main method
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter first string: ");
	        String str1 = scanner.nextLine();

	        System.out.print("Enter second string: ");
	        String str2 = scanner.nextLine();

	        String result = shortLongShort(str1, str2);
	        System.out.println("Output: " + result);

	        scanner.close();
	    }
	}


