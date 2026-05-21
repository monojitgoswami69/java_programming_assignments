package assignment4;

abstract class TwoD {
    double length;
    double breadth;

    TwoD(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    abstract double area();
}

class TriangleA4P2 extends TwoD {
    TriangleA4P2(double length, double breadth) {
        super(length, breadth);
    }

    double area() {
        return 0.5 * length * breadth;
    }
}

class SquareA4P2 extends TwoD {
    SquareA4P2(double side) {
        super(side, side);
    }

    double area() {
        return length * breadth;
    }
}

class RectangleA4P2 extends TwoD {
    RectangleA4P2(double length, double breadth) {
        super(length, breadth);
    }

    double area() {
        return length * breadth;
    }
}

public class A4P2 {
    public static void main(String[] args) {
        System.out.println(new TriangleA4P2(10, 5).area());
        System.out.println(new SquareA4P2(6).area());
        System.out.println(new RectangleA4P2(8, 4).area());
    }
}
