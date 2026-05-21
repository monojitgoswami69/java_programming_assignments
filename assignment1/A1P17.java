package assignment1;

import java.util.Scanner;

public class A1P17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = n * (n + 1) / 2;
        System.out.println(sum);
    }
}
