package com.DSA;

import java.util.Arrays;

public class PriorityQueue {
    private final int[] itemsInQueue = new int[5];
    private int count; // to count the number of items in our queue

    // Exercise: Building a Priority Queue using an Array
    public void insert(int item) {
        if (isFull()) throw new IllegalStateException(); // a further challnege is to resize this array

        int i = shiftItemsToInsert(item); // shorter and easier to understand by extracting this logic into a separate method
        itemsInQueue[i] = item; // better to execute the [i + 1] logic before we indicate position to insert 'item'
        count++; // increase count before next insert()
    }

    // method more clearly explain what it does - shifting items to insert this new `item`
    private int shiftItemsToInsert(int item) {
        int i; // initialize the iterator variable outside the for loop so we don't lose reference to current item
        for(i = count - 1; i >= 0; i--) {
            // if item is greater than value at iteration then we want to shift current iteration item to te right
            if (itemsInQueue[i] > item) {
                itemsInQueue[i + 1] = itemsInQueue[i];
            }
            else {
                break;
            }
        }
        return i + 1; // the position where we want to insert the new item
    }

    public int remove() {
        if (count == 0) throw new IllegalStateException();

        return itemsInQueue[--count]; // removes items at end of queue in scenario where high numbers have higher priority for being processed first
    }

    public boolean isEmpty() {
        return count == 0;
    }

    // we can also reuse this method within our class
    public boolean isFull() {
        return count == itemsInQueue.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(itemsInQueue);
    }
}

// run this code in main function of Main class

//        PriorityQueue queue = new PriorityQueue();
//        System.out.println(queue);
//        queue.insert(4);
//        queue.insert(1);
//        System.out.println(queue);
//        queue.insert(5);
//        queue.insert(3);
//        queue.insert(7);
//        System.out.println(queue);
//        System.out.println(queue.remove());
//        System.out.println(queue);
//        queue.insert(10);
//        System.out.println(queue);
//
//        queue.remove();
//        queue.remove();
//        queue.remove();
//        queue.remove();
//        queue.remove();
//        System.out.println(queue.isEmpty());

