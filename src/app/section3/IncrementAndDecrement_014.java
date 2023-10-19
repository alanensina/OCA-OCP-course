package app.section3;

public class IncrementAndDecrement_014 {
    public static void main(String[] args) {
        int a = 1;
        int b = a++; // Returns the old value
        System.out.println("a: " + a); // 2
        System.out.println("b: " + b); // 1

        int c = 2;
        int d = ++c;
        System.out.println("c: " + c); // 3
        System.out.println("d: " + d); // 3
    }
}
