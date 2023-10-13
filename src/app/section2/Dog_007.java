package app.section2;

public class Dog_007 {
    private String name = "Chip";

    public Dog_007(){
        // Those two lines will be the 2nd thing to be executed
        name = "Teddy";
        System.out.println("Inside the constructor.");
    }

    {
        System.out.println("Inside of the initializer block."); // This is the 1st thing to be executed
    }

    public static void main(String[] args) {
        Dog_007 dog = new Dog_007();
        System.out.println(dog.name); // This is going to be the 3rd thing to be executed
    }
}
