package com.DSA;

import java.util.Arrays;

public class PriorityQueue {
    private int[] priorityQueue = new int[]{1, 3, 5, 7};

    // Exercise: Building a Priority Queue using an Array
    public void insert(int item) {
        int[] arrCopy = new int[priorityQueue.length + 1];
        var reference = 0;
        for(int i = priorityQueue.length - 1; i >= 0; i--) {
            if (item >= priorityQueue[i]) {
                arrCopy[i + 1] = item;
                arrCopy[i] = priorityQueue[i];
            }
            else {
                arrCopy[i] = reference;
                arrCopy[i + 1] = priorityQueue[i];
                reference = priorityQueue[i];
            }
        }
        priorityQueue = arrCopy;
    }

    @Override
    public String toString() {
        return Arrays.toString(priorityQueue);
    }
}
