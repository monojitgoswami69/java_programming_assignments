package assignment1;

import java.util.Scanner;

public class A1P25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int terms = sc.nextInt();
        for (int i = 0; i < terms; i++) {
            char letter = (char) ('A' + (i % 26));
            int number = i % 26 + 1;
            System.out.print("" + letter + number);
            if (i < terms - 1) {
                System.out.print(" ");
            }
        }
    }
}
