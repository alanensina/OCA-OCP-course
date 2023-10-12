- [OCA-OCP COURSE](#oca-ocp-course)
  * [Building Blocks](#building-blocks)
    + [Major components of Java](#major-components-of-java)
    + [Class Structure](#class-structure)
    + [Classes and source files](#classes-and-source-files)
    + [The main() method](#the-main-method)
    + [Packages](#packages)
    + [Compile, Run and Archive Java files](#compile-run-and-archive-java-files)

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













