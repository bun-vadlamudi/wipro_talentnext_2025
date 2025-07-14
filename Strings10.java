package oops;
import java.util.Scanner;
public class Strings10 {
	

	    // Method to repeat the last n characters of the string n times
	    public static String repeatLastN(String str, int n) {
	        if (str == null || n < 0 || n > str.length()) {
	            return "Invalid input";
	        }

	        String lastN = str.substring(str.length() - n);
	        StringBuilder result = new StringBuilder();

	        for (int i = 0; i < n; i++) {
	            result.append(lastN);
	        }

	        return result.toString();
	    }

	    // Main method
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String inputStr = scanner.nextLine();

	        System.out.print("Enter an integer n (0 to length of string): ");
	        int n = scanner.nextInt();

	        String output = repeatLastN(inputStr, n);
	        System.out.println("Output: " + output);

	        scanner.close();
	    }
	}


