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

    public boolean isEmpty() {
        return finalStack.isEmpty();
    }

    public int peek() {
        return finalStack.peek();
    }

    @Override
    public String toString() {
        return finalStack.toString();
    }
}

// run this code in main function of Main class

//    StackQueue queue = new StackQueue();
//        queue.enqueue(1);
//                queue.enqueue(2);
//                queue.enqueue(3);
//                System.out.println(queue);
//                System.out.println(queue.dequeue());
//                System.out.println(queue);
//                queue.enqueue(4);
//                System.out.println(queue);
//                System.out.println(queue.dequeue());
//                System.out.println(queue);
//                System.out.println(queue.isEmpty());
//                System.out.println(queue.peek());
