package com.example.linkedlist_queue;

import java.util.LinkedList;
import java.util.List;

public class LLQueue<T> {
    private List<T> queue;

    public LLQueue() {
        System.out.println("\nLLQueue() constructor called...");
        this.queue = new LinkedList<>();
        System.out.println("successfully initialized linkedlist queue.");
    }

    public List<T> getQueue() {
        return this.queue;
    }

    public void enqueue(T element) {
        System.out.println("\nLLQueue.enqueue(" + element + ") called...");
        this.queue.add(0, element);
    }

    public T dequeue() {
        System.out.println("\nLLQueue.dequeue() called...");
        T removingElement = this.queue.removeLast();
        System.out.println("removing element [" + removingElement + "].");
        
        return removingElement;
    }

    public T peek() {
        System.out.println("\nLLQueue.peek() called...");

        if (this.queue.size() == 0) {
            return null;
        }

        T first = this.queue.getFirst();
        System.out.println("queue.peek(): " + first);

        return first;
    }

    @Override
    public String toString() {
        System.out.println("\nLLQueue.toString() called...");
        String output = "";

        output += "LLQueue: [";

        for (T num : this.queue) {
            output += num + ", ";
        }

        if (this.queue.size() != 0) {
            output += "\b\b";
        }

        output += "]";

        return output;
    }
}