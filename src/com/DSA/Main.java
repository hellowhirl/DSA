package com.DSA;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
    	// Stack class is generic, it has angled bracks <E> so we can store any kinds of objects
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println(stack); // looks like array [ ], but it's just for presentation. Stacks behave differently
		var top = stack.pop();
		System.out.println("top: " + top);
		System.out.println(stack);
		var currentTOp = stack.peek();
		System.out.println("currentTOp: " + currentTOp);
		System.out.println(stack.isEmpty());
	}
}
