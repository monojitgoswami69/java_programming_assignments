package assignment2;

class A2P3Helper {
    A2P3Helper getSelf() {
        return this;
    }

    A2P3Other getOther() {
        return new A2P3Other();
    }
}

class A2P3Other {
}

public class A2P3 {
    public static void main(String[] args) {
        A2P3Helper helper = new A2P3Helper();
        System.out.println(helper.getSelf() != null);
        System.out.println(helper.getOther() != null);
    }
}
