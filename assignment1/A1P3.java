package assignment1;

import java.util.Arrays;

public class A1P3 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide name and college name.");
            return;
        }
        String name = args[0];
        String college = String.join(" ", Arrays.copyOfRange(args, 1, args.length));
        System.out.println(name + " is a BTECH student of " + college + " college.");
    }
}
