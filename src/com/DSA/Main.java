package com.DSA;

public class Main {

    public static void main(String[] args) {
        CharFinder finder = new CharFinder();

        var first = finder.firstNonRepeatCharacter("a green apple");
        System.out.println(first);

        var ch = finder.firstRepeatedCharacter("a green apple");
        System.out.println(ch);
    }
}
