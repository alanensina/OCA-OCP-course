package app.section5;

public class StringPool_027 {
    public static void main(String[] args) {
        var name = "John";
        var name2 = "John";
        System.out.println(name == name2); // true, because references the same address in the String pool

        // tricky example #1
        var str1 = "John";
        var str2 = "  John       ".trim();
        System.out.println(str1 == str2); // false, because pool is created at compile time, trim() is evaluated at runtime

        // tricky example #2
        var str3 = "Alan Ensina";
        var str4 = "Alan" + " " + "Ensina";
        System.out.println(str3 == str4); // true, because concatenation is created at compile time

        // tricky example #3
        var str5 = "John";
        var str6 = "  John       ".trim().intern();
        System.out.println(str5 == str6); // true, because intern() will instruct the compiler to use the pool even with runtime method

        // tricky example #4 (same as above, but waste more memory because it will use another memory location)
        var str7 = "John";
        var str8 = "  John       ".trim();
        System.out.println(str5 == str6.intern()); // true, because intern() will instruct the compiler to use the pool even with runtime method
    }
}
