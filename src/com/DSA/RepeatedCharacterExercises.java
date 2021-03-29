package com.DSA;

import java.util.HashMap;
import java.util.Map;

public class RepeatedCharacterExercises {
    public static void main(String[] args) {
//        System.out.println(firstRepeatedCharacter());
        System.out.println(firstNonRepeat());
    }

    public static char firstNonRepeat() {
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

    public static char firstRepeatedCharacter() {
        String testLetters = "a green apple";
        Map<Integer, Character> mapped = new HashMap<>();

        int i;
        char repeatedCharacter = 0;
        for (i = 0; i < testLetters.length(); i++) {
            if(mapped.containsValue(testLetters.charAt(i))) {
                repeatedCharacter = testLetters.charAt(i);
                break;
            }
            char c = testLetters.charAt(i);
            mapped.put(i, c);
        }

        System.out.println(mapped);
        return repeatedCharacter;
    }

}
