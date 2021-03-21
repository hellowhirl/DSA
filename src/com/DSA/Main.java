package com.DSA;

import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
    	String str = "abcd";
    	String[] words = str.split("");
		System.out.println(Arrays.toString(words));
		Stack<String> reversed = new Stack<>();
		for (int i = words.length -1; i >= 0; i--) {
			reversed.push(words[i]);
		}
		System.out.println(reversed);
	}
}
