package assignment5;

import java.util.Scanner;

public class A5P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        k %= n;
        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[i] = arr[(i + k) % n];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(rotated[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
    }
}
