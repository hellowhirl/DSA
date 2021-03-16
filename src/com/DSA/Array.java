package com.DSA;

import java.util.Arrays;

public class Array {
    private int length;
    private int currentCount = 0;
    public int[] myArray = new int[0];

    public Array(int length) {
        this.length = length;
    }

    public void insert(int item) {
        currentCount++;
        int[] dest = new int[currentCount];
        System.arraycopy(myArray, 0, dest, 0, myArray.length);
        int indexToAssign = currentCount - 1;
        dest[indexToAssign] = item;
        myArray = dest;
    }

    public void print() {
        for (int i = 0; i < length; i++) {
            System.out.println(myArray[i]);
        }
    }

    public void removeAt(int index) {
        // shifting elements
        for(int i = index; i < myArray.length - 1; i++){
            myArray[i] = myArray[i + 1];
        }
        currentCount--;
        int[] dest = new int[currentCount];
        System.arraycopy(myArray, 0, dest, 0, currentCount);
        myArray = dest;
    }

    public void indexOf(int index) {
        boolean notFound = true;
        for(int i = 0; i < length; i++) {
            if(myArray[i] == index) {
                System.out.println(i);
                notFound = false;
            }
        }
        if(notFound) {
            System.out.println(-1);
        }
    }
}
