package oops;
class Calculator {
    // Static method to calculate power with integer values
    public static int powerInt(int num1, int num2) {
        return (int)Math.pow(num1, num2);  // Math.pow returns double, so we cast it to int
    }

    // Static method to calculate power with double base
    public static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2); // No need to cast, return type is already double
    }
}

public class Main2 {
    public static void main(String[] args) {
        // Testing powerInt
        int result1 = Calculator.powerInt(2, 3); // 2^3 = 8
        System.out.println("powerInt(2, 3): " + result1);

        // Testing powerDouble
        double result2 = Calculator.powerDouble(2.5, 3); // 2.5^3 = 15.625
        System.out.println("powerDouble(2.5, 3): " + result2);
    }
}


 


