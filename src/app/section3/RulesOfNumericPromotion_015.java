package app.section3;

public class RulesOfNumericPromotion_015 {

    public static void main(String[] args) {

        short a = 17;
        float b = 15;
        double c = 35;
        // a and b are promoted to double, because is the largest, so the result is double.
        System.out.println("a * b / c = " + a * b / c);


        short x = 5;
        short y = 7;
        // x and y are promoted to int, result is int
        System.out.println("x + y = " + x + y);

       // short z = x + y; // DOES NOT COMPILE (you tried to put int into short)
    }

}
