package com.DSA;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Key: Employee Number (int)
        // Value: Employee's Name
        Map<Integer, String> map = new HashMap<>(); // Map is an interface, HashMap is an implementation

        map.put(1, "George");
        map.put(2, "Mary");
        map.put(3, "Bobe");
        System.out.println(map);
        map.put(3 ,"Kyle");
        System.out.println(map);
        map.put(3 ,"Kyle");
        map.put(null, null); // perfedctly fine, but no known use cases
        System.out.println(map);
        map.remove(null);
        System.out.println(map);
        var value = map.get(3);
        System.out.println(value);

        System.out.println(map.containsKey(1)); // O(1), simply looks up location in Hash Map and returns true or false
        System.out.println(map.containsValue("Bobe")); // O(n), Hash function has to iterate through all objects and compare value with argument
        System.out.println(map.containsValue("Kyle"));

        // all of the below lists are iterable
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        System.out.println(map.values());

        for (var item: map.entrySet())
            System.out.println(item.getKey()); // can get key, value, set value, etc.
    }
}
