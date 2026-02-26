package com.topics.collections;

import java.util.List;
import java.util.Vector;

public class VectorEx {
    /*
        A Vector is like a dynamic array that can grow and shrink in size.
        * heterogeneous objects storing allowed.
        * preserves insertion order of elements.
        * allows duplicate elements.
        * thread safe (synchronized)
        
        ArrayList vs. Vector
        > ArrayList is not synchronized.
        > ArrayList is not a legacy class.
        > ArrayList increases it size only by 50%. Vector increases it size by doubling its size.
    */
    public static void main(String[] args) {
        System.out.println("\nVector in Java\n--------------------\n");

        List<Integer> grades = new Vector<>();
        grades.add(76);
        grades.add(95);
        grades.add(83);
        grades.add(85);
        grades.add(91);
        System.out.println("grades: " + grades);
    }
}