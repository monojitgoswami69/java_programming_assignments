package assignment1;

import java.util.Scanner;

public class A1P12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principal = sc.nextDouble();
        double time = sc.nextDouble();
        double rate = sc.nextDouble();
        double simpleInterest = principal * time * rate / 100;
        System.out.println(simpleInterest);
    }
}
