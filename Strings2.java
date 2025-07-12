package oops;
import java.util.Scanner;
public class Strings2 
{

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input
	        System.out.print("Enter first string: ");
	        String str1 = scanner.nextLine().toLowerCase();

	        System.out.print("Enter second string: ");
	        String str2 = scanner.nextLine().toLowerCase();

	        // Check for double char at the junction
	        if (str1.charAt(str1.length() - 1) == str2.charAt(0)) {
	            // Remove first character from second string
	            str2 = str2.substring(1);
	        }

	        // Concatenate with a space in between
	        String result = str1 + " " + str2;

	        // Output
	        System.out.println("Result: " + result);

	        scanner.close();
	    }
	}


