package com.DSA;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    Array numbers = new Array(3);
	    numbers.insert(10);
	    numbers.insert(20);
	    numbers.insert(30);
	    numbers.print();
	    numbers.removeAt(1);
	    numbers.insert(70);
	    numbers.print();
	    numbers.indexOf(71);

//        System.out.println(numbers.length);
//        System.out.println(Arrays.toString(numbers)); // we use Arrays class to use toString method
    }
}
