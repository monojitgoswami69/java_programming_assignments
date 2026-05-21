package assignment1;

import java.util.Scanner;

public class A1P15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int terms = sc.nextInt();
        long first = 0;
        long second = 1;
        for (int i = 0; i < terms; i++) {
            System.out.print(first);
            if (i < terms - 1) {
                System.out.print(" ");
            }
            long next = first + second;
            first = second;
            second = next;
        }
    }
}
