package com.DSA;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String str = "(1 + 2) (1 - ()) (<> {} [])  ";
        ExpressionBalancer tester = new ExpressionBalancer();

        System.out.println(tester.isBalanced(str));

	}
}
