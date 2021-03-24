package com.DSA;

import java.util.ArrayDeque;
import java.util.Queue;

public class AboutQueues {
    public static void main(String[] args) {
        // Queue<Integer> q = new Queue<Integer>() // InteliJ will generate an anonymous class implementation

        // our type of variable is Integer which we program against the Queue interface
        Queue<Integer> queue = new ArrayDeque<>(); // we set to an instance of the ArrayDequeue class
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println(queue); // again appears like an array, but its b
        var front = queue.remove();
        System.out.println(front);
        System.out.println(queue);
        System.out.println(queue.peek());
    }
}
