package assignment1;

public class A1P7 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two numbers.");
            return;
        }
        double first = Double.parseDouble(args[0]);
        double second = Double.parseDouble(args[1]);
        System.out.println("Addition: " + (first + second));
        System.out.println("Subtraction: " + (first - second));
        System.out.println("Multiplication: " + (first * second));
        System.out.println("Division: " + (first / second));
        System.out.println("Modulus: " + (first % second));
    }
}
