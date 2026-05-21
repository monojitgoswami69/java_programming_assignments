package assignment1;

import java.util.Scanner;

public class A1P29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = Math.abs(sc.nextLong());
        while (!isPalindrome(number)) {
            number += reverse(number);
            System.out.println("Intermediate result: " + number);
        }
        System.out.println("Final result: " + number);
    }

    private static long reverse(long number) {
        long reversed = 0;
        long temp = number;
        while (temp > 0) {
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        }
        return reversed;
    }

    private static boolean isPalindrome(long number) {
        return number == reverse(number);
    }
}
