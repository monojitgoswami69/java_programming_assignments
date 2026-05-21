package assignment1;

import java.math.BigDecimal;
import java.util.Scanner;

public class A1P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal amount = new BigDecimal(sc.next());
        long paise = amount.movePointRight(2).longValueExact();
        System.out.println(paise + " paise");
    }
}
