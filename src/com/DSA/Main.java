package com.DSA;

public class Main {

    public static void main(String[] args) {
        CharFinder finder = new CharFinder();
        var ch = finder.firstRepeatedCharacter("a green apple");
        System.out.println(ch);
    }
}
