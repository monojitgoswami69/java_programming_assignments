package assignment1;

import java.util.Scanner;

public class A1P30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        if (number <= 0) {
            System.out.println("ERROR");
            return;
        }
        StringBuilder sequence = new StringBuilder();
        while (true) {
            sequence.append(number);
            if (number == 1) {
                break;
            }
            sequence.append(", ");
            if (number % 2 == 0) {
                number /= 2;
            } else {
                number = 3 * number + 1;
            }
        }
        System.out.println(sequence);
    }
}
