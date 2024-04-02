package app.section4;

public class WhileLoop_021 {

    public static void main(String[] args) {

        // Print out number from 0 to 9
        System.out.println("===============================");
        System.out.println("Print out number from 0 to 9:");
        int i = 0;
        while(i<10){
            System.out.println(i);
            i++;
        }

        System.out.println("===============================");

        // Example of a body that will never be executed
        int a = 5;
        int b = 7;

        while (a > b){
            System.out.println("a > b");
        }

        // Example of infinite loop (BE CAREFUL)
//        while (a < b){
//            System.out.println("a < b");
//        }

        // Example 2:
//        while(true){
//            System.out.println("Infinite loop!");
//        }

        // Break statement example
        System.out.println("Example with break statement:");
        int x = 0;
        while(true){
            System.out.println(x);
            if(x == 10) break;
            x++;
        }
        System.out.println("===============================");

        // Nested loops example:
        System.out.println("Example with nested loops:");
        int h = 0;
        int j = 0;
        while(h < 3){
            h++;
            j = 0;
            while(j < 3){
                j++;
                System.out.println("(" + h + ", " + j + ") ");
            }
        }
        System.out.println("===============================");

        // Using break in nested loops:
        System.out.println("Using break in nested loops:");
        int m = 0;
        int n = 0;
        while(true) {
            m++;
            n = 0;
            while (true) {
                n++;
                System.out.println("(" + m + ", " + n + ") ");

                if(n == 3) break;
            }

            if(m == 3) break;
        }
        System.out.println("===============================");

        // Using break in nested loops, with labels:
        System.out.println("Using break in nested loops, with labels:");
        int p = 0;
        int q = 0;
        OUTER_LOOP: while(true) {
            p++;
            q = 0;
            INNER_LOOP: while (true) {
                q++;
                System.out.println("(" + p + ", " + q + ") ");

                if(q == 3) break OUTER_LOOP; // Will break the outer loop when the inner loop reaches 3.
            }
        }
        System.out.println("===============================");

        // Continue statement skips one iteration of the loop
        // task: print all even numbers between 0 and 20

        System.out.println("Printing all even numbers between 0 and 20:");
        int k = -1;
        while(k<21){
            k++;
            if(k%2==1) continue;
            System.out.println(k);
        }
        System.out.println("===============================");

        printPairs();
        System.out.println("===============================");
    }

    // Return statements breaks the execution of the loop and exits the method.
    private static void printPairs() {
        System.out.println("Example with return statement:");
        int h = 0;
        int j = 0;
        while(true){
            h++;
            while(true){
                j++;
                System.out.println("(" + h + ", " + j + ") ");
                if(j == 4) return;
            }
        }
    }
}
