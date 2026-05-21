package assignment3;

class Student3 {
    int roll;
    String name;

    Student3(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public String toString() {
        return roll + " " + name;
    }
}

public class A3P5 {
    public static void main(String[] args) {
        Student3 first = new Student3(1, "Ram");
        Student3 second = new Student3(2, "Shyam");
        System.out.println(first);
        System.out.println(second);
    }
}
