package com.topics.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    /*
        A LinkedList is a chain of nodes where a Node is a data structure that holds the data/element, and a pointer/reference to the next Node in the chain.

        The first element/node in the LinkedList is called the Head.

        Java utilizes a doubly linkedlist, which means it keeps track of the Head node as well as the Tail node. This allows us to traverse the linkedlist in both directions. Insertion, removal, or access at the head or tail is a O(1) operation.
        
        Properties
        * Can contain duplicate elements.
        * Maintains insertion order.
        * Non-synchronized collection.
        * Underlying data structure in Java is the doubly linked list.
        * Allows heterogeneous objects (also null).
    */
    public static void main(String[] args) {
        System.out.println("\nCollections in Java\n--------------------\n");

        List<String> fruits = new LinkedList<>();
        fruits.add("bananas");
        fruits.add("apples");
        fruits.add("grapes");
        fruits.add("lychee");
        System.out.println("fruits: " + fruits);
        fruits.remove("apples"); // removing apples element
        System.out.println("fruits: " + fruits);
        System.out.println("fruits.size(): " + fruits.size());
    }
}