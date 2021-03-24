package com.DSA;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println(queue);
        System.out.println(queue.size());
        reverse(queue);

        System.out.println(queue);
	}

	public static void reverse(Queue<Integer> queue) {
        if (queue.isEmpty()) throw new IllegalArgumentException();

        int[] arr = new int[queue.size()];

        for (int i = queue.size() - 1; i >= 0; i--) {
            arr[i] = queue.remove();
        }

        for (int i : arr) {
            queue.add(i);
        }

        System.out.println("testing: " + Arrays.toString(arr));
    }

}
