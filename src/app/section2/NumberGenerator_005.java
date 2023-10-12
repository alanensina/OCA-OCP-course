// Package of the class
package app.section2;

// The Random class was imported
import java.util.Random;

public class NumberGenerator_005 {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        System.out.println("Random number generated: " + randomNumber.nextInt(100));
    }
}
