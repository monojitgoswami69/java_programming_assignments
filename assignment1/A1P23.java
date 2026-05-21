package assignment1;

import java.util.Scanner;

public class A1P23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int terms = sc.nextInt();
        for (int i = 0; i < terms; i++) {
            char first = (char) ('A' + (i % 26));
            char second = first == 'Z' ? 'A' : (char) (first + 1);
            System.out.print("" + first + second + first);
            if (i < terms - 1) {
                System.out.print(" ");
            }
        }
    }
}
