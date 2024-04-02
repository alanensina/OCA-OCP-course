package app.section4;

public class ForLoop_023 {
    public static void main(String[] args) {
        // Print out number from 0 to 9
        System.out.println("Print out number from 0 to 9:");
        for(int i = 0 ; i < 10; i++){
            System.out.println(i);
        }
        System.out.println("=====================================");

        // You can use more than one index in a for loop separated by coma:
        System.out.println("Print out numbers with more than one index:");
        for(int k = 0, l = 0 ; k+l < 5; k++, l++){
            System.out.println("k: " + k + ", l: " + l);
        }

    }
}
