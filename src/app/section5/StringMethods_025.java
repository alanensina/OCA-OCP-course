package app.section5;

import java.sql.SQLOutput;

public class StringMethods_025 {
    public static void main(String[] args) {
        String name = "Alan";

        lengthExample(name);
        charAtExample(name);
        indexOfExamples();
        substringExamples();
        toLowerCaseAndUpperCaseExamples();
        equalsAndEqualsIgnoreCaseExamples();

    }


    private static void lengthExample(String name) {
        //length() - length of the String
        System.out.println(name.length()); // 4
    }

    private static void charAtExample(String name) {
        //charAt(index) - Get the char located in the index, if the index doesn't exists, a StringIndexOutOfBoundsException
        System.out.println(name.charAt(3)); // 'n'
    }

    private static void indexOfExamples() {
        // indexOf(char) - It will return the index of a char in the String in his FIRST APPEARANCE
        String surname = "Ensina";
        System.out.println(surname.indexOf('n')); // 1

        // You can put a parameter to start from that index, in this case, the first char n will be ignorated
        System.out.println(surname.indexOf('n', 2)); // 4

        // You can pass a String and this combination will be searched, and the first index will be printed if found.
        System.out.println(surname.indexOf("ina")); // 3

        // Starting from a index defined
        System.out.println(surname.indexOf("ina",2)); // 3

        // If the char is not found, a -1 will be returned
        System.out.println(surname.indexOf("P")); // -1
    }

    private static void substringExamples() {
        String fullName = "Alan Ensina";

        //substring() - creates a new String from an index till the end of the String, the char of the index will be included
        System.out.println(fullName.substring(5)); //Ensina

        // You can put a range, but the second index will be not included:
        System.out.println(fullName.substring(2,6)); //an E

        System.out.println(fullName.substring(2,2)); // empty string

        // Be carefull with the index, or an StringIndexOutOfBoundsException will be thrown
    }

    private static void toLowerCaseAndUpperCaseExamples() {
        // toLowerCase() - Put all characters in lower case
        String name = "AlAN EnSiNa";
        System.out.println(name.toLowerCase()); // alan ensina

        // toUpperCase() - Put all characters in upper case
        System.out.println(name.toUpperCase()); // ALAN ENSINA
    }

    private static void equalsAndEqualsIgnoreCaseExamples() {
       String name1 = "Alan";
       String name2 = "alan";
       String name3 = "Alan";

        System.out.println(name1 == name2); // false, because is not referencing the same object

        // equals() -  compare the content if is the same
        // equalsIgnoreCase() - compare the content if is the same, but ignoring the case sensitive
        System.out.println(name1.equals(name2)); // false because the content is not the same
        System.out.println(name1.equals(name3)); // true because the content is the same
        System.out.println(name1.equalsIgnoreCase(name2)); // true because the content is the same ignoring the case sensitive
    }




}
