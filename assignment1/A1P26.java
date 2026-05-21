package assignment1;

import java.util.Scanner;

public class A1P26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = Math.abs(sc.nextLong());
        while (number >= 10) {
            long product = 1;
            long temp = number;
            while (temp > 0) {
                product *= temp % 10;
                temp /= 10;
            }
            if (number == 0) {
                product = 0;
            }
            System.out.println("Intermediate result: " + product);
            number = product;
        }
        System.out.println("Final result: " + number);
    }
}
