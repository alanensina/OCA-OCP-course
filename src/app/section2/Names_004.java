package app.section2;

/**
 * To compile and run:
 * javac Names_004.java
 * java Names Alan Ensina
 * Note: If you don't provide at least 2 args, an exception will be thrown: index out of bounds
 */
public class Names_004 {

    public static void main(String[] args) {
        System.out.println("First name: " + args[0]); // arrays starts at 0 index
        System.out.println("Second name: " + args[1]);
    }
}