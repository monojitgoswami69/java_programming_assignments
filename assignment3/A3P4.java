package assignment3;

public class A3P4 {
    double volume;

    A3P4(double side) {
        volume = side * side * side;
    }

    A3P4(double radius, double height) {
        volume = Math.PI * radius * radius * height / 3.0;
    }

    public static void main(String[] args) {
        A3P4 cube = new A3P4(3);
        A3P4 cone = new A3P4(2, 4);
        System.out.println(cube.volume);
        System.out.println(cone.volume);
    }
}
