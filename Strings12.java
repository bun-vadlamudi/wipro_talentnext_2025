package oops;


	import java.util.StringJoiner;

	public class Strings12 {

	    public static void main(String[] args) {
	        // Create StringJoiners for two sets of cities
	        StringJoiner s1 = new StringJoiner("-", "[", "]");
	        s1.add("Delhi");
	        s1.add("Mumbai");
	        s1.add("Chennai");

	        StringJoiner s2 = new StringJoiner("-", "[", "]");
	        s2.add("Hyderabad");
	        s2.add("Bangalore");
	        s2.add("Kolkata");

	        // i) s1 merged to s2 → s2 will now contain all cities of s1 + s2
	        StringJoiner s2Merged = new StringJoiner("-", "[", "]");
	        s2Merged.merge(s1);
	        s2Merged.merge(s2);
	        System.out.println("i) s1 merged to s2: " + s2Merged);

	        // ii) s2 merged to s1 → s1 will now contain all cities of s2 + s1
	        StringJoiner s1Merged = new StringJoiner("-", "[", "]");
	        s1Merged.merge(s2);
	        s1Merged.merge(s1);
	        System.out.println("ii) s2 merged to s1: " + s1Merged);
	    }
	}


