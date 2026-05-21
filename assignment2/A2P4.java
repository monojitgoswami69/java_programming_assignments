package assignment2;

class Student {
    int rollNo;
    String name;
    String stream;
    String college;

    Student(int rollNo, String name, String stream, String college) {
        this.rollNo = rollNo;
        this.name = name;
        this.stream = stream;
        this.college = college;
    }

    public String toString() {
        return rollNo + " " + name + " " + stream + " " + college;
    }
}

public class A2P4 {
    public static void main(String[] args) {
        Student first = new Student(1, "Ram", "CSE", "AOT");
        Student second = new Student(2, "Shyam", "IT", "AOT");
        System.out.println(first);
        System.out.println(second);
    }
}
