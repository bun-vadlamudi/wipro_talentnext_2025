package oops;

import java.util.Optional;

public class Strings14 {

    public static void main(String[] args) {
        String address = null; // You can also try with a value like "Mumbai"

        // Use Optional to handle null safely
        String result = Optional.ofNullable(address).orElse("India");

        System.out.println("Address: " + result);
    }
}

