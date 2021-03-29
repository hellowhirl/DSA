package com.DSA;

public class Tree {
    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        // constructor
        public Node (int value) {
            this.value = value;
        }

        // be able to see the value right away (without having to expand field in debug mode)
        @Override
        public String toString() {
            return "Node=" + value;
        }
    }

    private Node root;

    public void insert(int value) {
        var node = new Node(value); // best to create new node at beginning of this method

        if (root == null) {
            root = node;
            return;
        }

        var current = root;
        // set to infinite while loop until we find a parent, because eventually we will
        while (true) {
            if (value < current.value) {
                // check to see if leftChild is null first, and if it is then we can set to node with new value
                if (current.leftChild == null) {
                    current.leftChild = node; // set current.leftChild
                    break;
                }
                current = current.leftChild; // otherwise we keep traversing current down the tree
            }
            else {
                if (current.rightChild == null) {
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            }
        }

    }

    public boolean find(int value) {
        var current = root;
        while (current != null ){
            if (value < current.value) {
                current = current.leftChild;
            }
            else if (value > current.value)
                current = current.rightChild;
            else {
                return true; // more logical/cleaner to return true at the end of these if/else statements
            }
        }
        return false;
    }
}
