package com.DSA;

public class Main {
    public static void main(String[] args) {
        StackQueue queue = new StackQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
        queue.enqueue(4);
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
        System.out.println(queue.isEmpty());
        System.out.println(queue.peek());
    }
}
