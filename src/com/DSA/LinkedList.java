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
        if (isEmpty())
            // first = node;
            // last = node;
            first = last = node; // simplified
        else { // scenario where our list has at lest one Node
            last.next = node; // link last Node to this new node, before we set last to the new node
            last = node;
        }
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

    public int length() {
        int count = 0;
        var current = first;
        while(current != null) {
            current = current.next;
            count++;
        };
        return count;
    }

    public boolean contains(int item) {
        var current = first;
        while(current != null) {
            if(current.value == item) return true;
            current = current.next;
        };
        return false;
    }

    public void deleteFirst() throws Exception {
        if (first == null)
            throw new Exception("Can't delete item from empty Linked List");
        else {
            first = first.next;
        }
    }

    public void deleteLast() throws Exception {
        if (first == null)
            throw new Exception("Can't delete item from empty Linked List");
        else if (first.next != null) {

        }
    }

}
