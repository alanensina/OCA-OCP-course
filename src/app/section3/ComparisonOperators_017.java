package app.section3;

public class ComparisonOperators_017 {

    public static void main(String[] args) {
        isInteger(5);
        isInteger(3.14);
        isInteger("Alan");
    }

    /**
     * Integer is a subtype of Number
     * @param num
     */
    public static void isInteger(Object num){
        if(num instanceof Number){
            System.out.println(num + " is an Integer.");
        } else {
            System.out.println(num + " is not an Integer.");
        }
    }
}
