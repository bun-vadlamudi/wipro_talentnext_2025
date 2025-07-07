
public class Arrays4 {
    public static void main(String[] args) {
        int[] asciiValues = {77, 111, 104, 97, 110, 32, 66, 97, 98, 117, 32, 85, 110, 105, 118, 101, 114, 115, 105, 116, 121}; 

        System.out.print("Output: ");
        for (int value : asciiValues) {
            System.out.print((char) value);
        }
    }
}


