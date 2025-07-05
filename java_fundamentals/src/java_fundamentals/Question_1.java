package java_fundamentals;

public class Question_1 {

    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Error: Please provide exactly six command line arguments.");
        }

        String companyName = args[0];
        String location = args[1];

        // Final Output
        System.out.println(args[0] + " Technologies " + args[1]);
        System.out.println(args[2] + " Technologies "+ args[3]);
    }
}


