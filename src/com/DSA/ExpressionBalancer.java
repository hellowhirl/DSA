package com.DSA;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressionBalancer {
    public static boolean isBalanced(String input) {
        Stack<CharSequence> theBrackets = new Stack<>();
        String[] array = input.split("");

        for (String s : array) {
            if (getMatcher(s)) {
                theBrackets.push(s);
                continue;
            }
            if (s.equals(")") && theBrackets.peek().equals("("))
                theBrackets.pop();
            if (s.equals("]") && theBrackets.peek().equals("["))
                theBrackets.pop();
            if (s.equals("}") && theBrackets.peek().equals("{"))
                theBrackets.pop();
            if (s.equals(">") && theBrackets.peek().equals("<"))
                theBrackets.pop();
        }
        System.out.println(theBrackets);
        return theBrackets.isEmpty();
    }

    private static boolean getMatcher(CharSequence input) {
        String regex = "[\\[{]|[(]|<";

        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(input);
        return match.matches();
    }
}
