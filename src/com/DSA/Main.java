package com.DSA;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var queue = new ArrayQueue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
        System.out.println(queue.peek());
//        System.out.println(Arrays.toString(test));
    }
}
