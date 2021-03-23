package com.DSA;

import java.util.Arrays;

public class Stack {
    private int[] list = new int[5];
    private int counter = 0;

    public void push(int input) {
//        int[] newList = new int[counter + 1];
        if (counter == list.length) throw new StackOverflowError(); // indicates that our stack is full
        list[counter++] = input;
    }

    public int pop() {
        if (counter == 0) throw new IllegalStateException();

        return list[counter--]; // we should also return the item that was popped off
    }

    public int peek() {
        if (counter == 9) throw new IllegalStateException(); // cannot perfom this operation for current state of object

        return list[counter - 1];

    }

    public boolean isEmpty() {
        return counter == 0;
    }

    // changing the implementation of a method that we inherit from a base class (the Object class in this case)
    @Override // tells Java compiler to override toString method from Object
    public String toString() {
        // copy content of the stack into a separate custom array and then convert that array into a string
        var content =  Arrays.copyOfRange(list, 0, counter); // removes 0's in case there are any
        return Arrays.toString(content); // content array is then converted into a string
    }

}
