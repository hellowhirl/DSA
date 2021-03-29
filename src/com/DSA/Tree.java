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
        if (root == null) {
            root = new Node(value);
            return;
        }

        var current = root;
        // set to infinite while loop until we find a parent, becasue eventually we will
        while (true) {
            if (value < current.value) {
                var reference = current;
                current = current.leftChild;
                if (current == null) {
                    reference.leftChild = new Node(value);
                    return;
                }
            }
            else {
                var reference = current;
                current = current.rightChild;
                if (current == null) {
                    reference.rightChild = new Node(value);
                    return;
                }
            }
        }

    }

    public boolean find(int value) {
        var current = root;
        while (current != null ){
            if (value == current.value) return true;
            else if (value < current.value) {
                current = current.leftChild;
            }
            else {
                current = current.rightChild;
            }
        }
        return false;
    }
}
