package assignment1;

import java.util.Scanner;

public class A1P28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int room = 1;
        while (room != 10) {
            System.out.println("You are in Room " + room);
            System.out.println("Enter a direction:");
            String direction = sc.nextLine().trim().toLowerCase();
            int nextRoom = move(room, direction);
            if (nextRoom == room) {
                System.out.println("Invalid move");
            } else {
                room = nextRoom;
            }
        }
        System.out.println("You reached Room 10 and won.");
    }

    private static int move(int room, String direction) {
        switch (room) {
            case 1:
                if (direction.equals("north")) return 2;
                if (direction.equals("east")) return 3;
                break;
            case 2:
                if (direction.equals("south")) return 1;
                if (direction.equals("east")) return 4;
                break;
            case 3:
                if (direction.equals("west")) return 1;
                if (direction.equals("north")) return 4;
                break;
            case 4:
                if (direction.equals("west")) return 2;
                if (direction.equals("south")) return 3;
                if (direction.equals("east")) return 5;
                break;
            case 5:
                if (direction.equals("west")) return 4;
                if (direction.equals("north")) return 6;
                break;
            case 6:
                if (direction.equals("south")) return 5;
                if (direction.equals("east")) return 7;
                break;
            case 7:
                if (direction.equals("west")) return 6;
                if (direction.equals("north")) return 8;
                break;
            case 8:
                if (direction.equals("south")) return 7;
                if (direction.equals("east")) return 9;
                break;
            case 9:
                if (direction.equals("west")) return 8;
                if (direction.equals("east")) return 10;
                break;
            default:
                break;
        }
        return room;
    }
}
