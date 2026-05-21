package assignment1;

import java.util.Random;
import java.util.Scanner;

public class A1P31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int target = random.nextInt(100) + 1;
        int attempts = 7;
        while (attempts > 0) {
            System.out.println("Guess a number between 1 and 100:");
            int guess = sc.nextInt();
            if (guess == target) {
                System.out.println("Correct");
                return;
            }
            if (guess < target) {
                System.out.println("Higher");
            } else {
                System.out.println("Lower");
            }
            attempts--;
        }
        System.out.println("Game Over. The number was " + target);
    }
}
