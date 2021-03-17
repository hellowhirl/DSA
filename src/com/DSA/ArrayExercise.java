package com.DSA;

public class ArrayExercise {

    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.print();
        numbers.removeAt(1);
        numbers.insert(70);
        numbers.print();
        System.out.println(numbers.indexOf(10));
        System.out.println(numbers.indexOf(100));
    }
}
