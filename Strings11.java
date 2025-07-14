package oops;


	import java.util.ArrayList;
	import java.util.Scanner;
	import java.util.StringJoiner;

	public class Strings11 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        ArrayList<String> names = new ArrayList<>();

	        System.out.print("Enter number of names: ");
	        int n = scanner.nextInt();
	        scanner.nextLine(); // Consume the newline

	        // Read names from user
	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter name " + (i + 1) + ": ");
	            names.add(scanner.nextLine());
	        }

	        // Use StringJoiner to join names with comma and enclose in {}
	        StringJoiner joiner = new StringJoiner(", ", "{", "}");
	        for (String name : names) {
	            joiner.add(name);
	        }

	        System.out.println("Output: " + joiner.toString());

	        scanner.close();
	    }
	}


