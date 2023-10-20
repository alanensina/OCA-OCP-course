package app.section3;

public class AssignmentOperator_016 {

    public static void main(String[] args) {
        // Example of exam trick:
        int x = 5;
        int y = (x = 3) * 2; // x is setted to 3
        System.out.println("x: " + x);
        System.out.println("y: " + y);


        // Example of exam trick:
        boolean isOK = false;
        if(isOK = true){
            System.out.println("A"); // THAT WILL BE PRINTED BECAUSE ISOK WAS SETTED TO TRUE
        }else{
            System.out.println("B");
        }


        if(isOK == false){
            System.out.println("A");
        }else{
            System.out.println("B"); // THAT WILL BE PRINTED BECAUSE ISOK now is true
        }
    }
}
