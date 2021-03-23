package com.DSA;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var test = new Stack();
        test.push(10);
        test.push(20);
        test.push(30);
        test.pop();
        System.out.println(test.peek());
        System.out.println(test.isEmpty());
        System.out.println(test); // when we pass object to printLn method it calls toString method on that object
	}
}
