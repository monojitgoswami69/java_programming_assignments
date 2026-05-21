package assignment1;

import java.util.Scanner;

public class A1P11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        first ^= second;
        second ^= first;
        first ^= second;
        System.out.println(first);
        System.out.println(second);
    }
}
