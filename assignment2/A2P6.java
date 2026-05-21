package assignment2;

import java.util.Scanner;

class A2P6Helper {
    long reverse(long n) {
        long value = Math.abs(n);
        long reversed = 0;
        while (value > 0) {
            reversed = reversed * 10 + value % 10;
            value /= 10;
        }
        return reversed;
    }

    boolean isPrime(long n) {
        if (n < 2) {
            return false;
        }
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    boolean isPalindrome(long n) {
        return Math.abs(n) == reverse(n);
    }

    boolean isPerfect(long n) {
        if (n <= 0) {
            return false;
        }
        long sum = 0;
        for (long i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }

    boolean isArmstrong(long n) {
        if (n < 0) {
            return false;
        }
        String s = Long.toString(n);
        int digits = s.length();
        long sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            long pow = 1;
            for (int j = 0; j < digits; j++) {
                pow *= digit;
            }
            sum += pow;
        }
        return sum == n;
    }

    void printPrimes(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

public class A2P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A2P6Helper helper = new A2P6Helper();
        int choice = sc.nextInt();
        long value = sc.nextLong();
        if (choice == 1) {
            System.out.println(helper.reverse(value));
        } else if (choice == 2) {
            System.out.println(helper.isPalindrome(value));
        } else if (choice == 3) {
            helper.printPrimes((int) value);
        } else if (choice == 4) {
            System.out.println(helper.isPerfect(value));
        } else if (choice == 5) {
            System.out.println(helper.isArmstrong(value));
        }
    }
}
