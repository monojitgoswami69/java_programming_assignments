package assignment1;

import java.util.Scanner;

public class A1P27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        System.out.println(secondLastDigit(number));
    }

    private static long secondLastDigit(long number) {
        long value = Math.abs(number);
        if (value < 10) {
            return -1;
        }
        return (value / 10) % 10;
    }
}
