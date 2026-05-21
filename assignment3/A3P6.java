package assignment3;

class EMP {
    String name;
    int id;

    EMP(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return "EMP " + name + " " + id;
    }
}

class Scientist extends EMP {
    int no_of_publication;
    int experience;

    Scientist(String name, int id, int no_of_publication, int experience) {
        super(name, id);
        this.no_of_publication = no_of_publication;
        this.experience = experience;
    }

    public String toString() {
        return "Scientist " + name + " " + id + " " + no_of_publication + " " + experience;
    }
}

class Dscientist extends Scientist {
    String award;

    Dscientist(String name, int id, int no_of_publication, int experience, String award) {
        super(name, id, no_of_publication, experience);
        this.award = award;
    }

    public String toString() {
        return "Dscientist " + name + " " + id + " " + no_of_publication + " " + experience + " " + award;
    }
}

public class A3P6 {
    public static void main(String[] args) {
        EMP e = new EMP("A", 1);
        Scientist s = new Scientist("B", 2, 5, 10);
        Dscientist d = new Dscientist("C", 3, 7, 12, "Medal");
        System.out.println(e);
        System.out.println(s);
        System.out.println(d);
    }
}
