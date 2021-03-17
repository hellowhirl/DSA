package com.DSA;

import java.util.ArrayList;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value; // whenever we create a Node object we should always store the passed value
        }
    }

    private Node first;
    private Node last;
    ArrayList<Object> list = new ArrayList<>();

    public void addLast(int item) {
        var node = new Node(item); // unless we initialize with constructor then this Node will be created without value

        // if node is only node in LL, assign it both first and last
        if (first == null)
            // first = node;
            // last = node;
            first = last = node; // simplified
        else { // scenario where our list has at lest one Node
            last.next = node; // link last Node to this new node, before we set last to the new node
            last = node;
        }
    }
    public void addFirst() {
    }
    public void deleteFirs() {
    }
    public void deleteLast() {
    }
    public void contains() {
    }
    public void indexOf() {
    }
}
