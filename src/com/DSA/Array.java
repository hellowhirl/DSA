package com.DSA;

public class Array {
    private int length;
    private int currentCount = 0;
    private int[] myArray = new int[0]; // private field for our Array class

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
        for (int i = 0; i < currentCount; i++) {
            System.out.println(myArray[i]);
        }
    }

    public void removeAt(int index) {
        // shifting elements
        for(int i = index; i < myArray.length - 1; i++){
            myArray[i] = myArray[i + 1];
        }
        currentCount--;
//        int[] dest = new int[currentCount];
//        System.arraycopy(myArray, 0, dest, 0, currentCount);
//        myArray = dest;
    }

    public int indexOf(int item) {
        for(int i = 0; i < length; i++) {
            if (myArray[i] == item) {
                return i;
            }
        }
        return -1;
    }
}
