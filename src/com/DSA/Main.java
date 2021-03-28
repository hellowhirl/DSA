package com.DSA;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println(firstRepeatedCharacter());
    }

    public static char firstRepeatedCharacter() {
        String testLetters = "a green apple";
        Map<Integer, Character> mapped = new HashMap<>();

        int i;
        char test = 0;
        for (i = 0; i < testLetters.length(); i++) {
            if(mapped.containsValue(testLetters.charAt(i))) {
                test = testLetters.charAt(i);
                break;
            }
            char c = testLetters.charAt(i);
            mapped.put(i, c);
        }

        System.out.println(mapped);
        return test;
    }
}
