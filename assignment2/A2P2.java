package assignment2;

class Test1 {
    int x;

    void show() {
        System.out.println(x);
    }
}

public class A2P2 {
    public static void main(String[] args) {
        Test1 t = new Test1();
        t.x = 20;
        t.show();
    }
}
