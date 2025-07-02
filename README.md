- [OCA-OCP COURSE](#oca-ocp-course)
  * [Building blocks](#building-blocks)
    + [Major components of Java](#major-components-of-java)
    + [Class structure](#class-structure)
    + [Classes and source files](#classes-and-source-files)
    + [The main() method](#the-main-method)
    + [Packages](#packages)
    + [Compile, run and archive Java files](#compile-run-and-archive-java-files)
    + [Objects](#objects)
    + [Data types](#data-types)
    + [Text blocks](#text-blocks)
    + [Variables](#variables)
    + [Local variable type inference (LVTI)](#local-variable-type-inference-lvti)
    + [Garbage collector](#garbage-collector)
  * [Operators](#operators)
    * [Operators in Java](#operators-in-java)
    * [Unary operators](#unary-operators)
    * [Binary operators](#binary-operators)
    * [Assignment operator](#assignment-operator)
    * [Comparison operator](#comparison-operator)
  * [Flow control](#flow-control)
    * [If/Else statement](#ifelse-statement)
    * [Switch statement](#switch-statement)
    * [While loop](#while-loop)
    * [Do/While loop](#dowhile-loop)
    * [For loop](#for-loop)
    * [For-each loop](#for-each-loop)
  * [Strings](#strings)
    * [String methods](#string-methods)
    * [StringBuilder](#stringbuilder)
    * [String Pool](#string-pool)
  * [Arrays](#arrays)
    * [Creating an Array](#creating-an-array)
    * [Sorting, Searching & Comparing Arrays](#sorting-searching--comparing-arrays)
    * [Multidimensional Arrays](#multidimensional-arrays)
  * [Dates and times](#dates-and-times)
    * [Creating dates and times](#creating-dates-and-times)
    * [Methods in dates and times](#methods-in-dates-and-times)
    * [Period, Duration and Instant](#period-duration-and-instant-)
  * [Methods](#methods)
    * [Defining methods](#defining-methods)
    * [Local and instance variables](#local-and-instance-variables)
    * [Variable arguments](#variable-arguments)
    * [Access modifiers](#access-modifiers)
    * [Static members](#static-members)
    * [Boxing and unboxing](#boxing-and-unboxing)
    * [Overloading methods](#overloading-methods)
  * [Class design](#methods)
    * [Inheritance](#inheritance)
    * [Using this and super](#using-this-and-super)
    * [Initializing objects](#initializing-objects)
    * [Inheriting members](#inheriting-members)
  * [Abstract Classes and Interfaces](#abstract-classes-and-interfaces)
    * [Abstract Classes](#abstract-classes)
    * [Interfaces](#interfaces)
  * [Lambda and Functional programming](#lambda-and-functional-programming)
    * [Functional interfaces](#functional-interfaces)
    * [Method references](#method-references)
    * [Built-in Functional Interfaces](#built-in-functional-interfaces)
    * [Combining implementations](#combining-implementations)
    * [Functional interfaces for primitives](#functional-interfaces-for-primitives)
  * [Collections](#collections)
    * [List](#list)
    * [Set](#set)
    * [Queue](#queue)
    * [Deque](#deque)
    * [Map](#map)
    * [Sorting and methods](#sorting-and-methods)
  * [Exceptions](#exceptions)
    * [Handling exceptions](#handling-exceptions)
    * [try-with-resources](#try-with-resources)


<a name="oca-ocp-course"></a>
# OCA-OCP COURSE

<a name="building-blocks"></a>
## Building Blocks
<a name="major-components-of-java"></a>
### Major components of Java

- JDK - Java Development Kit
  - Oracle's JDK, OpenJDK...
    - OCA: 1.8
    - OCP: 17

- Key commands:
  - javac: converts .java source files into .class bytecode
  - java: execute a program
  - jar: java archive (packing files together)
  - javadoc: for documentation

- JRE - Java Runtime Environment
  - It's a subset in Java 1.8 and earlier
  - JRE allows the user to run Java applications (no compiler)
  - After Java 8, one just uses full JDK to run Java applications

<a name="class-structure"></a>
### Class Structure

- Classes
  - Classes are basic building blocks of every Java program
  - Design a class means to describe parts and characteristics of these blocks
  - In order to use a class you need to create an object (most of the time)
    - Ex: class is a blueprint and the object is a realization
  - Object is a single representation of the class, also called instance of a class
  - A reference is a variable that points to an object

- Fields and Methods
  - Two main elements (members) of Java class are fields and methods
  - Fields are sometimes referred to variables
    - all fields are variables, but not all variables are fields
  - Fields hold the information about the state of an object or a class
  - Methods describe some action or operation on that state
    - methods are similar to functions in some older programming language
  
  ```
  public class Student{

    /**
     * Example of a field
     */
    String name;

    /**
     * Example of a method with a return
     */
    public String getName(){
        return name; // the return of the method
    }

    /**
     * Example of a method without a return
     */
    public void setName(String name){
        this.name = name; // set the parameter into the field
    }
  }

  ```

- Comments
  - Comments are used to make a code more readable
    - They are ignored by the compiler
  - There are 3 ways to comment out the text
    - comment until the end of the line: //
    - comment everything within /* and */
    - comment starting with /** (Javadoc)

<a name="classes-and-source-files"></a>
### Classes and source files

- It's a good practice to have each class in your own .java file
- It's possible to have more classes in one file
  - Only one of them is top-level class
- Top-level class is almost always marked as public, but it's not necessary
- If you mark the top-level class with public, then the filename must match the class name
- Only one class can be marked as public per .java file
- Examples:

// in file Student.java

`public class Student {}`

// in file Item.java

`public class Item {}`

`class SomeOtherItem{}`

// in file Customer.java

`public class Customer {}`

`public class Client {}` // DOES NOT COMPILE, BECAUSE YOU CAN'T HAVE 2 PUBLIC CLASSES IN THE SAME FILE

<a name="the-main-method"></a>
### The main() method

- Java program starts by executing the main() method:

  `public static void main(String[] args)` // most common

  `public static void main(String[] someOtherSillyName)`

  `public static void main(String args[])`

  `public static void main(String... args)`

  `public final static void main(final String[] args)`

  `static public void main(String[] args)`

  - Note: The return type must follow the name of the method!

public: access modifier

static: method belongs to the class (not to the instance)

void: no return type

main: name of the method

String[] args: input parameters (array of Strings)


```
  /**
 * To compile and run:
 * javac Names.java
 * java Names Alan Ensina
 * Note: If you don't provide at least 2 args, an exception will be thrown: index out of bounds
 */
public class Names {

    public static void main(String[] args) {
        System.out.println("First name: " + args[0]); // arrays starts at 0 index
        System.out.println("Second name: " + args[1]);
    }
}
```

<a name="packages"></a>
### Packages
- Java classes are stored in different packages
- You can think of them as folders in which the classes are stored
- In order to use a class, you must _import_ a package in your program
- The package's name usually looks like something like this: `com.alanensina.javacourse`
  - This means that there is a folder `com`, with a subfolder `alanensina`, with a subfolder `javacourse` containing classes

```
  // The Random class was imported
import java.util.Random;

public class NumberGenerator {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        System.out.println("Random number generated: " + randomNumber.nextInt(100));
    }
}
```

- There's an option to use a fully qualified name of class instead to import it: `java.util.Random randomNumber = new java.util.Random();` but is not common to use.
- You can use wildcards to import all the classes in the package: `import java.util.*` but will not import the subpackages (subfolders)
- Be careful about conflicts:
  - `import java.util.Date`
  - `import java.sql.Date` // DOES NOT COMPILE
- If you want to use both there's a solution:
  - `import java.util.Date`
  - `import java.sql.*`
    - And when you want the use the Date class from java.sql, you can use like this: `java.util.Date dateSQL = new java.util.Date();`

<a name="compile-run-and-archive-java-files"></a>
### Compile, Run and Archive Java files

- Imagine a first class:
  - `C:\com\udemy\ocppackage\Ocp.java` (Windows)
  - `/com/udemy/ocppackage/Ocp.java` (*nix)
- Imagine a second class:
  - `C:\com\udemy\ocapackage\Oca.java` (Windows)
  - `/com/udemy/ocapackage/Oca.java` (*nix)
- Take the common-ground position:
  - `cd C:\com\udemy` (Windows)
  - `cd /com/udemy` (*nix)
- To compile: `javac ocppackage/Ocp.java ocapackage/Oca.java`
  - output: `.class files`
  - compile alternative: `javac ocppackage/*.java ocapackage/*.java` All java files will be compiled
- To run the OCP Application:
  - `java ocppackage.Ocp` do not put .class, Java will look automatically to .class file.
- If you want to compile from another directory: `javac -d classes ocppackage/Ocp.java ocapackage/Oca.java`, and a new folder called classes will be created with the .class files
- There're other ways to run the Ocp Application:
  - `java -cp classes ocppackage.Ocp`
  - `java -classpath classes ocppackage.Ocp`
  - `java --class-path classes ocppackage.Ocp`
- If the application depends on other files to run:
  - Some files are in package "deps" and other are in myJar.jar:
    - `java -cp ".;C:\com\udemy\deps;C:\com\udemy\myJar.jar" myPackage.MyApp` (Windows)
  - If you have many jars ina folder:
    - `java -cp ".;C:\com\udemy\myjars\*" myPackage.MyApp` (Windows)
- Create your own .jar file:
  - `jar -cvf myNewJarFile.jar`
  - `jar --create --verbose --file myNewJarFile.jar`
  - `jar -cvf myNewJarFile.jar -C myFolder` (If you are located in a different folder)

<a name="objects"></a>
### Objects
- Object is an instance of the class
- New object is created using a keyword `new`:
  - `Student s = new Student();`
- When an object is created, the `constructor` of the object is called
- See an example: `app.section2.Student__007` and `app.section2.MyApp_007`
- If the constructor wasn't provided, the compiler will generate a simple constructor without arguments: `public Student() {}`
- But if you provide a constructor with arguments, the compiler WILL NOT generate a constructor without arguments.
- Order of initialization:
  - The code between two brackets {...} is called code block
  - Instance initializer - code block outside the method
  - Order of initialization:
    - fields and instance initializer blocks in order which they appear
    - constructor runs in the end

```
public class Dog {
    private String name = "Chip";

    public Dog(){
        // Those two lines will be the 2nd thing to be executed
        name = "Teddy";
        System.out.println("Inside the constructor.");
    }

    {
        System.out.println("Inside of the initializer block."); // This is the 1st thing to be executed
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.name); // This is going to be the 3rd thing to be executed
    }
}
```

<a name="data-types"></a>
### Data types
- **Primitive Types**:

| Keyword |         Type          |     Min     |    Max     | Default | Example  |
|:-------:|:---------------------:|:-----------:|:----------:|:-------:|:--------:|
| boolean |      true/false       |      -      |     -      |  false  |  false   |
|  byte   | 8 bit integral value  |    -128     |    127     |    0    |   112    |
|  short  | 16 bit integral value |   -32768    |   32767    |    0    |   -200   |
|   int   | 32 bit integral value | -2147483648 | 2174483647 |    0    |   4321   |
|  long   | 64 bit integral value |    -2^63    |  2^63 -1   |   0L    |  1235L   |
|  float  | 32 bit floating value |      -      |     -      |  0.0f   | 321.214f |
| double  | 64 bit floating value |      -      |     -      |   0.0   | 3214.21  |
|  char   | 16 bit Unicode value  |      0      |   65535    | \u0000  |   'c'    |

- In Java, boolean true and false are completely unrelated to 1 and 0!
- All numeric types are signed (allow negative numbers)
- float requires f (or F) at the end:
  - `float x = 2.7;` // DOES NOT COMPILE
  - `float x = 2.7f;` // OK
- long requires l (or and preferably L) at the end:
  - `long y = 34243472;` // DOES NOT COMPILE
  - `long y = 34243472L;` // OK
- bit size of boolean is not specified (depends on JVM)

- **Supported digital formats**:
  - base 10 (digits 0-9), "normal" numbers
  - octal (digits 0-7), uses 0 as a prefix: `019`
  - hexadecimal (digits 0-9 and letters A-F/a-f), uses 0x or 0X as a prefix:
    - format is case insensitive: `0xFF, 0XFF, 0xff, etc...`
  - binary (digits 0 and 1), uses 0b or 0B as prefix: `0b19, 0B10, etc...`

- For readability, Java allows _ , but not in the beginning: 
  - `int a = 1_000_000;` // normal usage: 1000000
  - `int b = 1_2;` // OK, but not very useful: 12
  - `int c = 1____4;` // OK, but not very useful: 14
  - `double d = 1_000_000.000_001;` // OK, useful: 1000000.000001
  - `double e = _10.1;` // DOES NOT COMPILE
  - `double e = 10.1_;` // DOES NOT COMPILE
  - `double e = 10_.1;` // DOES NOT COMPILE
  - `double e = 10._1;` // DOES NOT COMPILE
  
- **Wrapper Classes**:
  - Primitives are not objects, and sometimes we prefer to work with objects
  - Each primitive has a wrapper class
    - an object type which corresponds to the primitive
  - Most common way to create an object from the primitive:
    - use _static method_: `valueOf()`:
    - `Integer a = Integer.valueOf(3);`

| Primitive type | Wrapper class |          Example           |   
|:--------------:|:-------------:|:--------------------------:|
|    boolean     |    Boolean    |   Boolean.valueOf(true);   | 
|      byte      |     Byte      |  Byte.valueOf((byte) 4);   |
|     short      |     Short     | Short.valueOf((short) 11); | 
|      int       |    Integer    |    Integer.valueOf(19);    | 
|      long      |     Long      |     Long.valueOf(15L);     |  
|     float      |     Float     |   Float.valueOf(12.7f);    |  
|     double     |    Double     |   Double.valueOf(12.5);    | 
|      char      |   Character   |  Character.valueOf('a');   |   

- valueOf() can be used to convert String into wrapper class:
  - `Integer n = Integer.valueOf("11");`
- Useful methods:
  - `int m = Integer.parseInt("1");` // Converts a String into a primitive int
  - `Double d = Double.valueOf(314.67);` // Create an object Double
  - `System.out.println(d.byteValue(d));` // Print 58, because wrap: 314(rounded) - 256(byte value range) = 58
- Before Java 9, this was possible (might appear on OCA exam):
  - `Integer x = new Integer(15);`

- **Strings**:
  - Strings `e.g. "Hello World"` are not primitive types in Java
  - But they are commonly used like primitives:
    - `String greetings = "Hello";`
    - `String name = "Alan";`
    - `System.out.println(greetings + ", " + name + "!");` // Hello, Alan!

<a name="text-blocks"></a>
### Text blocks

- Introduced as standard in Java 15:
  - `String title = """ 
"Java SE 17 Developer Course" 
  by Alan Ensina """;`
  - The old way:
    - `String title = "\"Java SE 17 Developer Course\"\n   by Alan Ensina";`

<a name="variables"></a>
### Variables

- Variable is a name for a piece of memory which stores data
- To declare a variable means to state a variable type and give it a name: `int x;`
- To initialize a variable means to give a variable a value: `int x = 5;`
- Name of the variable (method, class, interface, package...) is called identifier
- **Identifier rules**
  - Must begin with a letter, currency symbol ($, £), or underscore (_)
  - Can include numbers, but not start with a number
  - Single underscore (_) is not allowed as an identifier
  - You cannot use a reserved word
    - Examples:
      - `$myVAR12`
      - `_£name_`
      - `_someName1$`
      - `BIG_NAME`
      - `_12X`
      - `myVariable`
- Reserved words
  - Check all the keywords that are reserved in: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html
- Naming conventions
  - Variables use camelCase
  - Constants use SNAKE_CASE
  - Identifiers of classes, interfaces, enums records stats with first uppercase letter:
    - `MyClass, MyInterface, StudentRecord`
  - Identifiers of variables and methods start with first lowercase letter:
    - `fullName, getFullName()`
  - Multiple variables can be declared and/or initialized in a single line, but **it's a bad practice**, but it compiles:
    - `int x, y;`
    - `String name = "Alan", lastname = "Ensina";`
    - `boolean v = true, w, z = false;`
  - You can't declare variables of different type in a single line/command:
    - `int x, String name;` // DOES NOT COMPILE
- Scope of variables
  - Variables can go out of scope ("cease to exist")
  - local variables: exists only within the block of code {...}
    - must be initialized before use or will not be compiled if you try to use the variable
  - instance variables (fields): defined within the specific instance of the object 
  - class variables - belong to a class and is shared with all instances of the class
    - marked with keyword _static_
    - instance and class variables don't require initialization
      - assume the default values of their type
- Final variables (constants)
  - `final int MAX_HEIGHT = 100;`
  - `final int[] MY_NUMBERS = new int[5];` // applied to a reference, you can change the content
    - `MY_NUMBERS[2] = 13;` // OK
    - `MY_NUMBERS = null;` // DOES NOT COMPILE

<a name="local-variable-type-inference"></a>
### Local variable Type Inference (LVTI)

- Introduced in Java 10
- Local variable - can be used only with local variables
- Type inference - type of the variables are inferred by the compiler
  - `var a = 5;`
- In the example above, the _a_ variable was inferred as type _int_
  - It's not possible to change the type after the inference:
    - `a = "Alan Ensina";` // DOES NOT COMPILE
- You can't assign var variable as null;
  - `var a = null;` // DOES NOT COMPILE
- _var_ is not a reserved word
  - `public class Var{}` // OK
  - `var var = 5;` // OK
  - `var var = new Var();` // OK
- **Used only in local variables!**
- Practical usage:
  - `SomeClassWithAVeryLongName instance = new SomeClassWithAVeryLongName();` // old way
  - `var instance = new SomeClassWithAVeryLongName();` // new way
  - `ArrayList<Client> clientList = new SomeClassWithAVeryLongName().getCLientList();` // old way
  - `var clientList = new SomeClassWithAVeryLongName().getCLientList();` // new way

<a name="garbage-collector"></a>
### Garbage collector

- All Java Objects are stored in program's **memory heap** (a.k.a free store)
- Garbage collection is a process of automatically freeing memory on the heap
  - by removing objects which are no longer reachable in the program
- The object is said to be eligible for garbage collection
- Once the object is eligible for GC Java can remove it from heap (and free memory)
- This process is out of your control
  - You cannot know if and when the memory will be freed
- There's a method that can suggest Java to clean the heap: `System.gc();`
  - But it's not guaranteed to do anything.
- **Eligibility for Garbage Collection**
  - Object is eligible for GC once it is no longer reachable by the program
    - The object has no reference pointing to it
    - All references of the object have gone out of scope
  - In other words, when the objects "hangs in the air"


```
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
```

<a name="operators"></a>
## Operators

<a name="operators-in-java"></a>
### Operators in Java

- Check the example: `int x = a + b;`
  - 'int' = type
  - 'x' is variable of the result
  - 'a' and 'b' are variables and OPERANDS
  - '+' is the operator
- Types of operators
  - Unary operator: `a++;`
  - Binary operator: `a = b + c;`
  - Ternary operator: `a = b > 0 ? 1 : 2;`
- Operator precedence
  - Like in math, the operators have some precedence, check the operators precedence in Java in the link below
    - https://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html
  - Example: `int a = 2+2*2+10/5+1;`
    - In this case, it's easier to see the precedence using parentesis: `a = 2 + (2*2) + (10/5) + 1;`
      - `a = 9;`
  - Example: `boolean b = 2>1&&2+2*2==5;`
    - In this case, it's easier to see the precedence using parentesis: `b = (2>1) && (( 2 + (2*2)) == 5);`
      - `b = true && (6 == 5) = true && false =  false`
  - Example: 
    - `int x = 1;`
    - `int y = ++x*2;`
      - `y = (++x) * 2;`
        - `y = 4 , x = 2`

<a name="unary-operators"></a>
### Unary operators
  
- Requires only one operand

|      Operator      | Example  |
|:------------------:|:--------:|
| Logical complement |    !b    |
| Bitwise complement |    ~a    |
|        Plus        |    +c    |
|  Negation(minus)   |    -s    |
|     Increment      | ++g, g-- |
|     Decrement      | --a, a-- |
|        Cast        | (int) a  |

- Increment and decrement operators
  - `++a` increases value by 1 and returns a NEW value
  - `a++` increases value by 1 and returns a OLD value
  - `--a` decreases value by 1 and returns a NEW value
  - `a--` decreases value by 1 and returns a OLD value

```
  public class IncrementAndDecrement_014 {
    public static void main(String[] args) {
        int a = 1;
        int b = a++; // Returns the old value
        System.out.println("a: " + a); // 2
        System.out.println("b: " + b); // 1

        int c = 2;
        int d = ++c;
        System.out.println("c: " + c); // 3
        System.out.println("d: " + d); // 3
    }
}
```

<a name="binary-operators"></a>
### Binary operators

- Arithmetic binary operators:
  - addition: `a + b`
  - subtraction: `c - d`
  - multiplication: `e * f`
  - division: `g / h`
    - `int a = 11 / 4;` // a = 2 (FLOOR VALUE)
  - modulo operator: `i % j`
    - `int b = 11 % 4;` // b = 3 (reminder of division)
    - `String c = (n % 2 == 0) ? "even" : "odd";`
- Rules of numeric promotion:
  - If operands have different data types, Java automatically promotes one of the operands to a larger of two data types
  - If one value is integer, and  another is decimal, Java promotes int to decimal
  - byte, short and char are **always** first promoted to int before the operations is done
  - The result value has the same data type as the promoted operands

```
  public class RulesOfNumericPromotion {

    public static void main(String[] args) {

        short a = 17;
        float b = 15;
        double c = 35;
        // a and b are promoted to double, because is the largest, so the result is double.
        System.out.println("a * b / c = " + a * b / c);


        short x = 5;
        short y = 7;
        // x and y are promoted to int, result is int
        System.out.println("x + y = " + x + y);

       // short z = x + y; // DOES NOT COMPILE (you tried to put int into short)
    }
}
```

<a name="assignment-operator"></a>
### Assignment operator

- Assignment operator (`=`) has the lowest precedence
  - `a = b - c;`
- First the operation on the right-hand side is performed
  - the result is assigned to a variable on the left-hand side
- auto casting: Java automatically promotes smaller to larger data type:
  - `short x = 5;`
  - `int y;`
  - `y = x;` // OK, x is casted to int
  - `int z = 15;`
  - `short s;`
  - `s = z;` // NOK! you can't put int into short
  - `s = (short) z;` // OK
- More examples:
  - `int x = 1.0;` // NOK
  - `int Y = 123l;` // NOK
  - `long z = 5;` // OK
  - `long w = (byte) 7;` // OK
  - `float k = 2.3;` // NOK
  - `float l = 2.3f;` // OK
  - `double m = 2.5f;` // OK
  - `double n = 3.14;` // OK
  - `float pi = n;` // NOK
  - `short a = 7;` // OK
  - `short b = 5;` // OK
  - `short c = (short) (a + b);` // OK
- Compound assign operators:
  - `a += 5;`
    - `a = a + 5;`
  - `a -= 5;`
    - `a = a - 5;`
  - `a *= 5;`
    - `a = a * 5;`
  - `a /= 5;`
    - `a = a / 5;`
- Return value of assignment operator
  - expression `a = 2` does two things 
    - assign value 2 to variable a
    - returns value 2

```
  public class AssignmentOperator {

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
```

<a name="comparison-operator"></a>
### Comparison operator

- Always return a boolean value (`true` or `false`)
- Equals operator (`a == b`)
  - primitives:
    - returns `true` if values are the same
  - objects:
    - returns `true` if both objects reference to the same object
- Not-Equals operator (`a != b`) WORKS IN THE SAME WAY
  - primitives:
    - returns `false` if values are the same
  - objects:
    - returns `false` if both objects reference to the same object 
- You can only compare values or similar type (auto-casting applies)
- Relational operators: `>`, `>=`, `<`, `<=`, `instanceof`
  
```
    public class ComparisonOperators {

      public static void main(String[] args) {
        isInteger(5);
        isInteger(3.14);
        isInteger("Alan");
      }

    /**
     * Integer is a subtype of Number
     * @param num
     */
      public static void isInteger(Object num){
        if(num instanceof Number){
            System.out.println(num + " is an Integer.");
        } else {
            System.out.println(num + " is not an Integer.");
        }
      }
    }
```

- Logical operators:
  - AND: `a & b`
    - `true` if at least one operand is true
  - OR: `a | b`
    -  `true` if at least one is true
  - XOR: `a ^ b`
    -  `true` if one operands is true and another is false
- Conditional operators:
- AND: `a && b`
  - `true` if at least both operands is true
- OR: `a || b`
  -  `true` if at least one is true
- What is the difference between logical and conditional operators?
  - Conditional evaluation stops once the result can be determined
  - This property is known as short-circuit
- Ternary operator also has short-circuit property
  - Example: (a=5, b= 10, c=15)
    - `int d = (a < b) ? 7 : ++c;`
      - ++c will never be evaluated

<a name="flow-control"></a>
## Flow control

<a name="ifelse-statement"></a>
### If/Else statement

- The syntax of if/else
  - `if(expression1){` // expression1 must be a boolean expression
    - //block of code executed if the expression1 is true
  - `}else if(expression2){` // expression2 must be a boolean expression
    - //block of code executed if expression1 is false and expression2 is true
  - `}else{`
    - //block of code executed only if expression1 and expression2 is false
  - `}` 

```
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
```

<a name="switch-statement"></a>
### Switch statement

```
  public class SwitchStatement {

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
```

- Allowed variable types: int (Integer), byte (Byte), short (Short), char (Character), String and enum type
- Not allowed variables: boolean, long, float and double

<a name="while-loop"></a>
### While Loop

```
public class WhileLoop {

    public static void main(String[] args) {

        // Print out number from 0 to 9
        System.out.println("===============================");
        System.out.println("Print out number from 0 to 9:");
        int i = 0;
        while(i<10){
            System.out.println(i);
            i++;
        }

        System.out.println("===============================");

        // Example of a body that will never be executed
        int a = 5;
        int b = 7;

        while (a > b){
            System.out.println("a > b");
        }

        // Example of infinite loop (BE CAREFUL)
//        while (a < b){
//            System.out.println("a < b");
//        }

        // Example 2:
//        while(true){
//            System.out.println("Infinite loop!");
//        }

        // Break statement example
        System.out.println("Example with break statement:");
        int x = 0;
        while(true){
            System.out.println(x);
            if(x == 10) break;
            x++;
        }
        System.out.println("===============================");

        // Nested loops example:
        System.out.println("Example with nested loops:");
        int h = 0;
        int j = 0;
        while(h < 3){
            h++;
            j = 0;
            while(j < 3){
                j++;
                System.out.println("(" + h + ", " + j + ") ");
            }
        }
        System.out.println("===============================");

        // Using break in nested loops:
        System.out.println("Using break in nested loops:");
        int m = 0;
        int n = 0;
        while(true) {
            m++;
            n = 0;
            while (true) {
                n++;
                System.out.println("(" + m + ", " + n + ") ");

                if(n == 3) break;
            }

            if(m == 3) break;
        }
        System.out.println("===============================");

        // Using break in nested loops, with labels:
        System.out.println("Using break in nested loops, with labels:");
        int p = 0;
        int q = 0;
        OUTER_LOOP: while(true) {
            p++;
            q = 0;
            INNER_LOOP: while (true) {
                q++;
                System.out.println("(" + p + ", " + q + ") ");

                if(q == 3) break OUTER_LOOP; // Will break the outer loop when the inner loop reaches 3.
            }
        }
        System.out.println("===============================");

        // Continue statement skips one iteration of the loop
        // task: print all even numbers between 0 and 20

        System.out.println("Printing all even numbers between 0 and 20:");
        int k = -1;
        while(k<21){
            k++;
            if(k%2==1) continue;
            System.out.println(k);
        }
        System.out.println("===============================");

        printPairs();
        System.out.println("===============================");
    }

    // Return statements breaks the execution of the loop and exits the method.
    private static void printPairs() {
        System.out.println("Example with return statement:");
        int h = 0;
        int j = 0;
        while(true){
            h++;
            while(true){
                j++;
                System.out.println("(" + h + ", " + j + ") ");
                if(j == 4) return;
            }
        }
    }
}
```

- You can use a `break` statement if you want to break the loop
- Also, you can use `labels` to define the loops
- The `continue` keyword can be used to define a next iteration of the loop
- The `return` keyword can be used and works like `break`, but will finish the loop and the method

<a name="dowhile-loop"></a>
### Do/While loop
- The main difference compared to while loop is that a block of code will be executed at least once

```
public class DoWhileLoop {

    public static void main(String[] args) {

        // Print out numbers from 0 to 9 using do/while loop
        int i = 0 ;
        System.out.println("Print out numbers from 0 to 9 using do/while loop:");
        do{
            System.out.println(i);
            i++;
        } while (i < 10);
        System.out.println("=========================================");

        // Example of a body executed at least once:
        int k = 0 ;
        int j = 5;
        System.out.println("Example of a body executed at least once:");
        do{
            // Will be printed just once
            System.out.println(k);
            k++;
        } while (k > j);
        System.out.println("=========================================");
    }
}
```

- You can use `break`, `continue`, `return`, nested loops, unreachable code, etc, just like a normal while loop

<a name="for-loop"></a>
### For loop
- The syntax of for loop: `for(initialization; condition; update){}`
- Order of the execution
  1) execute initialization statement (only once)
  2) check the condition
  3) if condition is true, execute the code block, otherwise exit the loop
  4) execute the update statement
  5) repeat step 2
- It's possible to omit any one of the statements, but you still have to keep the `;` in place
- Example of infinite loop: `for ( ; ; ){ }`
- You can use more than one index in a for loop separated by coma
- You can use `break`, `continue`, `return`, nested loops, unreachable code, etc, just like a normal while loop

```
public class ForLoop {
    public static void main(String[] args) {
        // Print out number from 0 to 9
        System.out.println("Print out number from 0 to 9:");
        for(int i = 0 ; i < 10; i++){
            System.out.println(i);
        }
        System.out.println("=====================================");

        // You can use more than one index in a for loop separated by coma:
        System.out.println("Print out numbers with more than one index:");
        for(int k = 0, l = 0 ; k+l < 5; k++, l++){
            System.out.println("k: " + k + ", l: " + l);
        }

    }
}
```


<a name="for-each-loop"></a>
### For-each loop
- For loop is often used to access members of an array (or collection)

```
public class ForEachLoop {
    public static void main(String[] args) {

        String[] cars = {"Ford", "Renault", "Fiat", "Honda", "Kia"};
        System.out.println("Printing all elements of array using a normal for: ");
        for(int i = 0 ; i < cars.length ; i++){
            System.out.println(cars[i]);
        }
        System.out.println("===========================================");

        System.out.println("Printing all elements of array using for-each loop: ");
        for(String car : cars){
            System.out.println(car);
        }
        System.out.println("===========================================");

        // Example of Java 17:
        System.out.println("Printing all elements of array using for-each loop (Java 17): ");
        for(var car : cars){
            System.out.println(car);
        }

    }
}
```

- In Java 17 for-each loop is often used with LVTI

<a name="strings"></a>
## Strings
  - Create and concatenate a String
  - String is a sequence of characters, implementing `CharSequence` interface
  - Ways to assign a String:
    - `String name = "Alan";`
    - `String name = new String("Alan");`
  - Concatenation: put two or more String as one:
    - `string1 + string2` or `string1.concat(string2)`;


```
  public class StringConcatenation {
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
```

- _**String are immutable!**_

<a name="string-methods"></a>
### String methods

```
  public class StringMethods {
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
        formattingSymbolsExamples();
        stringsAreImmutableExample();
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

    private static void formattingSymbolsExamples() {
        // format() - Used to use symbols to express variables (Example %s , %d ...)
        // formatted() - Used to use symbols to express variables (Example %s , %d ...)

        String name = "John";
        int numberOfMarbles = 5;

        String print = String.format("%s has %d marbles.", name, numberOfMarbles);
        System.out.println(print);
        String print2 = "%s has %d marbles.".formatted(name, numberOfMarbles);
        System.out.println(print2);
    }

    private static void stringsAreImmutableExample() {
        // String are immutable!

        String name = "Alan";
        name.toUpperCase();
        System.out.println(name); // "Alan" (because Strings are immutable)

        name = name.toUpperCase(); // you have to reassign the new value or create a new String
        System.out.println(name); // "ALAN"
    }
}
```

  - `length()` - Length of the String
  - `charAt(index)` - Get the char located in the index, if the index doesn't exist, a StringIndexOutOfBoundsException
  - `indexOf(char)` - It will return the index of a char in the String in his FIRST APPEARANCE
  - `substring(index)` - Creates a new String from an index till the end of the String, the char of the index will be included
  - `toLowerCase()` - Put all characters in lower case
  - `toUpperCase()` - Put all characters in upper case
  - `equals()` -  Compare the content if is the same
  - `equalsIgnoreCase()` - compare the content if is the same, but ignoring the case-sensitive
  - `startsWith()` - Compare the start of the String and return a boolean value
  - `endsWith()` - Compare the end of the String and return a boolean value
  - `contains()` - Verify if the String contains a substring and return a boolean value
  - `replace()` - Replace a char/String to another char/String into the String
  - `strip()` - Remove the whitespaces from beginning and end of the String
  - `trim()` - Same as strip, but supports Unicode
  - `stripLeading()` - Remove the whitespaces ONLY in the beginning of the String
  - `stripTrailing()` - Remove the whitespaces ONLY in the end of the String
  - **Whitespaces** also includes \t (tab), \n (new line), \r (carriage return). All escape sequences count as one character in length
  - `indent(n)` -add or remove whitespaces characters from beginning of the string
  - `stripIndent()` - removes all leading incidental whitespaces
  - `translateEscapes()` - Returns a string whose value is this string, with escape sequences translated as if in a string literal.
  - `isEmpty()` - Returns a boolean if the String is empty, But if the String has at least one whitespace, it will not consider an empty String
  - `isBlank()` - Returns a boolean if the String is empty, even with whitespace.
  - `format()` - Used to use symbols to express variables (Example %s , %d ...)
  - `formatted()` - Used to use symbols to express variables (Example %s , %d ...)
  - String formatting symbos
    - `%s` - for any type, usually for String
    - `%d` - for integral values (int and long)
    - `%f` - for decimal numbers (float and double)
    - `%n` - inserts a system-dependent line separator

<a name="stringbuilder"></a>
### StringBuilder
  - StringBuilder is a **mutable** class which contains a String
    - It has many useful methods for manipulating the String
      - Syntax: `Stringbuilder name = new StringBuilder("Alan");`

```
public class StringBuilder {

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
```
    
  - Some methods work in the identical way as with a normal String
        - `substring()`, `indexOf()`, `length()` and `charAt()`
    - StringBuilder methods:
        - `append()` - As far as the StringBuilder is mutable, you don't need to assign a new String to change, works like concatenation
        - `insert()` - Insert a substring into the index defined, chaining can be applied
        - `delete()` - Removes a characters from an index (inclusive) to another index (exclusive)
        - `deleteCharAt()` - Removes a character from an index
        - `replace(start, end, text)` - Remove characters from start to and end (excluded) and inserts a new String. Note the different syntax that is found on String method replace(). If the end index is too large, replace goes through the end of the String (NO EXCEPTION)
        - `reverse()` - Reverse the String
        - `toString()` - return a String object from StringBuilder
        - `substring()` - returns a String and doesn't change the StringBuilder
      - StringBuilder doesn't implement equals() method! If you want to compare the content, convert it back to String

<a name="string-pool"></a>
### String Pool
  - What is a String Pool?
    - Let's say you create a new String with literal value "John"
      - JVM stores in the memory location known as **String pool** or **intern pool**
    - After that you create a new String variable and assign it a same literal value
      - instead of creating a new memory spot for this literal value
      - Java will save the memory and look in the String pool
      - New variable will point to the existing location in the String pool
```
  public class StringPool {
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
```

  - If you don't want the compiler use the pool, you can achieve this creating a new object with keyword new:
      - `String name = "Alan";`
        - `String name2 = new String("Alan");` // it will address to a different memory location than the variable above

<a name="arrays"></a>
## Arrays
  - Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
  - Arrays don't implement equals() method, and if you print the variable of the array you will get the hashcode of the reference. Example: `I@7a4f0f29`
  - In this case you can use the toString method:
    - `int[] nums = {1, 2, 3};`
    - `System.ou.println(Arrays.toString(nums));` // [1, 2, 3]
  - Array has a property called `length`, **is not a method**
    - `System.ou.println(nums.length);` // 3

<a name="creating-an-array"></a>
### Creating an Array
  - Creating an array:
    - `int[] nums = new int[3];`  
      - [] - read "array"
      - nums - name of the variable
      - new - keyword
      - 3 - size of the array
  - There is many ways to initialize an array:
    - First declare, then initialize
      - `int [] nums = new int[3];`
      - `nums = new int[]{3, -1, 17};`
    - Initialization can be done without keyword new
      - `nums = {3, 6, 9};`
    - Declaring and initializing at once
      - `int[] myNumbers = new int[]{3, 7, 13};`
      - `int[] myIntArray = {1, 6, 12};`
  - There are more allowed ways to declare an array:
      - `int[] nums;`
      - `int [] nums;`
      - `int []nums;`
      - `int nums[];`
      - `int nums [];`
      - **NOTE:** The size must be on the right side, and never on the left: `int nums[5];` 
  - You can have multiple values in one declaration, but is not recommended:
    - `int[] myNumbers, myIntValues`;
  - Also, you can even declare int number and int array in the same line, but is not recommended:
    - `int myNumbers[], myNumber;`
  - Printing an array:
    - `System.out.println(Arrays.toString(nums));`
  - Length (property and not a method):
    - `System.out.println(nums.length);`

<a name="sorting-searching-comparing-arrays"></a>
### Sorting, Searching & Comparing Arrays
- Sorting:
  - Arrays are mutable, if you use `sort()` the original array will be changed. 
  - To sort the array ascending: `Arrays.sort(nums);` 
- Searching:
  - `Arrays.binarySearch()`
    - NOTE: Works only on sorted arrays.
    - If the array is not sorted, the result is unpredictable
    - takes an array and an element as arguments
      - returns the index of the array if the element is found
      - returns the negative number if the element is not found
        - `nth place with '-' in front
      - `System.out.println(Arrays.binarySearch(nums, 4));`
- Comparing:
  - `Arrays.compare()`
  - Determines which array is "smaller" and returns
    - negative number if first is smaller then second
    - zero if the arrays are equal in content
    - positive number if first is larger than second
    - What is "smaller"?
      - if one array has less numbers of elements, it's smaller
      - if both arrays have some numbers of elements
        - smaller is the one whose first different member is smaller
      - null is smaller than any other values
      - for Strings:
        - one is smaller if it's a prefix of another
        - numbers are smaller than letters
        - uppercase is smaller than lowercase
        - alphabetical order is applied

```
Arrays.compare(new int[]{3,7}, new int[]{3});
=> positive number

Arrays.compare(new int[]{3,7}, new int[]{3, 7});
=> 0

Arrays.compare(new String[]{"ab", "John Wayne"}, new String[]{"abc", "Hey!"});
=> negative number
```

- `Arrays.mismatch()`
  - returns -1 if arrays are equal, otherwise the first index where they differ

```
Arrays.mismatch(new int[]{3,7}, new int[]{3,7});
=> -1

Arrays.mismatch(new int[]{3,7}, new int[]{3});
=> 1
```
<a name="multidimensional-arrays"></a>
### Multidimensional Arrays

An array of arrays. There are no limits.
```
int[][] arrays = {{1, 5, 7, 9}, {0, 14, 2, 3}, {12, 1}};

int[][] arr = {
  {0, 1, 2},
  {1, 2},
  {13, 14, 16}
};
```

Accessing elements with traditional loops:
```
int[][] a = {
  {-1, 17}, 
  {3}, 
  {5, 103, 11}, 
  {4, 9, -6, 8}
};

for(int i = 0 ; i < a.length ; i++){
  for(int j = 0 ; j < a[i].length ; j++){
    System.out.println("a(%d, %d) = %d".formatted(i, j, a[i][j]));
  }
}
```
```
=> a(0,0) = -1
=> a(0,1) = 17
=> a(1,0) = 3
=> a(2,0) = 5
=> a(2,1) = 103
=> a(2,2) = 11
=> a(3,0) = 4
=> a(3,1) = 9
=> a(3,2) = -6
=> a(3,3) = 8
```
Accessing elements with for-each loop (no control over indices)
```
int[][] a = {
  {-1, 17}, 
  {3}, 
  {5, 103, 11}, 
  {4, 9, -6, 8}
};

for(int[] row : a){
  for(int element : row){
    System.out.println("element = " + element);
  }
}
```
```
=> element = -1
=> element = 17
=> element = 3
=> element = 5
=> element = 103
=> element = 11
=> element = 4
=> element = 9
=> element = -6
=> element = 8
```

<a name="dates-and-times"></a>
## Dates and times
<a name="creating-dates-and-times"></a>
### Creating dates and times

There are 4 Date/Time types in `java.time` package.

`import java.time.*;`

```
LocalDate now1 = LocalDate.now();
LocalTime now2 = LocalTime.now();
LocalDateTime now3 = LocalDateTime.now();
ZonedDateTime now4 = ZonedDateTime.now();

System.out.println(now1);
System.out.println(now2);
System.out.println(now3);
System.out.println(now4);
```
```
=> 2025-05-12
=> 2025-05-12.372755660
=> 2025-05-12T12:12:51.3727556623
=> 2025-05-12T12:12:51.3727556642Z[GMT]
```
Creating Local Date:
```
LocalDate d1 = LocalDate.of(2025, Month.MAY, 12);
LocalDate d2 = LocalDate.of(2025, 5, 12);
System.out.println(d1);
System.out.println(d2);
```
```
=> 2025-05-12
=> 2025-05-12
```

Creating Local Time:
```
LocalTime d1 = LocalTime.of(21, 50); // hour and minutes
LocalTime d2 = LocalTime.of(21,50,14); // hour, minutes and seconds
LocalTime d3 = LocalTime.of(21,50,14, 112); // hour, minutes, seconds and nanoseconds
System.out.println(d1);
System.out.println(d2);
System.out.println(d3);
```
```
=> 21:50
=> 21:50:14
=> 21:50:14.000000112
```

Creating Local Date Time:
```
LocalDateTime d1 = LocalDateTime.of(2025, Month.MAY, 12, 21, 50, 14); 
LocalDate ld = LocalDate.of(2025, 5, 12);
LocalTime dt = LocalTime.of(21,50,14, 112);
LocalDateTime d2 = LocalDateTime.of(ld, dt);
System.out.println(d1);
System.out.println(d2);
```
```
=> 2025-05-12T21:50:14.3727556623
=> 2025-05-12T21:50:14.3727556623
```
Creating Zoned Date Time:
```
ZoneId zone = ZoneId.of("Europe/Zagreb");
ZonedDateTime zdt = ZonedDateTime.of(2025, Month.MAY, 12, 21, 50, 14, 145, zone); 
System.out.println(zdt);
```
```
=> 2025-05-12T21:50:14.000000145+01:00[Europe/Zagreb]
```
For exam, you need to know how to convert between timezones:
```
2025-05-12T21:50:14.000000145+01:00[<zone>]
=> GMT 2025-05-12 20:50:14 (because the +01:00 from GMT)
2025-05-12T21:50:14.000000145-03:00[<zone>]
=> GMT 2025-05-12 18:50:14 (because the -03:00 from GMT)  
```
<a name="methods-in-dates-and-times"></a>
### Methods in Dates and Times
- LocalDate, LocalDateTime
  - `plusYears()`, `plusMonths()`, `plusWeeks()`, `plusDays()` 
  - `minusYears()`, `minusMonths()`, `minusWeeks()`, `minusDays()` 
  

- LocalTime, LocalDateTime
  - `plusDays()`, `plusMinutes()`, `plusSeconds()`, `plusNanos()`
  - `minusDays()`, `minusMinutes()`, `minusSeconds()`, `minusNanos()` 

```
LocalDate date = LocalDate.of(2022, Month.NOVEMBER, 15);
date = date.plusDays(4);
System.out.println(date);

date = date.plusWeeks(2);
System.out.println(date);

date = date.plusMonths(3);
System.out.println(date);

date = date.plusYears(1);
System.out.println(date);
```
```
=> 2022-11-15
=> 2022-11-19
=> 2022-12-03
=> 2023-02-03
=> 2024-02-03
```
```
LocalDate date = LocalDate.of(2022, Month.NOVEMBER, 15);
System.out.println(date);

LocalTime time = LocalTime.of(17,30);
System.out.println(time);

LocalDateTime dateTime = LocalDateTime.of(date, time);
System.out.println(dateTime);

dateTime = dateTime.plusDays(2);
System.out.println(dateTime);

dateTime = dateTime.plusHours(3);
System.out.println(dateTime);

dateTime = dateTime.plusSeconds(15);
System.out.println(dateTime);

//method chaining
datetime = dateTime.minusDays(2).plusHours(3).minusSeconds(45);
System.out.println(dateTime);
```
```
=> 2022-11-15
=> 17:30
=> 2022-11-15T17:30
=> 2022-11-17T20:30
=> 2022-11-17T20:45
=> 2022-11-15T23:00
```
**Date and time classes are immutable!**
```
LocalDate date = LocalDate.of(2022, Month.NOVEMBER, 15);
System.out.println(date);

date.plusDays(10); // date is immutable.
System.out.println(date);

date = date.plusDays(10); // fix
System.out.println(date);
```
```
=> 2022-11-15
=> 2022-11-15
=> 2022-11-25
```
- `isBefore()` and `isAfter()`:
```
LocalDate date1 = LocalDate.of(2022, Month.NOVEMBER, 15);
LocalDate date2 = LocalDate.of(2022, Month.NOVEMBER, 16);
System.out.println(date1.isBefore(date2));
System.out.println(date1.isAfter(date2));
```
```
=> true
=> false
```

<a name="period-duration-and-instant"></a>
### Period, Duration and Instant 

- Period
  - Only with LocalDate and LocalDateTime

```
Period p1 = Period.ofYears(2);
System.out.println(p1);

Period p2 = Period.ofMonths(3);
System.out.println(p2);

Period p3 = Period.ofWeeks(1);
System.out.println(p3);

Period p4 = Period.ofDays(11);
System.out.println(p4);

Period p5 = Period.of(2, 0, 15);
System.out.println(p5);
```

```
=> P2Y
=> P3M
=> P7D
=> P11D
=> P2Y15D
```

- Periods are used with plus/minus on date

```
Period period = Period.of(1, 2, 5);
LocalDate date = LocalDate.of(2022, 11, 20);
date = date.plus(period);
System.out.println(date);

date = date.minus(period);
System.out.println(date);
```

```
=> 2023-01-25
=> 2022-11-20
```

- Duration
  - Only with LocalTime and LocalDateTime

```
Duration d1 = Duration.ofDays(3);
System.out.println(d1);

Duration d2 = Duration.ofHours(2);
System.out.println(d2);

Duration d3 = Duration.ofMinutes(45);
System.out.println(d3);

Duration d4 = Duration.ofSeconds(10);
System.out.println(d4);

Duration d5 = Duration.ofMillis(240);
System.out.println(d5);

Duration d6 = Duration.ofNanos(2503);
System.out.println(d6);
```

```
=> PT72H
=> PT2H
=> PT45M
=> PT10S
=> PT0.24S
=> PT0.000002503s
```

- Using ChronoUnit

```
import java.time.*;
import java.time.temporal.*;

Duration d0 = Duration.of(3, ChronoUnit.HALF_DAYS); // PT36H
Duration d1 = Duration.of(3, ChronoUnit.DAYS); // PT72H
Duration d2 = Duration.of(2, ChronoUnit.HOURS); // PT2H
Duration d3 = Duration.of(45, ChronoUnit.MINUTES); // PT45M
Duration d4 = Duration.of(10, ChronoUnit.SECONDS); // PT10S
Duration d5 = Duration.of(240, ChronoUnit.MILLIS); // PT0.24S
Duration d6 = Duration.of(2503, ChronoUnit.NANNOS); // PT0.000002503s
```
- ChronoUnits can also be used to determine how far apart are two times:

```
LocalTime t1 = LocalTime.of(17, 30);
LocalTime t2 = LocalTime.of(20, 45);
System.out.println(ChronoUnit.HOURS.between(t1, t2));
System.out.println(ChronoUnit.MINUTES.between(t1, t2));
```
```
=> 3
=> 195
```

- Durations are used with plus/minus on time

```
Duration duration = Duration.ofMinutes(45);
LocalTime time = LocalTime.of(17,30);
time = time.plus(duration);
System.out.println(time);

time = time.minus(duration);
System.out.println(time);
```

```
=> 18:15
=> 17:30
```

- Instant
  - Instants are used to record timestamps in the application

```
Instant now = Instant.now();
System.out.println(now);

// Example to measure duration of the process:

Instant before = Instant.now();
// ... some time consuming process...
Instant after = Instant.now();

Duration duration = Duration.between(before, after);
System.out.println(duration);
```

```
=> 2023-04-18T09:20:52.904935284Z
=> 244 (milliseconds)
```

- Converting ZonedTimeDate to instant:

```
ZoneId zone = ZoneId.of("Europe/Zagreb");
ZonedDateTime z = ZonedDateTime.of(2022, 11, 2, 21, 50, 14, 145, zone);
Instant inst = z.toInstant();
System.out.println(inst);
```

```
=> 2022-11-02T20:50:14.000000145Z
```

<a name="methods"></a>
## Methods

In Java, a method is a block of code that performs a specific task. You can think of a method as a function or a behavior that belongs to a class or an object.

Key Points About Methods in Java:
Defined inside a class.

Can take input (parameters) and return a value (or not, if declared void).

Help with code reuse — you can call a method multiple times without rewriting code.

<a name="defining-methods"></a>
### Defining methods

```declarative
returnType methodName(parameters) {
    // method body
    // statements
    return value; // if returnType is not void
}
```

```declarative
public class Calculator {

  // A method that adds two integers and returns the result
  public int add(int a, int b) {
      return a + b;
  }

  // A method that prints a greeting message
  public void greet() {
      System.out.println("Hello!");
  }
}
```
```declarative
public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();  // Create an object of Calculator

        int result = calc.add(5, 3);         // Call the add method
        System.out.println(result);          // Output: 8

        calc.greet();                        // Call the greet method
        // Output: Hello!
    }
}
```

<a name="local-and-instance-variables"></a>
### Local and instance variables
Local variables and instance variables are both used to store data, but they differ in where they are declared, how long they live, and how they are accessed.

#### Local Variables
  - Definition:
    - A local variable is declared inside a method, constructor, or block, and it is only accessible within that method or block.

#### Key Features:

- Created when the method is called.
- Destroyed when the method finishes.
- Must be initialized before use.
- Not accessible outside the method.

```declarative
public void printSum() {
    int a = 5;           // local variable
    int b = 10;          // local variable
    System.out.println(a + b); // 15
}
```

#### Instance Variables
  - Definition:
    - An instance variable is declared inside a class but outside any method, and it belongs to an object (instance) of the class.

#### Key Features:

- Have default values (e.g., 0 for int, null for objects).
- Exist as long as the object exists.
- Accessed using this.variableName (or just variableName inside the class).
- Each object gets its own copy of instance variables.

```declarative
public class Person {
    // Instance variables
    String name;
    int age;

    public void sayHello() {
        System.out.println("Hi, I'm " + name + " and I'm " + age + " years old.");
    }
}
```

```declarative
Person p1 = new Person();
p1.name = "Alice";
p1.age = 30;
p1.sayHello(); // Output: Hi, I'm Alice and I'm 30 years old.
```

| Feature       | Local Variable          | Instance Variable                |
| ------------- | ----------------------- | -------------------------------- |
| Declared in   | Method/block            | Inside class (outside methods)   |
| Scope         | Within method/block     | Whole class                      |
| Lifetime      | During method execution | As long as the object exists     |
| Default Value | None (must initialize)  | Yes (e.g., 0, null)              |
| Accessed by   | Name only               | `this.variableName` or just name |


<a name="variable-arguments"></a>
### Variable arguments

In Java, variable arguments (or varargs) allow you to pass a variable number of arguments to a method — meaning, the method can accept zero or more arguments of a specified type.

This is useful when you don’t know ahead of time how many arguments will be passed to a method.

- The ellipsis (...) means “variable number of.”
- The varargs parameter is treated like an array inside the method.
- You can only have one varargs parameter, and it must be the last parameter in the method.

```declarative
public class MathUtils {

    // A method that takes any number of int arguments
    public int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }
}
```

```declarative
public class Main {
    public static void main(String[] args) {
        MathUtils utils = new MathUtils();

        System.out.println(utils.sum());            // Output: 0
        System.out.println(utils.sum(5));           // Output: 5
        System.out.println(utils.sum(1, 2, 3, 4));   // Output: 10
    }
}
```

🛑 Rules:
Only one varargs parameter per method.

It must be the last parameter.

```declarative
// Valid
void printNames(String... names) { }

// Invalid - varargs must be last
// void test(int... numbers, String label) { }
```

<a name="access-modifiers"></a>
### Access modifiers

Access modifiers are keywords used to set the visibility (access level) of classes, methods, constructors, and variables. They determine who can access what in your code — which is essential for encapsulation and security in object-oriented programming.

| Modifier                | Access Level                                                                          |
| ----------------------- | ------------------------------------------------------------------------------------- |
| `public`                | Accessible **from anywhere**                                                          |
| `private`               | Accessible **only within the same class**                                             |
| `protected`             | Accessible **within the same package** and by **subclasses** (even in other packages) |
| *default* (no modifier) | Accessible **only within the same package**                                           |

| Modifier    | Same Class | Same Package | Subclass (other package) | Other Classes |
| ----------- | ---------- | ------------ | ------------------------ | ------------- |
| `public`    | ✅          | ✅            | ✅                        | ✅             |
| `protected` | ✅          | ✅            | ✅                        | ❌             |
| *default*   | ✅          | ✅            | ❌                        | ❌             |
| `private`   | ✅          | ❌            | ❌                        | ❌             |


<a name="static-members"></a>
### Static members

Static members refer to fields (variables) and methods that belong to the class itself, rather than to any specific instance (object) of that class.

#### What is a Static Member?
- Declared using the static keyword.
- Shared across all instances of the class.
- Can be accessed without creating an object of the class.
- Useful for utility methods, constants, and class-level variables.

#### Static Variable (Field)
A static variable is shared among all objects of a class. All instances see the same value.


```declarative
public class Counter {
    static int count = 0; // static variable

    public Counter() {
        count++; // increase when an object is created
    }

    public void showCount() {
        System.out.println("Count: " + count);
    }
}
```

```declarative
Counter c1 = new Counter();
Counter c2 = new Counter();
c1.showCount();  // Output: Count: 2
```

#### Static Method
A static method can be called without creating an object. It can only access static data directly.

```declarative
public class MathUtils {
    public static int square(int x) {
        return x * x;
    }
}
```

```declarative
int result = MathUtils.square(5); // No object needed
System.out.println(result);       // Output: 25
```

#### Static Block
A static block is used for static initialization — it runs once when the class is loaded.

```declarative
public class Example {
    static {
        System.out.println("Static block called");
    }

    public static void sayHi() {
        System.out.println("Hi!");
    }
}
```

#### Static Class (Nested)
Only nested classes can be static.

```declarative
public class Outer {
    static class Nested {
        void display() {
            System.out.println("Inside static nested class");
        }
    }
}
```

```declarative
Outer.Nested obj = new Outer.Nested();
obj.display();
```

| Feature      | Static                 | Non-Static (Instance)            |
| ------------ | ---------------------- | -------------------------------- |
| Belongs to   | Class                  | Object                           |
| Accessed via | Class name             | Object reference                 |
| Memory       | Loaded once            | New copy for each object         |
| Can access   | Only static members    | Both static and instance members |
| Used for     | Utilities, shared data | Object-specific behavior         |

<a name="boxing-and-unboxing"></a>
### Boxing and unboxing

Boxing and unboxing are mechanisms that deal with the conversion between primitive types (like `int`, `char`, `double`) and their wrapper classes (like `Integer`, `Character`, `Double`).


#### Boxing
Boxing is the process of converting a primitive type into its corresponding wrapper class object.

```declarative
int num = 10;
Integer boxedNum = Integer.valueOf(num); // Boxing
Integer boxed = num; // Autoboxing
```

#### Unboxing
Unboxing is the process of converting a wrapper class object back into its corresponding primitive type.

```declarative
Integer boxedNum = Integer.valueOf(20);
int unboxed = boxedNum.intValue(); // Unboxing
int unboxed = boxedNum; // Auto-unboxing
```

#### Why Do We Need Boxing/Unboxing?
To use primitives in places where objects are required, like:

- Collections (`ArrayList`, `HashMap`, etc.)
- Generics
- Some frameworks (like Spring)

```declarative
List<Integer> numbers = new ArrayList<>();
numbers.add(5); // Autoboxing from int to Integer
int x = numbers.get(0); // Auto-unboxing from Integer to int
```

| Primitive | Wrapper Class |
| --------- | ------------- |
| `byte`    | `Byte`        |
| `short`   | `Short`       |
| `int`     | `Integer`     |
| `long`    | `Long`        |
| `float`   | `Float`       |
| `double`  | `Double`      |
| `char`    | `Character`   |
| `boolean` | `Boolean`     |

| Process       | Description                        | Example                            |
| ------------- | ---------------------------------- | ---------------------------------- |
| Boxing        | Primitive → Wrapper                | `Integer i = Integer.valueOf(10);` |
| Autoboxing    | Automatically done by the compiler | `Integer i = 10;`                  |
| Unboxing      | Wrapper → Primitive                | `int x = i.intValue();`            |
| Auto-unboxing | Automatically done by the compiler | `int x = i;`                       |


<a name="overloading-methods"></a>
### Overloading methods

Method overloading means defining multiple methods with the same name but with different parameter lists (number, type, or order of parameters) within the same class.

- Why Use Method Overloading?
  - Improves code readability and reusability.
  - Lets you use the same method name to perform similar tasks with different inputs.

- Rules for Method Overloading:
  - Methods must have the same name.
  - Methods must have different parameter lists:
    - Different number of parameters.
    - Different types of parameters.
    - Different order of parameters (if types differ).

Overloading is resolved at compile time — it's a form of compile-time polymorphism.

```declarative
public class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }
}
```

```declarative
Calculator calc = new Calculator();

System.out.println(calc.add(2, 3));         // Output: 5
System.out.println(calc.add(2, 3, 4));      // Output: 9
System.out.println(calc.add(2.5, 3.7));     // Output: 6.2
```

#### What Doesn’t Count as Overloading:
Different return types only (without changing parameters) is NOT overloading — it causes a compile-time error.

```declarative
// INVALID
int add(int a, int b) { return a + b; }
// double add(int a, int b) { return a + b; } ❌ Compile-time error
```

| Feature         | Method Overloading               |
| --------------- | -------------------------------- |
| Based on        | Method name + parameter list     |
| Return type     | Can be same or different         |
| Access modifier | Can be same or different         |
| When resolved   | At compile time (static binding) |
| Benefit         | Cleaner and more intuitive APIs  |


<a name="class-design"></a>
## Class design

In Java, class design refers to the process of defining the structure and behavior of a class, which is a blueprint for creating objects in object-oriented programming (OOP).

<a name="inheritance"></a>
### Inheritance

Inheritance is a fundamental concept in object-oriented programming (OOP), including Java. It allows one class (called a subclass or child class) to inherit properties and behaviors (fields and methods) from another class (called a superclass or parent class).

#### Why Use Inheritance?
- Code reuse: Avoid duplicating code by reusing common functionality.
- Extensibility: Add or override features in subclasses without modifying the base class.
- Polymorphism: Use parent class references to refer to child class objects.

```declarative
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}
```

In this example:

- `Dog` is the subclass.
- `Animal` is the superclass.
- `Dog` inherits the `eat()` method from `Animal`.

You can now do:

```declarative
Dog dog = new Dog();
dog.eat();  // Inherited from Animal
dog.bark(); // Defined in Dog
```

#### Types of Inheritance in Java
Java supports the following types:
- Single Inheritance (One class inherits from one superclass)
- Multilevel Inheritance (A class inherits from a class which itself inherits from another)
- Hierarchical Inheritance (Multiple subclasses inherit from the same superclass)

🛑 Note: Java does not support multiple inheritance with classes to avoid ambiguity (like the "diamond problem"), but it allows it via interfaces.

<a name="using-this-and-super"></a>
### Using this and super

In Java, `this()` and `super()` are special constructor calls used within class constructors to initialize objects properly. They help in managing inheritance and constructor chaining.

#### `this()` — Call to Another Constructor in the Same Class
- Used to call another constructor from within the same class.
- Helps to avoid code duplication.
- Must be the first statement in the constructor.

```declarative
class Person {
    private String name;
    private int age;

    // Constructor with two parameters
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructor with one parameter
    public Person(String name) {
        this(name, 0);  // calls the other constructor
    }
}
```

#### `super()` — Call to Constructor of the Parent Class
- Used to call a constructor in the superclass (parent class).
- Helps initialize inherited fields properly.
- Also must be the first statement in the constructor.

```declarative
class Animal {
    Animal(String type) {
        System.out.println("Animal type: " + type);
    }
}

class Dog extends Animal {
    Dog() {
        super("Dog");  // calls Animal(String) constructor
        System.out.println("Dog is created");
    }
}
```
#### Rules to Remember
- Both `this()` and `super()` must be the first line in the constructor.
- You cannot use both `this()` and `super()` in the same constructor — only one can be the first line.

| Keyword   | Purpose                                 | Calls From           | Calls To                              |
| --------- | --------------------------------------- | -------------------- | ------------------------------------- |
| `this()`  | Calls another constructor in same class | Within a constructor | Another constructor in the same class |
| `super()` | Calls a constructor of the superclass   | Within a constructor | Constructor of the parent class       |


<a name="initializing-objects"></a>
### Initializing objects

Order of initialization:

| Phase                       | When It Happens                             | Scope        |
|-----------------------------|---------------------------------------------| ------------ |
| Super class (if available)  | If a super class is available, starts first | Class-level  |
| Static variables            | When class is first loaded                  | Class-level  |
| Static blocks               | After static variables (in order)           | Class-level  |
| Instance variables          | When object is created (after super)        | Object-level |
| Instance initializer blocks | After instance variables                    | Object-level |
| Constructors                | Last step of object creation                | Object-level |

🔹 Special Notes
- Superclass is always initialized before subclass.
- Static blocks and static variables are only run once per class, even if multiple objects are created.
- Initialization order matters — if a static block comes before a static variable, it won’t see the variable initialized yet.

<a name="inheriting-members"></a>
### Inheriting members

In Java, inheriting members means that a subclass (child class) automatically gets access to the fields (variables) and methods of its superclass (parent class) — unless they are private or otherwise restricted.

#### What Members Are Inherited?
✅ Inherited:
- Public and protected fields and methods
- Package-private (default access) members — only if the subclass is in the same package

❌ Not Inherited:
- Private members
- Constructors (but they can be called using `super()`)

```declarative
class Animal {
    protected String name;

    public void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("The dog barks.");
    }
}
```

```declarative
Dog d = new Dog();
d.name = "Buddy";    // Inherited field
d.eat();             // Inherited method
d.bark();            // Dog's own method
```

| Modifier      | Inherited? | Accessible in Subclass?      |
| ------------- | ---------- | ---------------------------- |
| `public`      | Yes        | Yes                          |
| `protected`   | Yes        | Yes (even in other packages) |
| (no modifier) | Yes        | Yes (only in same package)   |
| `private`     | ❌ No       | No                           |


| Member Type     | Inherited by Subclass? | Usable in Subclass? |
| --------------- | ---------------------- | ------------------- |
| Public Field    | ✅ Yes                  | ✅ Yes               |
| Protected Field | ✅ Yes                  | ✅ Yes               |
| Private Field   | ❌ No                   | ❌ No                |
| Public Method   | ✅ Yes                  | ✅ Yes               |
| Constructor     | ❌ No (but callable)    | ✅ With `super()`    |

<a name="abstract-classes-and-interfaces"></a>
## Abstract Classes and Interfaces

<a name="abstract-classes"></a>
### Abstract Classes

**Abstract classes** are classes that cannot be instantiated on their own and are meant to be extended by other classes. They are used to define a common base for a group of related classes, often with some shared code and some abstract behavior that subclasses must implement.

#### Key Features of Abstract Classes
Declared using the `abstract` keyword:

```declarative
abstract class Animal {
    abstract void makeSound(); // abstract method
    void sleep() {
        System.out.println("Sleeping...");
    }
}
```

- Can have both abstract and non-abstract methods:
  - Abstract method: No body, only declaration.
  - Non-abstract method: Has an implementation.
- Cannot be instantiated:
  - You can't create an object like `new Animal()`; if Animal is `abstract`.
- Used for inheritance:
  - Other classes must `extend` the abstract class and implement all abstract methods.

```declarative
class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }
}
```

✅ When to Use Abstract Classes
- When you have **common behavior** to share among subclasses.
- When you want to **partially define a template** for other classes to follow.
- When you need **shared state or constructors**.

🔸 Abstract vs Interface

| Feature      | Abstract Class               | Interface                                           |
| ------------ | ---------------------------- | --------------------------------------------------- |
| Methods      | Can have abstract & concrete | All methods are abstract by default (until Java 8+) |
| Constructors | Can have constructors        | Cannot have constructors                            |
| Inheritance  | Single inheritance           | Can implement multiple interfaces                   |
| Variables    | Can have instance variables  | Variables are `public static final`                 |


<a name="interfaces"></a>
### Interfaces

**Interface** is a blueprint for a class. It is a reference type similar to a class, but it can only contain:

- **Abstract methods** (until Java 8),
- **Constants** (public static final variables),
- And from Java 8 onwards, it can also include **default** and **static methods**,
- From Java 9, **private methods** are also allowed.

#### Why Use Interfaces?
Interfaces are used to:

- Achieve abstraction.
- Support multiple inheritance (which is not possible with classes).
- Define a contract that implementing classes must fulfill.

#### Key Points about Interfaces

| Feature                  | Details                                                               |
| ------------------------ | --------------------------------------------------------------------- |
| Declaration              | Use the `interface` keyword                                           |
| Implementation           | Use the `implements` keyword in the class                             |
| Method Type              | All methods are **public** and **abstract** by default (until Java 8) |
| Variables                | All variables are **public static final** (i.e., constants)           |
| Multiple Interfaces      | A class can implement **multiple interfaces**                         |
| Default Methods (Java 8) | Can have method bodies with `default` keyword                         |
| Static Methods (Java 8)  | Interfaces can have static methods                                    |

#### Syntax Example

```declarative
interface Animal {
    void makeSound();  // abstract method
}
```
A class that implements the interface must define all its methods:

```declarative
class Dog implements Animal {
    public void makeSound() {
        System.out.println("Bark");
    }
}
```

Interface Example with Default Method:

```declarative
interface Animal {
    void makeSound();  // abstract method

    default void sleep() {
        System.out.println("Sleeping...");
    }
}
```

```declarative
class Cat implements Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}
```

#### When to Use an Interface
- When you want to enforce a contract without worrying about implementation.
- When you want to allow a class to inherit behavior from multiple sources (via multiple interfaces).
- When you expect that unrelated classes will implement the interface in different ways.

<a name="lambda-and-functional-programming"></a>
## Lambda and Functional programming

<a name="functional-interfaces"></a>
### Functional interfaces

#### What is a Functional Interface?
A functional interface is an interface that contains exactly one abstract method. It can have default or static methods, but only one method that is abstract (i.e., not implemented).
It is the foundation of lambda expressions in Java.

#### Why Functional Interfaces?
They allow us to:

- Represent a function as an object (functional programming concept).
- Use **lambda expressions** or **method references**.
- Write cleaner and more concise code.

#### How to Define a Functional Interface

```declarative
@FunctionalInterface
interface MyFunction {
    void apply();  // Only one abstract method
}
```
The `@FunctionalInterface` annotation is optional but recommended. It tells the compiler to ensure that the interface has only one abstract method.

```declarative
@FunctionalInterface
interface Greeting {
    void sayHello();
}

public class Main {
    public static void main(String[] args) {
        Greeting greet = () -> System.out.println("Hello!");
        greet.sayHello();  // Output: Hello!
    }
}
```
#### Common Built-in Functional Interfaces (Java 8+)
Java provides many ready-to-use functional interfaces in the `java.util.function` package. Here are some important ones:

| Interface             | Abstract Method Signature | Use Case                       |
| --------------------- | ------------------------- | ------------------------------ |
| `Function<T, R>`      | `R apply(T t)`            | Takes T and returns R          |
| `Predicate<T>`        | `boolean test(T t)`       | Checks a condition             |
| `Consumer<T>`         | `void accept(T t)`        | Consumes a value, no return    |
| `Supplier<T>`         | `T get()`                 | Provides a value, no input     |
| `BiFunction<T, U, R>` | `R apply(T t, U u)`       | Takes two inputs and returns R |

#### Example: Using `Function<T, R>`

```declarative
Function<Integer, String> converter = (num) -> "Number: " + num;
System.out.println(converter.apply(5));  // Output: Number: 5
```

#### Summary
- A functional interface has exactly **one** abstract method.
- It can be used with **lambda expressions** and method references.
- Java provides many **built-in** functional interfaces for common use cases.
- Use the `@FunctionalInterface` annotation to enforce correct usage.

<a name="method-references"></a>
### Method references

A method reference is a shorthand notation for a lambda expression that calls an existing method. It lets you refer to a method by name instead of writing the method body.

#### Syntax of Method References
There are four types of method references:

| Type                         | Syntax                      | Example               |
| ---------------------------- | --------------------------- | --------------------- |
| **Static method**            | `ClassName::staticMethod`   | `Math::abs`           |
| **Instance method (object)** | `object::instanceMethod`    | `System.out::println` |
| **Instance method (class)**  | `ClassName::instanceMethod` | `String::toLowerCase` |
| **Constructor reference**    | `ClassName::new`            | `ArrayList::new`      |

#### Using Method References with Functional Interfaces

- Static Method Reference

```declarative
@FunctionalInterface
interface Converter {
    int convert(String s);
}

public class Main {
    public static int stringToInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        Converter converter = Main::stringToInt;
        System.out.println(converter.convert("123"));  // Output: 123
    }
}
```

- Instance Method Reference (of an object)

```declarative
@FunctionalInterface
interface Printer {
    void print(String s);
}

public class Main {
    public static void main(String[] args) {
        Printer printer = System.out::println;
        printer.print("Hello Method Reference!");  // Output: Hello Method Reference!
    }
}
```

- Instance Method Reference (of a class)

```declarative
@FunctionalInterface
interface StringProcessor {
    String process(String s);
}

public class Main {
    public static void main(String[] args) {
        StringProcessor processor = String::toUpperCase;
        System.out.println(processor.process("hello"));  // Output: HELLO
    }
}
```
Here, `String::toUpperCase` means "call `toUpperCase()` on the argument passed to the method."

- Constructor Reference

```declarative
@FunctionalInterface
interface Creator {
    StringBuilder create();
}

public class Main {
    public static void main(String[] args) {
        Creator creator = StringBuilder::new;
        System.out.println(creator.create().append("Hello"));  // Output: Hello
    }
}
```

#### Summary
- Method references are a clean, concise alternative to lambdas.
- You can use them with functional interfaces where the method signature matches the interface's abstract method.
- They're especially useful when you're just calling an existing method.



<a name="built-in-functional-interfaces"></a>
### Built-in Functional Interfaces

**Built-in functional interfaces** are interfaces that are part of the `java.util.function` package and are designed to support lambda expressions and functional-style programming, introduced in Java 8.

A functional interface is an interface with only one abstract method (though it can have default or static methods). These interfaces can be used as the target type for a **lambda expression or method reference**.

#### Common Built-in Functional Interfaces

| Interface             | Method Signature        | Description                                                                |
| --------------------- | ----------------------- | -------------------------------------------------------------------------- |
| `Function<T, R>`      | `R apply(T t)`          | Takes an input `T` and returns a result `R`.                               |
| `Consumer<T>`         | `void accept(T t)`      | Takes an input `T` and returns nothing. Used for performing operations.    |
| `Supplier<T>`         | `T get()`               | Takes no input and returns a result `T`.                                   |
| `Predicate<T>`        | `boolean test(T t)`     | Takes an input `T` and returns a boolean (used for filtering or matching). |
| `BiFunction<T, U, R>` | `R apply(T t, U u)`     | Takes two inputs and returns a result.                                     |
| `BiConsumer<T, U>`    | `void accept(T t, U u)` | Takes two inputs and returns nothing.                                      |
| `UnaryOperator<T>`    | `T apply(T t)`          | A specialization of `Function` where input and output are the same type.   |
| `BinaryOperator<T>`   | `T apply(T t1, T t2)`   | A specialization of `BiFunction` where all types are the same.             |

#### Example

```declarative
import java.util.function.*;

public class FunctionalExample {
    public static void main(String[] args) {
        // Function
        Function<String, Integer> lengthFunction = s -> s.length();
        System.out.println(lengthFunction.apply("Hello")); // 5

        // Predicate
        Predicate<Integer> isPositive = x -> x > 0;
        System.out.println(isPositive.test(10)); // true

        // Consumer
        Consumer<String> print = s -> System.out.println("Hello " + s);
        print.accept("World"); // Hello World

        // Supplier
        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println(randomSupplier.get());
    }
}
```

#### Use Cases
These interfaces are heavily used in:
- Streams API
- Optional API
- Lambdas and method references

<a name="combining-implementations"></a>
### Combining implementations

You can combine built-in functional interfaces in Java to build more complex behaviors. This is a powerful feature of Java's functional programming capabilities. Many interfaces in the `java.util.function` package provide default methods for composition.

#### Examples of Combining Functional Interfaces
- Function Composition

`Function<T, R>` provides:

- `andThen(Function<R, V>)`: Applies this function first, then the andThen function.
- `compose(Function<V, T>)`: Applies the compose function first, then this one.

```declarative
Function<String, String> trim = String::trim;
Function<String, String> toUpper = String::toUpperCase;

// Combine: trim first, then convert to upper case
Function<String, String> trimAndUpper = trim.andThen(toUpper);

System.out.println(trimAndUpper.apply("   hello   ")); // "HELLO"
```

- Chaining Consumers

`Consumer<T>` provides:

- `andThen(Consumer<? super T>)`: Executes one consumer after another.

```declarative
Consumer<String> print = s -> System.out.println("Print: " + s);
Consumer<String> printLength = s -> System.out.println("Length: " + s.length());

Consumer<String> combined = print.andThen(printLength);
combined.accept("Java"); 
// Output:
// Print: Java
// Length: 4
```
- Combining Predicates

`Predicate<T>` provides:

- `and(Predicate)`
- `or(Predicate)`
- `negate()`

```declarative
Predicate<String> isNotEmpty = s -> !s.isEmpty();
Predicate<String> isLongerThan3 = s -> s.length() > 3;

Predicate<String> complexCheck = isNotEmpty.and(isLongerThan3);

System.out.println(complexCheck.test("Hi"));     // false
System.out.println(complexCheck.test("Hello"));  // true
```

- BinaryOperator with Comparator

You can use `BinaryOperator<T>` with `Comparator<T>` to create min/max selectors:

```declarative
import java.util.Comparator;
import java.util.function.BinaryOperator;

Comparator<Integer> comparator = Integer::compareTo;
BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);

System.out.println(maxBy.apply(10, 20)); // 20
```

#### Summary of Composition Methods

| Interface        | Methods for Composition     |
| ---------------- | --------------------------- |
| `Function`       | `andThen()`, `compose()`    |
| `Consumer`       | `andThen()`                 |
| `Predicate`      | `and()`, `or()`, `negate()` |
| `BinaryOperator` | `maxBy()`, `minBy()`        |


<a name="Functional-interfaces-for-primitives"></a>
### Functional interfaces for primitives

In Java, to improve performance and avoid boxing/unboxing overhead, there are primitive-specific functional interfaces for commonly used types like int, long, and double. These are located in the same package: `java.util.function`.

#### Why Use Primitive Functional Interfaces?
Using generic types like `Function<Integer, Integer>` causes **autoboxing**, which is less efficient. Primitive functional interfaces directly use primitive types, avoiding this overhead.

#### Categories of Primitive Functional Interfaces

- Function Variants

| Interface             | Method Signature            | Description                   |
| --------------------- | --------------------------- | ----------------------------- |
| `IntFunction<R>`      | `R apply(int value)`        | Takes `int`, returns `R`      |
| `LongFunction<R>`     | `R apply(long value)`       | Takes `long`, returns `R`     |
| `DoubleFunction<R>`   | `R apply(double value)`     | Takes `double`, returns `R`   |
| `ToIntFunction<T>`    | `int applyAsInt(T t)`       | Takes `T`, returns `int`      |
| `ToLongFunction<T>`   | `long applyAsLong(T t)`     | Takes `T`, returns `long`     |
| `ToDoubleFunction<T>` | `double applyAsDouble(T t)` | Takes `T`, returns `double`   |
| `IntToDoubleFunction` | `double applyAsDouble(int)` | Takes `int`, returns `double` |
| `IntToLongFunction`   | `long applyAsLong(int)`     | Takes `int`, returns `long`   |

- Predicate Variants

| Interface         | Method Signature       | Description            |
| ----------------- | ---------------------- | ---------------------- |
| `IntPredicate`    | `boolean test(int)`    | Tests an `int` value   |
| `LongPredicate`   | `boolean test(long)`   | Tests a `long` value   |
| `DoublePredicate` | `boolean test(double)` | Tests a `double` value |

- Consumer Variants

| Interface           | Method Signature              | Description                  |
| ------------------- | ----------------------------- | ---------------------------- |
| `IntConsumer`       | `void accept(int)`            | Consumes an `int` value      |
| `LongConsumer`      | `void accept(long)`           | Consumes a `long` value      |
| `DoubleConsumer`    | `void accept(double)`         | Consumes a `double` value    |
| `ObjIntConsumer<T>` | `void accept(T t, int value)` | Takes an object and an `int` |

- Supplier Variants

| Interface        | Method Signature       | Description         |
| ---------------- | ---------------------- | ------------------- |
| `IntSupplier`    | `int getAsInt()`       | Supplies an `int`   |
| `LongSupplier`   | `long getAsLong()`     | Supplies a `long`   |
| `DoubleSupplier` | `double getAsDouble()` | Supplies a `double` |

- Unary/Binary Operator Variants

| Interface              | Method Signature                       | Description            |
| ---------------------- | -------------------------------------- | ---------------------- |
| `IntUnaryOperator`     | `int applyAsInt(int operand)`          | Operates on one `int`  |
| `LongUnaryOperator`    | `long applyAsLong(long)`               | Operates on one `long` |
| `DoubleUnaryOperator`  | `double applyAsDouble(double)`         | One `double`           |
| `IntBinaryOperator`    | `int applyAsInt(int, int)`             | Operates on two `int`s |
| `LongBinaryOperator`   | `long applyAsLong(long, long)`         | Two `long`s            |
| `DoubleBinaryOperator` | `double applyAsDouble(double, double)` | Two `double`s          |

#### Example: Using Primitive Functional Interfaces

```declarative
import java.util.function.*;

public class PrimitiveFunctionalExample {
    public static void main(String[] args) {
        IntPredicate isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(4)); // true

        IntUnaryOperator square = x -> x * x;
        System.out.println(square.applyAsInt(5)); // 25

        ToDoubleFunction<String> lengthAsDouble = s -> s.length() * 1.0;
        System.out.println(lengthAsDouble.applyAsDouble("Java")); // 4.0
    }
}
```

<a name="collections"></a>
## Collections

Collections refers to a framework that provides architectures and classes to store and manipulate groups of objects. It is part of the Java Collections Framework (JCF) and is found in the `java.util` package.
 
#### What is the Java Collections Framework?
The **Java Collections Framework** is a set of interfaces, implementations (classes), and algorithms that help in managing groups of data (like lists, sets, maps, queues).

| Interface    | Description                                                                                                      |
| ------------ | ---------------------------------------------------------------------------------------------------------------- |
| `Collection` | The root interface; extended by other interfaces like `List`, `Set`, and `Queue`.                                |
| `List`       | An ordered collection (e.g., `ArrayList`, `LinkedList`). Duplicates allowed.                                     |
| `Set`        | A collection that does not allow duplicates (e.g., `HashSet`, `TreeSet`).                                        |
| `Queue`      | Designed for holding elements before processing (e.g., `PriorityQueue`).                                         |
| `Map`        | Stores key-value pairs (not a true child of Collection, but part of the framework) (e.g., `HashMap`, `TreeMap`). |

#### Why Use Collections?
- Efficient data manipulation
- Reusability of data structures
- Easy sorting/searching operations
- Reduces development effort


<a name="list"></a>
### List

A List is an ordered collection that:

- Allows duplicate elements
- Maintains insertion order
- Provides indexed access (like arrays)

It's part of the `java.util` package and extends the `Collection` interface.

#### Common Implementations of `List`

| Implementation | Characteristics                                              |
| -------------- | ------------------------------------------------------------ |
| `ArrayList`    | Fast random access, resizable array, slower inserts/removals |
| `LinkedList`   | Doubly linked list, fast insert/delete, slower random access |
| `Vector`       | Legacy class, synchronized, rarely used today                |

```declarative
import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();

        // Add elements
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Insert at specific index
        colors.add(1, "Yellow"); // Insert "Yellow" at index 1

        // Get element
        System.out.println(colors.get(2)); // Output: Green

        // Remove element
        colors.remove("Red"); // Removes "Red"
        colors.remove(1);     // Removes element at index 1

        // Iterate over list
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
```

#### Useful Methods of `List`

| Method                                    | Description                        |
| ----------------------------------------- | ---------------------------------- |
| `add(E e)`                                | Adds element at the end            |
| `add(int index, E element)`               | Inserts element at specified index |
| `get(int index)`                          | Returns element at index           |
| `remove(int index)` or `remove(Object o)` | Removes by index or object         |
| `set(int index, E element)`               | Replaces element at index          |
| `contains(Object o)`                      | Checks if element exists           |
| `size()`                                  | Returns number of elements         |
| `clear()`                                 | Removes all elements               |

<a name="set"></a>
### Set

A `Set` is a collection that:

- **Does not allow duplicate elements**
- May or may not maintain insertion order (depending on implementation)
- Is mainly used when uniqueness of elements is important

It is part of the `java.util` package and extends the `Collection` interface.

#### Common Implementations of `Set`

| Implementation  | Characteristics                                         |
| --------------- | ------------------------------------------------------- |
| `HashSet`       | Unordered, fast, backed by a hash table                 |
| `LinkedHashSet` | Maintains insertion order                               |
| `TreeSet`       | Sorted in natural or custom order (uses Red-Black tree) |

```declarative
import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple"); // Duplicate, will be ignored

        System.out.println(fruits); // Order not guaranteed, no duplicates
    }
}
```

```declarative
Set<String> linkedSet = new LinkedHashSet<>();
linkedSet.add("A");
linkedSet.add("B");
linkedSet.add("C");
System.out.println(linkedSet); // [A, B, C]
```

```declarative
Set<Integer> sortedSet = new TreeSet<>();
sortedSet.add(50);
sortedSet.add(10);
sortedSet.add(30);
System.out.println(sortedSet); // [10, 30, 50]
```

#### Common Methods of `Set`

| Method               | Description                               |
| -------------------- | ----------------------------------------- |
| `add(E e)`           | Adds element (ignored if already present) |
| `remove(Object o)`   | Removes element if present                |
| `contains(Object o)` | Checks if element exists                  |
| `size()`             | Returns number of elements                |
| `isEmpty()`          | Checks if set is empty                    |
| `clear()`            | Removes all elements                      |
| `iterator()`         | Returns an iterator for traversal         |

#### `Set` vs `List`

| Feature      | `List`             | `Set`                     |
| ------------ | ------------------ | ------------------------- |
| Duplicates   | Allowed            | Not allowed               |
| Order        | Maintains order    | Depends on implementation |
| Index access | Yes (`get(index)`) | No                        |
| Use case     | Ordered collection | Unique collection         |


<a name="queue"></a>
### Queue

A `Queue` is a **First-In-First-Out (FIFO)** data structure:

- Elements are added at the end (tail).
- Elements are removed from the front (head).

It is part of the **Java Collections Framework** and is defined in the `java.util` package.

| Interface/Class    | Description                                                |
| ------------------ | ---------------------------------------------------------- |
| `Queue<E>`         | Main interface for queues                                  |
| `Deque<E>`         | Double-ended queue (add/remove from both ends)             |
| `LinkedList<E>`    | Implements both `List` and `Queue`                         |
| `PriorityQueue<E>` | Elements ordered by priority                               |
| `ArrayDeque<E>`    | Efficient `Deque` implementation, faster than `LinkedList` |

#### Common Methods in `Queue`

| Method      | Description                                             |
| ----------- | ------------------------------------------------------- |
| `add(e)`    | Adds element (throws exception if full)                 |
| `offer(e)`  | Adds element (returns false if full)                    |
| `remove()`  | Removes and returns head (throws exception if empty)    |
| `poll()`    | Removes and returns head (returns null if empty)        |
| `element()` | Peeks head without removing (throws exception if empty) |
| `peek()`    | Peeks head without removing (returns null if empty)     |


#### Example: `LinkedList`
```declarative
import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

        System.out.println(queue); // [A, B, C]

        System.out.println("Head: " + queue.peek());  // A
        System.out.println("Removed: " + queue.poll()); // A
        System.out.println("After Removal: " + queue);  // [B, C]
    }
}
```

#### Example: `PriorityQueue`
```declarative
import java.util.*;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();

        pq.offer(30);
        pq.offer(10);
        pq.offer(20);

        System.out.println(pq); // Order not guaranteed when printing

        while (!pq.isEmpty()) {
            System.out.println(pq.poll()); // Prints in ascending order: 10, 20, 30
        }
    }
}
```

#### `Queue` vs `List` vs `Stack`

| Feature  | `Queue`         | `List`      | `Stack` (LIFO) |
| -------- | --------------- | ----------- | -------------- |
| Order    | FIFO            | Ordered     | LIFO           |
| Add      | At the tail     | Anywhere    | Push on top    |
| Remove   | From the head   | By index    | Pop from top   |
| Use Case | Task scheduling | General use | Backtracking   |


<a name="deque"></a>
### Deque

A `Deque` (pronounced "deck") stands for **Double-Ended Queue**. It allows:

Insertion and removal of elements from both ends (front and back).

It can be used both as:

- A queue (FIFO)
- A stack (LIFO)

Java provides the Deque interface in the `java.util` package.

| Implementation | Characteristics                                   |
| -------------- | ------------------------------------------------- |
| `ArrayDeque`   | Fast, resizable array, no capacity limit          |
| `LinkedList`   | Doubly-linked list, can also be used as a `Deque` |

#### Deque Interface Methods

| Operation   | Front                           | Back                          |
| ----------- | ------------------------------- | ----------------------------- |
| Add         | `addFirst(e)` / `offerFirst(e)` | `addLast(e)` / `offerLast(e)` |
| Remove      | `removeFirst()` / `pollFirst()` | `removeLast()` / `pollLast()` |
| Peek (View) | `getFirst()` / `peekFirst()`    | `getLast()` / `peekLast()`    |

#### Example: Using `ArrayDeque`

```declarative
import java.util.*;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        // Add to front and back
        deque.addFirst("Front");
        deque.addLast("Back");

        System.out.println(deque); // [Front, Back]

        // Peek front and back
        System.out.println("First: " + deque.peekFirst()); // Front
        System.out.println("Last: " + deque.peekLast());   // Back

        // Remove from front and back
        deque.pollFirst(); // Removes "Front"
        deque.pollLast();  // Removes "Back"

        System.out.println(deque); // []
    }
}
```

#### Example: Deque as a Stack (LIFO)

```declarative
Deque<String> stack = new ArrayDeque<>();
stack.push("A"); // same as addFirst()
stack.push("B");
stack.push("C");

System.out.println(stack); // [C, B, A]

System.out.println(stack.pop()); // C (LIFO)

```

#### Example: Deque as a Stack (LIFO)

```declarative
Deque<String> queue = new ArrayDeque<>();
queue.offer("A"); // same as addLast()
queue.offer("B");
queue.offer("C");

System.out.println(queue); // [A, B, C]

System.out.println(queue.poll()); // A (FIFO)
```

| Use Case     | Methods Used                 |
| ------------ | ---------------------------- |
| Stack (LIFO) | `push()`, `pop()`            |
| Queue (FIFO) | `offerLast()`, `pollFirst()` |
| Double Queue | `offerFirst()`, `pollLast()` |


<a name="map"></a>
### Map

A Map is a collection that:

- Stores key-value pairs
- Keys must be unique, but values can be duplicated
- Allows fast lookup, insertion, and deletion using the key

It's part of the `java.util` package.

| Implementation  | Characteristics                                            |
| --------------- | ---------------------------------------------------------- |
| `HashMap`       | Unordered, allows `null` keys/values, fast access          |
| `LinkedHashMap` | Maintains **insertion order**                              |
| `TreeMap`       | Sorted by keys (natural or custom order), **no null keys** |
| `Hashtable`     | Legacy, synchronized, no null keys/values                  |

#### Map Interface Key Methods

| Method                        | Description                                       |
| ----------------------------- | ------------------------------------------------- |
| `put(K key, V value)`         | Adds or updates a key-value pair                  |
| `get(Object key)`             | Returns the value for the key (or null)           |
| `remove(Object key)`          | Removes entry by key                              |
| `containsKey(Object key)`     | Checks if key exists                              |
| `containsValue(Object value)` | Checks if value exists                            |
| `keySet()`                    | Returns set of keys                               |
| `values()`                    | Returns collection of values                      |
| `entrySet()`                  | Returns set of key-value pairs (`Map.Entry<K,V>`) |
| `size()`, `clear()`           | Usual collection operations                       |

#### Example: Using `HashMap`

```declarative
import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();

        scores.put("Alice", 85);
        scores.put("Bob", 92);
        scores.put("Charlie", 78);
        scores.put("Bob", 95); // Updates Bob's score

        System.out.println(scores); // {Alice=85, Bob=95, Charlie=78}

        System.out.println("Alice's score: " + scores.get("Alice")); // 85

        scores.remove("Charlie");

        System.out.println("Keys: " + scores.keySet());   // [Alice, Bob]
        System.out.println("Values: " + scores.values()); // [85, 95]
    }
}
```

#### `HashMap` vs `LinkedHashMap` vs `TreeMap`

| Feature     | `HashMap`   | `LinkedHashMap` | `TreeMap`         |
| ----------- | ----------- | --------------- | ----------------- |
| Order       | No order    | Insertion order | Sorted by key     |
| Null Keys   | 1 allowed   | 1 allowed       | ❌ Not allowed     |
| Performance | Fast (O(1)) | Slightly slower | Slower (O(log n)) |
| Use Case    | Fast access | Maintain order  | Sorted data       |

#### When to Use Map?
- You need to associate keys with values (like name → phone number)
- Fast lookup by key
- Need sorted or ordered mappings

<a name="sorting-and-methods"></a>
### Sorting and methods

#### Sorting in Collections
Java provides built-in methods to sort elements using the `Collections` and Arrays utility classes.

#### `Collections.sort(List<T> list)`
Sorts a List into natural order (like alphabetical for strings or ascending for numbers).

```declarative
import java.util.*;

List<Integer> numbers = Arrays.asList(5, 2, 9, 1);
Collections.sort(numbers);
System.out.println(numbers); // [1, 2, 5, 9]
```

#### `Collections.sort(List<T> list, Comparator<T>)`
Sort using a custom comparator:

```declarative
List<String> names = Arrays.asList("Zara", "Alex", "Bob");
Collections.sort(names, (a, b) -> b.compareTo(a)); // Descending
System.out.println(names); // [Zara, Bob, Alex]
```

#### `equals()` Method
The `equals()` method is used to check logical equality between objects.

####  How it works with collections:

```declarative
List<String> list1 = Arrays.asList("A", "B", "C");
List<String> list2 = Arrays.asList("A", "B", "C");

System.out.println(list1.equals(list2)); // true (same elements and order)
```
For collections like `Set`, order doesn't matter. For `List`, it does.

#### Other Useful Methods from Collections Class

| Method                                | Description                              |
| ------------------------------------- | ---------------------------------------- |
| `Collections.reverse(list)`           | Reverses the order of elements           |
| `Collections.shuffle(list)`           | Randomly shuffles the list               |
| `Collections.max(list)`               | Returns the maximum element              |
| `Collections.min(list)`               | Returns the minimum element              |
| `Collections.frequency(coll, obj)`    | Counts how many times an object appears  |
| `Collections.binarySearch(list, key)` | Searches a sorted list                   |
| `Collections.fill(list, obj)`         | Fills the list with the specified object |
| `Collections.copy(dest, src)`         | Copies one list into another             |
| `Collections.unmodifiableList(list)`  | Makes list read-only                     |

#### Sorting with Custom Objects
To sort a custom class, you must either:

- Implement `Comparable<T>`
- Or use a `Comparator<T>`

#### Using `Comparable`

```declarative
class Student implements Comparable<Student> {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public int compareTo(Student other) {
        return this.marks - other.marks; // ascending
    }

    public String toString() {
        return name + ": " + marks;
    }
}

List<Student> students = Arrays.asList(
    new Student("Alice", 90),
    new Student("Bob", 80)
);

Collections.sort(students);
System.out.println(students);
```

#### Using `Comparator`

```declarative
Collections.sort(students, Comparator.comparing(s -> s.name));
```

#### `Objects.equals()` vs `==`
- `==` checks reference equality
- `equals()` checks logical equality
- `Objects.equals(a, b)` safely checks if both are equal, even if one is null.

#### Summary

| Category     | Useful Methods                                                     |
| ------------ | ------------------------------------------------------------------ |
| Sorting      | `Collections.sort()`, `Comparator`, `Comparable`                   |
| Equality     | `.equals()`, `Objects.equals()`                                    |
| Utilities    | `reverse()`, `shuffle()`, `max()`, `frequency()`, `binarySearch()` |
| Immutability | `Collections.unmodifiableList()`                                   |


<a name="exceptions"></a>
## Exceptions

In Java, exceptions are events that occur during the execution of a program that disrupt the normal flow of instructions. They represent runtime errors or other unusual conditions that a program might need to handle.

#### Key Concepts:

**Exception**: An object that describes an error or an unexpected behavior that occurs during program execution.

**Throwable**: The superclass of all errors and exceptions in Java. It has two main subclasses:

**Error**: Serious problems that applications should not try to catch (e.g., `OutOfMemoryError`, `StackOverflowError`).

**Exception**: Conditions that a reasonable application might want to catch.

#### `Checked` vs. `Unchecked` Exceptions:

Checked Exceptions:

- Must be either caught or declared in the method signature using throws.
  - Examples: `IOException`, `SQLException`.

Unchecked Exceptions:

- Subclasses of `RuntimeException`.
- Not required to be caught or declared.
  - Examples: `NullPointerException`, `ArrayIndexOutOfBoundsException`.

Common Exception Handling Keywords:

`try`: Block of code that may throw an exception.

`catch`: Block that handles the exception.

`finally`: Block that executes after try (and catch, if present), regardless of whether an exception was thrown.

`throw`: Used to explicitly throw an exception.

`throws`: Declares exceptions a method might throw.

```declarative
try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero!");
} finally {
    System.out.println("This will always run.");
}
```

#### Why Use Exceptions?
- To separate error-handling code from regular code.
- To handle different types of errors in a structured way.
- To make code more robust and maintainable.

<a name="handling-exceptions"></a>
### Handling exceptions

Handling exceptions in Java involves using the `try-catch-finally` mechanism or declaring exceptions with throws. Here's how you can do it step by step:

#### Using try-catch
Use this when you want to catch and handle the exception within the method.

Example:

```declarative
public class Example {
    public static void main(String[] args) {
        try {
            int number = 10 / 0;  // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
```

#### Using finally
Use finally to run code no matter what happens, usually for cleanup (e.g., closing files or releasing resources).

Example:

```declarative
try {
    String str = null;
    System.out.println(str.length());
} catch (NullPointerException e) {
    System.out.println("Caught a null pointer!");
} finally {
    System.out.println("This block always executes.");
}
```

#### Using throws
If a method might throw a checked exception, but you want to let the caller handle it, use throws.

Example:

```declarative
import java.io.*;

public class Example {
    public static void readFile(String filename) throws IOException {
        FileReader file = new FileReader(filename);
    }

    public static void main(String[] args) {
        try {
            readFile("data.txt");
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
```

#### Multiple catch Blocks
You can catch different types of exceptions separately.

```declarative
try {
    int[] arr = new int[5];
    System.out.println(arr[10]);
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Array index issue: " + e.getMessage());
} catch (Exception e) {
    System.out.println("General exception: " + e.getMessage());
}
```

#### Multi-catch (Java 7+)
You can catch multiple exception types in a single block if they have similar handling.

```declarative
try {
    // Some code that might throw either
    // IOException or SQLException
} catch (IOException | SQLException e) {
    System.out.println("Caught: " + e);
}
```

#### Best Practices
- Catch specific exceptions first.
- Avoid catching `Exception` or `Throwable` unless absolutely necessary.
- Use `finally` or `try-with-resources` to handle resource cleanup.
- Log or report exceptions when needed.
- Don’t suppress exceptions silently.


<a name="try-with-resources"></a>
### try-with-resources

In Java, `try-with-resources` is a special kind of try statement introduced in Java 7 that simplifies the handling of resources (like files, database connections, sockets, etc.) that need to be closed after use.

#### What is try-with-resources?
It's a try block that automatically closes resources that implement the AutoCloseable or Closeable interface—no need for a finally block to manually close them.

#### Basic Syntax:

```declarative
try (ResourceType resource = new ResourceType()) {
    // Use the resource
} catch (Exception e) {
    // Handle exception
}
```
After the `try` block, Java automatically calls `close()` on the resource, even if an exception is thrown.

#### Example with FileReader
Traditional Way:

```declarative
BufferedReader reader = null;
try {
    reader = new BufferedReader(new FileReader("file.txt"));
    System.out.println(reader.readLine());
} catch (IOException e) {
    e.printStackTrace();
} finally {
    try {
        if (reader != null) reader.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
```

With try-with-resources:

```declarative
try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
    System.out.println(reader.readLine());
} catch (IOException e) {
    e.printStackTrace();
}
```
Cleaner and less error-prone!

#### Multiple Resources
You can manage multiple resources in one try-with-resources statement by separating them with semicolons:

```declarative
try (
    FileInputStream fis = new FileInputStream("input.txt");
    FileOutputStream fos = new FileOutputStream("output.txt")
) {
    // Use fis and fos
} catch (IOException e) {
    e.printStackTrace();
}
```

#### Custom Resource (implements AutoCloseable)
You can create your own class that works with try-with-resources:

```declarative
class MyResource implements AutoCloseable {
    public void doSomething() {
        System.out.println("Doing something...");
    }

    public void close() {
        System.out.println("Resource closed.");
    }
}

public class Main {
    public static void main(String[] args) {
        try (MyResource res = new MyResource()) {
            res.doSomething();
        }
    }
}
```

```declarative
Doing something...
Resource closed.
```

#### Summary
- `try-with-resources` is for managing automatic closing of resources.
- Resources must implement AutoCloseable or Closeable.
- It's safer, more concise, and less error-prone than manual `try-catch-finally`.