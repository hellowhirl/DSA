package com.DSA;

import java.util.Arrays;

public class ArrayQueue {
    private final int[] items;
    private int front = 0; // always make sure to hide these fields from outside by making 'private'
    private int rear = 0;

    // nicer if we have a constructor to set this initial capacity
    public ArrayQueue(int capacity) {
        items = new int[capacity];
    }

    public void enqueue(int value) {
        if (front == items.length) throw new IllegalStateException();
        items[rear++] = value; // [rear++] is shorthand
    }

    public void dequeue() {
        front++;
    }

    public int peek() {
        System.out.println(Arrays.toString(items));
        System.out.println(rear);
        return items[front];
    }

    public boolean isEmpty() {
        return rear < front;
    }

    public boolean isFull() {
        return rear == items.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
