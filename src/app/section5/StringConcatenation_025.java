package app.section5;

public class StringConcatenation_025 {
    public static void main(String[] args) {

        //Adition:
        System.out.println(3+8);

        // Concatenation
        System.out.println("Alan"+"Ensina");

        // If one element is a String, so is a concatenation:
        System.out.println("Alan" + 33);

        // The order of the concatenation is left to right
        System.out.println(7 + "Alan" + 33); // 7Alan3

        // In this case, the operation is done first on the left and then the concatenation happens
        System.out.println(3+7+"Alan"); //10Alan

        //In this case the operation is done first because of the priority of the parentesis
        System.out.println("Alan" + (3+7)); // Alan10

        //You can concatenate a null to a String
        System.out.println("Alan"+null); //Alannull

        // You can use assignment operators:
        String test = "John";
        test += "Wayne";
        System.out.println(test); //JohnWayne


    }
}
