package com.DSA;

public class Main {

    public static void main(String[] args) {
        var tree = new Tree();
        tree.insert(5);
        tree.insert(7);
        System.out.println("test");
        tree.insert(3);
        tree.insert(2);
        tree.insert(15);
        System.out.println(tree.find((3)));
    }
}
