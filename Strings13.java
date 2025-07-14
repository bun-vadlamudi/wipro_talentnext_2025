package oops;

import java.util.Optional;

public class Strings13 {

    public static void main(String[] args) {
        String[] names = new String[5]; // All elements are null by default

        // Wrap names[0] with Optional to safely access its length
        Optional<String> optionalName = Optional.ofNullable(names[0]);

        int length = optionalName.map(String::length).orElse(0); // Returns 0 if null

        System.out.println("Length: " + length);
    }
}

