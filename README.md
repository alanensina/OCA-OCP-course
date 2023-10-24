- [OCA-OCP COURSE](#oca-ocp-course)
  * [Building Blocks](#building-blocks)
    + [Major components of Java](#major-components-of-java)
    + [Class Structure](#class-structure)
    + [Classes and source files](#classes-and-source-files)
    + [The main() method](#the-main-method)
    + [Packages](#packages)
    + [Compile, Run and Archive Java files](#compile-run-and-archive-java-files)
    + [Objects](#objects)
    + [Data types](#data-types)
    + [Text blocks](#text-blocks)
    + [Variables](#variables)
    + [Local Variable Type Inference (LVTI)](#local-variable-type-inference-lvti)
    + [Garbage Collector](#garbage-collector)
  * [Operators](#operators)
    * [Operators in Java](#operators-in-java)
    * [Unary operators](#unary-operators)
    * [Binary operators](#binary-operators)
    * [Assignment operator](#assignment-operator)
    * [Comparison operator](#comparison-operator)

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
  - Example: check the class found in -> `app.section2.Student_002`


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

  - Example of use args as input in main method: `app.section2.Names_004`

<a name="packages"></a>
### Packages
- Java classes are stored in different packages
- You can think of them as folders in which the classes are stored
- In order to use a class, you must _import_ a package in your program
- The package's name usually looks like something like this: `com.alanensina.javacourse`
  - This means that there is a folder `com`, with a subfolder `alanensina`, with a subfolder `javacourse` containing classes
- Check a simple example of import and package in: `app.section2.NumberGenerator_005`
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
    - Example in: `app.section2.Dog_007`

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
- Check an example in: `app.section2.GCExample_012`

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
  - Example in: `app.section3.IncrementAndDecrement_014`


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
  - See example in: `app.section3.RulesOfNumericPromotion_015`


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
  - Check the example in: `app.section3.AssignmentOperator_016`


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
  - Check example: `app.section3.ComparisonOperators_017`
- Logical operators:
  - AND: `a & b`
    - `true` if at least one operands is true
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