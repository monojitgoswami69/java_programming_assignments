package assignment3;

class Addition {
    int x;
    int y;
    int z;

    Addition() {
        this(0, 0, 0);
    }

    Addition(int x, int y) {
        this(x, y, 0);
    }

    Addition(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

public class A3P2 {
    public static void main(String[] args) {
        Addition a1 = new Addition();
        Addition a2 = new Addition(1, 2);
        Addition a3 = new Addition(1, 2, 3);
        System.out.println(a1.x + a1.y + a1.z);
        System.out.println(a2.x + a2.y + a2.z);
        System.out.println(a3.x + a3.y + a3.z);
    }
}
