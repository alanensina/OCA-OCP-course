package app.section4;

public class SwitchStatement_019 {

    public static void main(String[] args) {
        greetingsIfStatement(0);
        greetingsSwitch(0);
        greetingsSwitchAfterJava14(4);
    }

    /**
     * Example of method using if-else statement
     * @param a - an int number
     */
    public static void greetingsIfStatement(int a){
        if(a == 0){
            System.out.println("Good morning!");
        }
        else if(a == 1){
            System.out.println("Good afternoon!");
        }
        else if(a == 2){
            System.out.println("Good evening!");
        }else{
            System.out.println("Hi!");
        }
    }

    /**
     * This method do the same thing that greetingsIfStatement's method, but using switch
     * @param a - an int number
     */
    public static void greetingsSwitch(int a){

        // Allowed variable types: int (Integer), byte (Byte), short (Short), char (Character), String and enum type
        // Not allowed variables: boolean, long, float and double

        switch(a){ // a is the variable that will be evaluated
            case 0: // 0 is the constant that will be checked with the variable
                System.out.println("Good morning!"); // block of code if the variable matches with the constant
                break; // is optional, but if there's no break, all the following cases will be executed
            case 1:
                System.out.println("Good afternoon!");
                break;
            case 2: // You can combine 2 or more cases to run the same block of code
            case 3:
                System.out.println("Good evening!");
                break;
            default: // it's optional, it will be executed if the variable didn't match with any constant. Also, you can put default in any order, but as a good practice, put in the end.
                System.out.println("Hi!"); // block of code executed
        }
    }

    /**
     * Combineing values after Java 14
     * @param a
     */
    public static void greetingsSwitchAfterJava14(int a){
        switch(a){
            case 0:
                System.out.println("Good morning!");
                break;
            case 1:
                System.out.println("Good afternoon!");
                break;
            case 2: case 3: case 4: // You can put all cases in the same line
                System.out.println("Good evening!");
                break;
            default:
                System.out.println("Hi!");
        }
    }
}
