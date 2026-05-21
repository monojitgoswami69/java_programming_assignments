package assignment3;

public class A3P1 {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        A3P1 obj = new A3P1();
        System.out.println(obj.add(1, 2));
        System.out.println(obj.add(1, 2, 3));
        System.out.println(obj.add(1.5, 2.5));
    }
}
