package assignment1;

import java.util.Scanner;

public class A1P14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        long sign = number < 0 ? -1 : 1;
        long value = Math.abs(number);
        long reversed = 0;
        if (value == 0) {
            System.out.println(0);
            return;
        }
        while (value > 0) {
            reversed = reversed * 10 + value % 10;
            value /= 10;
        }
        System.out.println(sign * reversed);
    }
}
