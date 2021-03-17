package com.DSA;

import java.util.Arrays;
import java.util.LinkedList;

public class AboutLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(); // if we don't specify anything with <> then we can store any kind of object
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(5);
        System.out.println(list.size());
        // list.removeLast() // and other similar methods to ArrayList
        System.out.println(list); // will return what looks like an array [], but actual it's a list
        var newArray = list.toArray();
        System.out.println(Arrays.toString(newArray)); // will output a string of [5, 10, 20, 30]
    }

}
