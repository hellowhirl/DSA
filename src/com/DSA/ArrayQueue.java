package com.DSA;

import java.util.Arrays;

public class ArrayQueue {
    private final int[] items;
    private int front = 0; // always make sure to hide these fields from outside by making 'private'
    private int rear = 0;
    private int count = 0;

    // nicer if we have a constructor to set this initial capacity
    public ArrayQueue(int capacity) {
        items = new int[capacity];
    }

    public void enqueue(int value) {
        System.out.println("enqueue: " + value + ", " + count);
        if (count == items.length) throw new IllegalStateException();
        items[rear] = value; // [rear++] is shorthand
        rear = (rear + 1) % items.length; // simulates circular array
        count++;
    }

    public int dequeue() {
        var marker = items[front];
        System.out.println("removed: " + marker);
        items[front] = 0; // just to indicate empty slots in our array
        front = (front + 1) % items.length; // simulates circular array
        count--;
        return marker;
    }

    public int peek() {
        return items[front];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == items.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}

// run this code in main function of Main class

//    var queue = new ArrayQueue(5); // in InteliJ we can simply type 'AQ' and it will autofill our class
//        queue.enqueue(1);
//                queue.enqueue(2);
//                queue.enqueue(3);
//                queue.enqueue(4);
//                queue.enqueue(5);
//                System.out.println("peek: " + queue.peek());
//                System.out.println("overwritten toString: " + queue); // works after we override the toString method in our ArrayQueue class
//
//                var removed = queue.dequeue();
//                System.out.println(removed);
//                System.out.println("peek: " + queue.peek());
//                System.out.println(queue.dequeue());
//                queue.enqueue(6);
//                System.out.println("overwritten toString: " + queue); // works after we override the toString method in our ArrayQueue class
//                System.out.println(queue.dequeue());
//                queue.enqueue(7);
//                queue.enqueue(8);
////        System.out.println(queue.dequeue());
//                System.out.println("overwritten toString: " + queue); // works after we override the toString method in our ArrayQueue class
//                System.out.println(queue.isFull());
//                System.out.println(queue.isEmpty());