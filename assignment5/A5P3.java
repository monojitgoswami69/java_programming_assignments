package assignment5;

import java.util.ArrayList;
import java.util.Scanner;

public class A5P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        if (list.size() >= 2) {
            int first = Integer.MAX_VALUE;
            int second = Integer.MAX_VALUE;
            for (int value : list) {
                if (value < first) {
                    second = first;
                    first = value;
                } else if (value > first && value < second) {
                    second = value;
                }
            }
            if (second != Integer.MAX_VALUE) {
                list.remove(Integer.valueOf(second));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}
