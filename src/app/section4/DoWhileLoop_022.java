package app.section4;

public class DoWhileLoop_022 {

    public static void main(String[] args) {

        // Print out numbers from 0 to 9 using do/while loop
        int i = 0 ;
        System.out.println("Print out numbers from 0 to 9 using do/while loop:");
        do{
            System.out.println(i);
            i++;
        } while (i < 10);
        System.out.println("=========================================");

        // Example of a body executed at least once:
        int k = 0 ;
        int j = 5;
        System.out.println("Example of a body executed at least once:");
        do{
            // Will be printed just once
            System.out.println(k);
            k++;
        } while (k > j);
        System.out.println("=========================================");
    }
}
