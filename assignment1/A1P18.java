package assignment1;

import java.util.Scanner;

public class A1P18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        long value = Math.abs(number);
        long reversed = 0;
        long temp = value;
        while (temp > 0) {
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        }
        System.out.println(value == reversed ? "Palindrome" : "Not Palindrome");
    }
}
