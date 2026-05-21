package assignment3;

class BaseShow {
    void show() {
        System.out.println("BaseShow");
    }
}

class DerivedShow1 extends BaseShow {
    void show() {
        System.out.println("DerivedShow1");
    }
}

class DerivedShow2 extends BaseShow {
    void show() {
        System.out.println("DerivedShow2");
    }
}

class DerivedShow3 extends BaseShow {
    void show() {
        System.out.println("DerivedShow3");
    }
}

public class A3P7 {
    public static void main(String[] args) {
        BaseShow a = new DerivedShow1();
        BaseShow b = new DerivedShow2();
        BaseShow c = new DerivedShow3();
        a.show();
        b.show();
        c.show();
    }
}
