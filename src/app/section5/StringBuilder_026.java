package app.section5;

import java.sql.SQLOutput;

public class StringBuilder_026 {

    public static void main(String[] args) {
        appendExample();
        insertExample();
        deleteExample();
        replaceExample();
        reverseExample();
        toStringExample();
        equalsExample();
        substringExample();
    }

    private static void appendExample() {
        // append() - As far as the StringBuilder is mutable, you don't need to assign a new String to change, works like concatenation
        var name = new StringBuilder("Alan");
        name.append(" Ensina");
        System.out.println(name); // Alan Ensina

        // chaining with append
        name.append(" ").append(true); // chaining is left to right and all params are converted to String
        System.out.println(name); // Alan Ensina true
    }
    private static void insertExample() {
        // insert() - Insert a substring into the index defined, chaining can be applied
        var name = new StringBuilder("Alan Ensina");
        name.insert(4, " Vinicius Cezar");
        System.out.println(name); // Alan Vinicius Cezar Ensina
    }

    private static void deleteExample() {
        // delete() - Removes a characters from an index (inclusive) to another index (exclusive)
        var letters = new StringBuilder("abcdef");
        letters.delete(1,4);
        System.out.println(letters); // aef

        // deleteCharAt() - Removes a character from an index
        var letters2 = new StringBuilder("zxcvb");
        letters2.deleteCharAt(2);
        System.out.println(letters2); // zxvb
    }

    private static void replaceExample() {
        // replace(start, end, text) - Remove characters from start to and end (excluded) and inserts a new String. Note the different syntax that is found on String method replace()
        var letters = new StringBuilder("abcdef");
        letters.replace(1,3, "ALAN");
        System.out.println(letters); // aALANdef

        // If the end index is too large, replace goes through the end of the String (NO EXCEPTION)
        letters.replace(5, 1000, " ENSINA");
        System.out.println(letters); // aALAN ENSINA
    }

    private static void reverseExample() {
        // reverse() - Reverse the String
        var name = new StringBuilder("Schwarzenneger");
        name.reverse();
        System.out.println(name); // regennezrawhcS
    }

    private static void toStringExample() {
        // toString() - return a String object from StringBuilder
        StringBuilder name = new StringBuilder("Alan");
        String nameStr = name.toString();
        System.out.println(nameStr); // Alan
    }

    private static void equalsExample() {
        // StringBuilder doesn't implement equals() method!
        // i.e equals() is the same as ==

        StringBuilder name1 = new StringBuilder("Alan");
        StringBuilder name2 = new StringBuilder("Alan");
        System.out.println(name1 == name2); // false
        System.out.println(name1.equals(name2)); // false

        // If you want to compare the content, convert it back to String
        System.out.println(name1.toString().equals(name2.toString()));// true
    }

    private static void substringExample() {
        // substring() - returns a String and doesn't change the StringBuilder

        StringBuilder name = new StringBuilder("Alan Ensina");
        name.substring(1,3);
        System.out.println(name); // Alan Ensina

        String substring = name.substring(1,3);
        System.out.println(substring); // la
    }
}
