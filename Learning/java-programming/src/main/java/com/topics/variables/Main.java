package com.topics.variables;

/*
    Variables, Data Types, and Operators in Java
*/
public class Main {
    /*
        A Java variable is a data container or a named location (reference) capable of storing data. We can declare variables in Java by stating the data type, followed by the variable name/reference, and then an equals sign, and then finally the value want to store.
        For Object variables, we can follow the same pattern but use the new keyword followed by a call to the Object/data-type's constructor.

        Java data types are categorized into two categories:
        - Primitive
        - Non-primitive
        The distinction lies between how they store data and how they are reflected within the underlying memory.

        Primitive data types are the most concrete, basic building-blocks of data in Java, allowing us to store actual value in memory. The data types are stored on the Stack. These data types cannot be null and have a fixed size in memory. It is also important to notice that each primitive data type has a corresponding Wrapper class; this is because non-primitive data types can only store objects.

        Non-primitve data types, on the other hand, store a reference or memory address to the actual object in memory. These kind of data types can be null and are not fixed in size (in memory). These data types are created on the heap, or dynamic memory.

        Primitive data types: Integers, Floating-point numbers, Characters, Boolean

        Integers
        > byte - 1 byte
        > short - 2 bytes
        > int - 4 bytes
        > long - 8 bytes

        Floating-point numbers
        > double
        > float

        Characters
        > char

        Boolean
        > boolean

        Non-Primitive data types: Arrays, Strings
    */
   

    /*
        The main method in Java is the initial starting point of any Java program. This is possible because it is a public method which means it can be reached/called from outside of the class it is declared in. Because the main method in Java is static, it can be called by the Java Virtual Machine without having to instantiate an object of the class in which it is declared. The main method also has a return type of void, which means it does not return anything to the caller.

        Static Fields & Static Methods
        - Belong to the class rather than instances.
        - Can be accessed without creating an object (instantiaion).
        - Shared among all instances of a class.
    */
    public static void main(String[] args) {
        System.out.println("Variables in Java\n-----------------");
        
        /*
            Rules for naming identifiers - the only allowed characters in Java identifiers are "a" -> "z", "A" -> "Z", 0 -> 9, "$", "_". We cannot use reserved words as identifiers. All predefined class names and interface names can be used as identifiers. Identifier names cannot stand with digits. Java identifiers are also case-sensitive.

            Reserved words in Java are categorized into two categories: keywords and reserverd literals.
        */
        int num = 7;
        System.out.println("\nint num = " + num);

        double PI = 3.14159d;
        System.out.println("double PI = " + PI);

        float taxRate = 1.357f; // must add f to declare value as float (double is default)
        System.out.println("float taxRate = " + taxRate);

        /*
            32-bit - 4 bytes
            > can store unicode values as well (ASCII).
        */
        char lastInitial = 'M';
        char dollarSign = '$';
        System.out.println("char lastInitial = " + lastInitial);
        System.out.println("char dollarSign = " + dollarSign);

        boolean lovesToCode = true;
        System.out.println("boolean lovesToCode = " + lovesToCode);

        String name = "Sami M.";
        System.out.println("String name = "  + name);

        /*
            When storing this @ character as a byte, it actually stores the value 64 (ascii value of character).
        */
        byte myByte = '@';
        System.out.println("byte myByte = " + myByte);
        
        short myShort = 4;
        System.out.println("short myShort = " + myShort);
        
        long myLong = 999999999;
        System.out.println("long myLong = " + myLong);

        /*
            Operators in Java
            * Aithmetic operators - mathematical operations on variables and value literals.
            * Relational operators - used to compare to operands, and return a boolean (true or false).
            * Conditional operators - used on boolean operands (mathematical boolean algebra).
                > &&
                > ||
                > ! (inverse/not)
            * Assignment operators
                > +=
                > -=
                > *=
                > /=
                > %=
        */
        int a = 10, b = 20, c = 15, d = 25;
        System.out.println("\na = " + a);
        System.out.println("b  " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        int sum = a + b;
        System.out.println("\na + b = " + sum);
        int difference = a - b;
        System.out.println("a - b = " + difference);
        int product = a * b;
        System.out.println("a * b = " + product);
        float quotient = (float) d / (float) c;
        System.out.println("d / c = " + quotient);
        int mod = d % c;
        System.out.println("d % c = " + mod);

        /*
            Increment/Decrement Operators:
            1. Pre-increment - the value is incremented first and then assigned or used in an expression.
            2. Post-increment - the value is first assigned or used in an expression, and then incremented.

            These operators will not work/operate on variables that are constants or literals.
            * We cannot nest these kind of operators.

            We can apply these operators on all primitive data types except boolean type.
        */
        a++;
        System.out.println("\na++ = " + a);
        b--;
        System.out.println("b-- = "+ b);

        final int temp = 10; // this variable is a final variable (immutable/not-modifiable).
        System.out.println("\ntemp = " + temp);

        System.out.println("\na == b: " + (a == b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a >= b: " + (a >= b));

        /*
            Implicit vs. Explicit Type Casting

            Implicit - smaller type assigned to larger type (smaller data type -> larger data type). This is also known as widening.
            * byte -> short -> int -> long -> float -> double
            * char -> int

            Explicit - larger type assigned to smaller type (not performed by JVM/compiler, we as developers must do this).
        */
    }
}