package assignment1;

import java.util.Scanner;

public class A1P21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        if (number < 0) {
            System.out.println("Not Armstrong Number");
            return;
        }
        String value = Long.toString(number);
        int digits = value.length();
        long sum = 0;
        for (int i = 0; i < value.length(); i++) {
            int digit = value.charAt(i) - '0';
            sum += power(digit, digits);
        }
        System.out.println(sum == number ? "Armstrong Number" : "Not Armstrong Number");
    }

    private static long power(int base, int exponent) {
        long result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}
