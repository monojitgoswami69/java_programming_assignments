package assignment1;

import java.util.Scanner;

public class A1P16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println(0);
            return;
        }
        if (n == 1) {
            System.out.println(0);
            return;
        }
        if (n == 2) {
            System.out.println(1);
            return;
        }
        long first = 0;
        long second = 1;
        long next = 0;
        for (int i = 3; i <= n; i++) {
            next = first + second;
            first = second;
            second = next;
        }
        System.out.println(next);
    }
}
