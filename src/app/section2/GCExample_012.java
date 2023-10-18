package app.section2;

public class GCExample_012 {
    public static void main(String[] args) {
        String a, b;

        a = new String("Emperor"); // Emperor is stored in HEAP
        b = new String("King"); // King is stored in HEAP

        a = b; // a no points to the reference of b, which is King, so Emperor now is eligible to Garbage Collection

        String c = a; // Points to the reference of King in HEAP
        a = null;
    }
}

/*
    Conclusion: in line 10, the object "Emperor" is eligible to GC
    REMEMBER: objects and not references are collected by GC
 */
