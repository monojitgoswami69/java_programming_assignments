package assignment1;

import java.util.Scanner;

public class A1P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(number << 1);
        System.out.println(number >> 2);
    }
}
