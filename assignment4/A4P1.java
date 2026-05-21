package assignment4;

abstract class BaseA4P1 {
    void show() {
        System.out.println("Concrete method in abstract class");
    }
}

class DerivedA4P1 extends BaseA4P1 {
}

public class A4P1 {
    public static void main(String[] args) {
        DerivedA4P1 obj = new DerivedA4P1();
        obj.show();
    }
}
