package com.DSA;

import java.util.Stack;

public class StackQueue {
    Stack<Integer> finalStack = new Stack<>();
    Stack<Integer> tempStack = new Stack<>();

    public void enqueue(int item) {
        if (finalStack.isEmpty()) {
            finalStack.push(item);
            return;
        }

        while (!finalStack.isEmpty()) {
            tempStack.push(finalStack.pop());
        }
        finalStack.push(item);
        while (!tempStack.isEmpty()) {
            finalStack.push(tempStack.pop());
        }
    }

    public int dequeue() {
        if (finalStack.isEmpty()) throw new IllegalStateException();

        var top = finalStack.pop();
        while (!finalStack.isEmpty()) {
            tempStack.push(finalStack.pop());
        }
        while (!tempStack.isEmpty()) {
            finalStack.push(tempStack.pop());
        }
        return top;
    }

    @Override
    public String toString() {
        return finalStack.toString();
    }
}
