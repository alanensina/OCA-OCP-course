package app.section5;

public class StringMethods_025 {
    public static void main(String[] args) {
        lengthExample();
        charAtExample();
        indexOfExamples();
        substringExamples();
        toLowerCaseAndUpperCaseExamples();
        equalsAndEqualsIgnoreCaseExamples();
        startsWithExample();
        endsWithExample();
        containsExample();
        replaceExample();
        stripAndTrimExample();
        stripLeadingAndStripTrailingExample();
        indentandStripIndentExample();
        translateEscapesExample();
        isBlankAndIsEmptyExample();

    }




    private static void lengthExample() {
        String name = "Alan";
        //length() - length of the String
        System.out.println(name.length()); // 4
    }

    private static void charAtExample() {
        String name = "Alan";
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

    private static void startsWithExample() {
        // startsWith() - Compare the start of the String and return a boolean value
        System.out.println("Alan".startsWith("A")); // true
        System.out.println("Alan".startsWith("Al")); // true
        System.out.println("Alan".startsWith("a")); // false
    }

    private static void endsWithExample() {
        // endsWith() - Compare the end of the String and return a boolean value
        System.out.println("Alan".endsWith("n")); // true
        System.out.println("Alan".endsWith("an")); // true
        System.out.println("Alan".endsWith("d")); // false
    }

    private static void containsExample() {
        // contains() - Verify if the String contains a substring and return a boolean value
        String name = "Alan";
        System.out.println(name.contains("A")); // true
    }

    private static void replaceExample() {
        // replace() - replace a char/String to another char/String into the String
        String name = "Alan";
        System.out.println(name.replace('l', 'd').replace('n', 'm')); // Adam
        System.out.println(name.replace("la", "to")); // Aton
    }

    private static void stripAndTrimExample() {
        //  Whitespaces also includes \t (tab), \n (new line), \r (carriage return). All escape sequences count as one character in length
        // strip() - remove the whitespaces from beginning and end of the String
        String name = "      Alan           ";
        System.out.println("|" + name.strip() + "|"); // |Alan|

        // trim() - same as strip, but supports Unicode
        System.out.println("|" + name.trim() + "|"); // |Alan|
    }
    private static void stripLeadingAndStripTrailingExample() {
        // stripLeading() - remove the whitespaces ONLY in the beginning of the String
        String name = "      Alan           ";
        System.out.println("|" + name.stripLeading() + "|"); // |Alan           |

        // stripTrailing() - remove the whitespaces ONLY in the end of the String
        System.out.println("|" + name.stripTrailing() + "|"); // |      Alan|
    }

    private static void indentandStripIndentExample() {

        /*
        indent(n) -add or remove whitespaces characters from beginning of the string
        - If n = 0 > does nothing
        - n > 0 adds the same number of blank spaces to each line
        - n < 0 tries to remove n whitespace characters from the beginning of line
        - normalizes existing line breaks
        - ADD line break at the end if missing
         */

        /*
        stripIndent() - removes all leading incidental whitespaces
        - normalize existing line breaks
        - DOES NOT ADD line break at the end if missing
         */

        String str = "   Bruce\n    D.\n     Wayne";

        System.out.println("---");
        System.out.println(str);
        System.out.println("---");
        System.out.println(str.indent(2));
        System.out.println("---");
        System.out.println(str.indent(-2));
        System.out.println("---");
        System.out.println(str.stripIndent());
        System.out.println("---");

        /* Print:
---
   Bruce
    D.
     Wayne
---
     Bruce
      D.
       Wayne

---
 Bruce
  D.
   Wayne

---
Bruce
 D.
  Wayne
---
*/
    }

    private static void translateEscapesExample() {
        // translateEscapes() - Returns a string whose value is this string, with escape sequences translated as if in a string literal.
        String name = "Bruce\\tWayne";
        System.out.println("Before: " + name);
        System.out.println("After: " + name.translateEscapes());

        /*
        Before: Bruce\tWayne
        After: Bruce	Wayne
         */
    }

    private static void isBlankAndIsEmptyExample() {
        // isEmpty() - Returns a boolean if the String is empty, But if the String has at least one whitespace, it will not consider an empty String
        System.out.println("".isEmpty()); // true
        System.out.println("  ".isEmpty()); // false

        // isBlank() - Returns a boolean if the String is empty, even with whitespace.
        System.out.println("".isBlank()); // true
        System.out.println("  ".isBlank()); // true
    }









}
