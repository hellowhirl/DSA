package com.DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ExpressionBalancer {
    private static final List<Character> leftBrackets = Arrays.asList('(', '[', '{', '<');
    private static final List<Character> rightBrackets = Arrays.asList(')', ']', '}', '>');
    //    private static final Arrays.asList()

    public static boolean isBalanced(String input) {
        Stack<Character> theBrackets = new Stack<>();

        // we cannot iterate over a string in Java so we have to convert it to a character array
        for (char ch : input.toCharArray()) {
            if (leftSide(ch)) {
                theBrackets.push(ch);
            }

            if (rightSide(ch)) {
                if (theBrackets.isEmpty()) return false;

                var top = theBrackets.pop(); // check to see if this popped bracket matches the incoming one
                if (!checkMatch(top, ch)) return false;
            }
        }
        System.out.println(theBrackets);
        return theBrackets.isEmpty();
    }

    private static boolean leftSide(char input) {
        return leftBrackets.contains(input);
    }

    private static boolean rightSide(char input) {
        return rightBrackets.contains(input);
    }

    private static boolean checkMatch(char left, char right) {
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);

    }
}

//// to test in Main Class ////

// String str = "() <>";
// ExpressionBalancer expressionTester = new ExpressionBalancer();
// System.out.println(expressionTester.isBalanced(str));
