package com.DSA;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        // constructor for intiializing the value each time we create a new Node object
        public Node(int value) {
            this.value = value; // whenever we create a Node object we should always store the passed value
        }
    }

    private Node first;
    private Node last;
    private int size; // if we just declare a variable then the default value is set to 0
    ArrayList<Object> list = new ArrayList<>();

    public void addLast(int item) {
        var node = new Node(item); // unless we initialize with constructor then this Node will be created without value

        // if node is only node in LL, assign it both first and last
        if (isEmpty())
            // first = node;
            // last = node;
            first = last = node; // simplified
        else { // scenario where our list has at lest one Node
            last.next = node; // link last Node to this new node, before we set last to the new node
            last = node;
        }

        size++;
    }
    public void addFirst(int item) {
        var node = new Node(item);
        if (isEmpty())
            // first = node;
            // last = node;
            first = last = node; // simplified
        else {
            node.next = first;
            first = node;
        }

        size++;
    }

    private boolean isEmpty() {
        return first == null; // we can replace our if statements with a call to this method; avoid repetition
    }

    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while(current != null) {
            if(current.value == item) return index;;
            current = current.next;
            index++;
        };
        return -1;
    }

    // an O(1) operation
    public int size() {
        return size; // better than iterating through entire list each time, especially for longer lists
    }

    public boolean contains(int item) {
        return indexOf(item) != -1; // traverse list from head to tail to find item ? true : false; we already have this logic in indexOf()
    }

    public void removeFirst() {
        var second = first.next; // this variable is a backup referencing the second node
        if (isEmpty()) // let's reuse our method from before
            throw new NoSuchElementException("Can't delete item from empty Linked List"); // mirror behavior of LinkedList in java.utils
        else {
            first.next = null;
            first = second;
        }

        size--;
    }

    public void removeLast() {
        if (isEmpty()) // let's reuse our method from before
            throw new NoSuchElementException("Can't delete item from empty Linked List"); // mirror behavior of LinkedList in java.utils

        // easy edge case for when we have only 1 item in the list
        if (first == last) {
            first = last = null;
        } else {
            var current = first;
            var nodeHolder = current;
            while(current != null) {
                if (current.next == null) {
                    nodeHolder.next = null;
                    last = nodeHolder;
                    break;
                }
                nodeHolder = current;
                current = current.next;
            };
        }
        size--;
    }

}















