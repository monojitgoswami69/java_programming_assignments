package assignment4;

class AnimalA4P3 {
    String food;
    String motion;

    AnimalA4P3(String food, String motion) {
        this.food = food;
        this.motion = motion;
    }
}

class MammalA4P3 extends AnimalA4P3 {
    String hair;
    String milk;

    MammalA4P3(String food, String motion, String hair, String milk) {
        super(food, motion);
        this.hair = hair;
        this.milk = milk;
    }
}

class ReptileA4P3 extends AnimalA4P3 {
    String scales;
    String blood;

    ReptileA4P3(String food, String motion, String scales, String blood) {
        super(food, motion);
        this.scales = scales;
        this.blood = blood;
    }
}

class HumanA4P3 extends MammalA4P3 {
    String language;

    HumanA4P3() {
        super("Food", "Walk", "Hair", "Milk");
        language = "Speak";
    }
}

class CowA4P3 extends MammalA4P3 {
    String horn;

    CowA4P3() {
        super("Grass", "Walk", "Hair", "Milk");
        horn = "Yes";
    }
}

class SnakeA4P3 extends ReptileA4P3 {
    String venom;

    SnakeA4P3() {
        super("Flesh", "Crawl", "Scales", "Cold blooded");
        venom = "Yes";
    }
}

class CrocodileA4P3 extends ReptileA4P3 {
    String water;

    CrocodileA4P3() {
        super("Fish", "Crawl", "Scales", "Cold blooded");
        water = "Lives in water";
    }
}

public class A4P3 {
    public static void main(String[] args) {
        System.out.println(new HumanA4P3().language);
        System.out.println(new CowA4P3().horn);
        System.out.println(new SnakeA4P3().venom);
        System.out.println(new CrocodileA4P3().water);
    }
}
