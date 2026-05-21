package assignment1;

import java.util.Scanner;

public class A1P24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int terms = sc.nextInt();
        for (int i = 0; i < terms; i++) {
            char first = (char) ('A' + (2 * i) % 26);
            char second = (char) ('M' + (2 * i) % 26);
            System.out.print("" + first + second + second);
            if (i < terms - 1) {
                System.out.print(" ");
            }
        }
    }
}
