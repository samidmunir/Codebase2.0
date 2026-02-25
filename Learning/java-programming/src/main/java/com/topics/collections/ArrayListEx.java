package com.topics.collections;

import java.util.ArrayList;
import java.util.List;

/*
    Collections are a way to store a group of objects together. The advantage of Collections is that they are dynamic in size and come packaged with useful methods to operate on that Collection. Arrays, on the other hand, are fixed in size. We may run into scenarios when we do not know the exact number of elements that we will be storing in our program; Collections are a Java offering to mitigate this issue.
    
    Arrays:
    - fixed size
    - elements of same type
    - no out-of-the-box methods to operate on the data structure
    - ordering based on insertion order

    Collections:
    - dynamic size
    - elements of different types (Object)
    - come packaged with methods for useful operations
        > insertion
        > removal
        > access
        > sort
    - ordering based on insertion order or Collection specific

    Collections framework is a unified architecture for representing and manipulating a collection.
    - The classes and interfaces of the Collection framework are present in the java.util package.

    Collection is a framework with a set of classes and interfaces in Java which provides us an architecture to manipulate, perform operations, and to store a group of Objects.

    Collection Interfaces:
    * List
    * Set
    * Queue
    * Map (does not extend Collection interface)
*/
public class ArrayListEx {
    /*
        List is a linear data structure.
        * Elements can be stored in or not stored in contiguous memory (underlying array vs. linked list).
        * Preserves insertion order.
        * Duplicate elements allowed.
        * No fixed size (can dynamically grow).
        * Elements are accessed using an index.
        * Allows null values.
    */
    public static void main(String[] args) {
        System.out.println("\nCollections in Java\n--------------------\n");

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(56);
        nums.add(22);
        nums.add(7);
        nums.add(93);
        System.out.println("nums: " + nums);
        nums.add(0, 0); // adding 0 at index 0
        System.out.println("nums: " + nums);

        ArrayList<Character> nameChars = new ArrayList<>();
        nameChars.add('S');
        nameChars.add('a');
        nameChars.add('m');
        nameChars.add('i');
        System.out.println("\nnameChars: " + nameChars);
        System.out.println("nameChars.contains('S'): " + nameChars.contains('S'));
    }
}