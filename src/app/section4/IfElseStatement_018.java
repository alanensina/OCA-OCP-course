package app.section4;

public class IfElseStatement_018 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        /**
         * First example
         */
        if(a < b){ // is true because a = 1 and b = 2
            System.out.println("a < b"); // This block of code will be executed
        }
        else if(a > b){ // is false because a = 1 and b = 2
            System.out.println("a > b");
        }
        else{
            System.out.println("a == b");
        }

        /**
         * Second example
         */
        if(a > c){ // is false because a = 1 and c = 3
            System.out.println("a > c");
        }
        else if(c > b){ // is true because c = 3 and b = 2
            System.out.println("c > b"); // This block of code will be executed
        }
        else{ //
            System.out.println("c == b");
        }

        /**
         * Third example
         */
        if(a > c && b > c){ // is false because a = 1 and b = 2 and c = 3
            System.out.println("a > c and b > c");
        }
        else if(c < b || a == b){ // is false because a = 1 and b = 2 and c = 3
            System.out.println("c < b or a == b");
        }
        else{ // First and second condition wasn't reached, so, else statement will be thrown
            System.out.println("Else statement reached!"); // This block of code will be executed
        }



    }
}
