package com.topics.variables;

public class Main {
    /*
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
        
        int num = 7;
        System.out.println("\nint num = " + num);

        double PI = 3.14159d;
        System.out.println("double PI = " + PI);

        float taxRate = 1.357f;
        System.out.println("float taxRate = " + taxRate);

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
    }
}