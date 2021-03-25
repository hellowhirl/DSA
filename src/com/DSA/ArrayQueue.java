package com.DSA;

import java.util.Arrays;

public class ArrayQueue {
    int[] queue = new int[5];
    int front = 0;
    int rear = 0;

    public void enqueue(int value) {
        queue[rear] = value;
        rear++;
    }

    public void dequeue() {
        front++;
    }

    public int peek() {
        System.out.println(Arrays.toString(queue));
        System.out.println(rear);
        return queue[front];
    }

    public boolean isEmpty() {
        return rear < front;
    }

    public boolean isFull() {
        return rear == queue.length;
    }
}
