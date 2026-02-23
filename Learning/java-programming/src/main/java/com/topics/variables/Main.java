package com.topics.variables;

public class Main {
    /*
        A variable is a usable container for a value.

        Primitive variables store simple values directly in memory (stack).
        Reference variables hold memory addressed (stored in stack) that point to data in the heap.

        Primitive Data Types
        - int
        - double
        - char
        - boolean

        Reference
        - string
        - array
        - object
    */
    public static void main(String[] args) {
        System.out.println("Variables in Java\n-----------------");
        
        int myFavoriteNumber = 7;
        System.out.println("\nint myFavoriteNumber = " + myFavoriteNumber);

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
    }
}