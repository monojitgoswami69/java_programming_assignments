package assignment1;

public class A1P2 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide the college name.");
            return;
        }
        System.out.println(String.join(" ", args));
    }
}
