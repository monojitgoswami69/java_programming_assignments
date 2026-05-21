package assignment3;

class BaseShow2 {
    void show() {
        System.out.println("BaseShow2");
    }
}

class DerivedShow21 extends BaseShow2 {
    void show() {
        System.out.println("DerivedShow21");
    }
}

class DerivedShow22 extends BaseShow2 {
    void show() {
        System.out.println("DerivedShow22");
    }
}

class DerivedShow23 extends BaseShow2 {
    void show() {
        System.out.println("DerivedShow23");
    }
}

public class A3P8 {
    public static void main(String[] args) {
        BaseShow2[] items = { new DerivedShow21(), new DerivedShow22(), new DerivedShow23() };
        for (BaseShow2 item : items) {
            item.show();
        }
    }
}
