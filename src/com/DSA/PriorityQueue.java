package com.DSA;

import java.util.Arrays;

public class PriorityQueue {
    private final int[] itemsInQueue = new int[5];
    private int count; // to count the number of items in our queue

    // Exercise: Building a Priority Queue using an Array
    public void insert(int item) {
        if (count == itemsInQueue.length ) throw new IllegalStateException(); // a further challnege is to resize this array

        int i; // initialize the iterator variable outside the for loop so we don't lose reference to current item
        for(i = count - 1; i >= 0; i--) {
            // if item is greater than value at iteration then we want to shift current iteration item to te right
            if (itemsInQueue[i] > item ) {
                itemsInQueue[i + 1] = itemsInQueue[i];
            }
            else {
                break;
            }
        }
        itemsInQueue[i + 1] = item; // we know where to insert new item based on when above for loop stopped
        count++; // increase count before next insert()
    }

    public int remove() {
        if (count == 0) throw new IllegalStateException();

        return itemsInQueue[--count]; // removes items at end of queue in scenario where high numbers have higher priority for being processed first
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(itemsInQueue);
    }
}
