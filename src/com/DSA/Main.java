package com.DSA;

public class Main {
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();
        System.out.println(queue);
        queue.insert(4);
        queue.insert(1);
        System.out.println(queue);
        queue.insert(5);
        queue.insert(3);
        queue.insert(7);
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);
        queue.insert(10);
        System.out.println(queue);

        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        System.out.println(queue.isEmpty());
    }
}
