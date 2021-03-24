package com.DSA;

import java.util.Stack;

public class StringReverser {
    public String reverse(String input) {
        if(input == null) throw new IllegalArgumentException();

        Stack<Character> stack = new Stack<>(); // '<>' in 'new Stack<>()' goes together when we specify an object in first <>

        for (int i = 0; i <input.length(); i++) {
            stack.push(input.charAt(i));
        }

        StringBuffer reversed = new StringBuffer(); // StringBuffer is better for string manipulation operations in Java
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }
}

// run this code in main function of Main class

//    String str = "abcd"; // 'var' also works
//    var reverser = new StringReverser();
//
//    System.out.println(reverser.reverse(str));