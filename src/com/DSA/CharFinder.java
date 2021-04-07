package com.DSA;

import java.util.HashMap;
import java.util.Map;

public class CharFinder {
    public char firstNonRepeatCharacter(String input) {
        Map<Character, Integer> mapped = new HashMap<>();

        // can also be done by converting input to a charArray so we can iterate over it
//        for (char ch: input.toCharArray()) {
//            if (mapped.containsKey(ch)) {
//                var count = mapped.get(ch);
//                mapped.put(ch, count);
//            } else
//                mapped.put(ch, count + 1);
//        }

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int count;
//            count = mapped.getOrDefault(c, 0); // shorthand
            if (mapped.containsKey(c)) {
                count = mapped.get(c);
            } else {
                count = 0;
            }
            mapped.put(c, count + 1);
        }

        for (int i = 0; i < input.length(); i++) {
            if (mapped.get(input.charAt(i)) == 1)
                return input.charAt(i);
        }

        throw new Error("not in this string");
//        return Character.MIN_VALUE; // also works?
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
