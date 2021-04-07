package com.DSA;

import java.util.HashMap;
import java.util.Map;

public class CharFinder {
    public char firstNonRepeat() {
        String testLetters = "a green apple";
        Map<Character, Integer> mapped = new HashMap<>();
        String[] single;

        for (int i = 0; i < testLetters.length(); i++) {
            char c = testLetters.charAt(i);
            int count;
//            count = mapped.getOrDefault(c, 0); // shorthand
            if (mapped.containsKey(c)) {
                count = mapped.get(c);
            } else {
                count = 0;
            }
            mapped.put(c, count + 1);
        }

        for (int i = 0; i < testLetters.length(); i++) {
            if (mapped.get(testLetters.charAt(i)) == 1)
                return testLetters.charAt(i);
        }

        System.out.println(mapped);
        throw new Error("not in this string");
    }

    public char firstRepeatedCharacter(String input) {
        Map<Integer, Character> mapped = new HashMap<>();

        char repeatedCharacter = 0;
        for (int i = 0; i < input.length(); i++) {
            if(mapped.containsValue(input.charAt(i))) {
                repeatedCharacter = input.charAt(i);
                break;
            }
            char c = input.charAt(i);
            mapped.put(i, c);
        }

        return repeatedCharacter;
    }

}
