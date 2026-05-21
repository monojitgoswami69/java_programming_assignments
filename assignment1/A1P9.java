package assignment1;

import java.util.Scanner;

public class A1P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean leap = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
        System.out.println(leap ? "Leap Year" : "Not Leap Year");
    }
}
