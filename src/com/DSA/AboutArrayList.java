package com.DSA;

import java.util.ArrayList;

public class AboutArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); // <> represent a generic paramter; use type Classes (custom Classes work too)
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(30);
        list.remove(4);
        System.out.println(list.size());
        System.out.println(list);
        System.out.println(list.contains(20));
        System.out.println(list.indexOf(20));
        list.toArray(); // converts this list to regular Array object
    }
}
