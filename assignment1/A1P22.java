package assignment1;

import java.math.BigInteger;
import java.util.Scanner;

public class A1P22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        BigInteger value = new BigInteger(binary, 2);
        System.out.println(value.toString(8));
    }
}
