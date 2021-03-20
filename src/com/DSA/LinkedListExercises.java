package com.DSA;

import java.util.Arrays;

public class LinkedListExercises {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        System.out.println("initial list size: " + list.size());
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(1);
        list.addLast(47);
        System.out.println(list.indexOf(20));
        System.out.println(list.indexOf(100));
        System.out.println(list.size());
        System.out.println(list.contains(30));
        list.removeLast();
        list.removeFirst();
//		list.reverse();
        list.addLast(40);
        list.addLast(50);
        var array = list.toArray();
        System.out.println(Arrays.toString(array));
        System.out.println("list size: " + list.size());
        System.out.println("kthFromTheEnd: " + list.getKthFromTheEnd(3));
    }
}
