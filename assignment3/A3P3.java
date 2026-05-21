package assignment3;

class Box {
    double volume;

    Box(double side) {
        volume = side * side * side;
    }

    Box(double radius, double height) {
        volume = Math.PI * radius * radius * height / 3.0;
    }
}

public class A3P3 {
    public static void main(String[] args) {
        Box cube = new Box(3);
        Box cone = new Box(2, 4);
        System.out.println(cube.volume);
        System.out.println(cone.volume);
    }
}
