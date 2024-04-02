package app.section4;

public class ForEachLoop_024 {
    public static void main(String[] args) {

        String[] cars = {"Ford", "Renault", "Fiat", "Honda", "Kia"};
        System.out.println("Printing all elements of array using a normal for: ");
        for(int i = 0 ; i < cars.length ; i++){
            System.out.println(cars[i]);
        }
        System.out.println("===========================================");

        System.out.println("Printing all elements of array using for-each loop: ");
        for(String car : cars){
            System.out.println(car);
        }
        System.out.println("===========================================");

        // Example of Java 17:
        System.out.println("Printing all elements of array using for-each loop (Java 17): ");
        for(var car : cars){
            System.out.println(car);
        }

    }
}
