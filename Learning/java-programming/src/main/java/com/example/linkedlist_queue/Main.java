package com.example.linkedlist_queue;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nLinkedlist Queue Implementation\n-----------------------------------");

        LLQueue<Integer> numsQ = new LLQueue<>();
        System.out.println(numsQ);

        numsQ.enqueue(2);
        numsQ.enqueue(5);
        numsQ.enqueue(86);
        numsQ.enqueue(247);
        numsQ.enqueue(0);
        System.out.println(numsQ);

        numsQ.dequeue();
        System.out.println(numsQ);
        numsQ.dequeue();
        numsQ.dequeue();
        System.out.println(numsQ);

        numsQ.peek();
    }
}