package com.DSA;

import java.util.PriorityQueue;

public class AboutPriorityQueues {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(1); // upon being added, it does not go to end of queue, it is placed in its proper sorted order
        queue.add(3);
        queue.add(2);
        // by default smallest numbers will come out first, not in the order that we added them to the queue
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
