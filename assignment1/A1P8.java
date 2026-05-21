package assignment1;

import java.util.Scanner;

public class A1P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        System.out.println(number % 2 == 0 ? "Even" : "Odd");
    }
}
