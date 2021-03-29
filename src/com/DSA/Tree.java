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
    }

    private Node root;

    public void insert(int item) {
        var node = new Node(item);
        if (root == null) {
            root = node;
            return;
        }
        var current = root;
        while (current != null ){
            if (node.value < current.value) {
                var reference = current;
                current = current.leftChild;
                if (current == null) {
                    reference.leftChild = node;
                }
            }
            else {
                var reference = current;
                current = current.rightChild;
                if (current == null) {
                    reference.rightChild = node;
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
