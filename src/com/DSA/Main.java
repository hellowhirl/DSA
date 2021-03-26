package com.DSA;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var queue = new ArrayQueue(5); // in InteliJ we can simply type 'AQ' and it will autofill our class
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
        System.out.println("peek: " + queue.peek());
        System.out.println("overwritten toString: " + queue); // works after we override the toString method in our ArrayQueue class

        var removed = queue.dequeue();
        System.out.println("removed " + removed);
        System.out.println("peek: " + queue.peek());
        queue.enqueue(6);
    }
}
