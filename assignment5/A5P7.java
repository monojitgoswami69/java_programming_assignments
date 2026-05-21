package assignment5;

import java.util.Scanner;

public class A5P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int[][] arr = new int[rows][];
        for (int i = 0; i < rows; i++) {
            int cols = sc.nextInt();
            arr[i] = new int[cols];
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
