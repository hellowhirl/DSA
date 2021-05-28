package com.DSA;

public class Main {

    public static void main(String[] args) {
        // create HashTable class with below methods:
        // put(k, v)
        // get(k): v
        // remove(k)
        //
        // keys: int
        // values: string
        //
        // Collisions: use chaining strategy (instead of storing in array cells, we want to store them in linked lists)
        // create private class called Entry

        CharFinder finder = new CharFinder();

        var first = finder.firstNonRepeatCharacter("a green apple");
        System.out.println(first);

        var ch = finder.firstRepeatedCharacter("a green apple");
        System.out.println(ch);
    }
}
