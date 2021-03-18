package com.DSA;

public class Main {
    public static void main(String[] args) throws Exception {
    	LinkedList list = new LinkedList();
		System.out.println("initial list size: " + list.size());
    	list.addLast(10);
    	list.addLast(20);
    	list.addLast(30);
    	list.addFirst(1);
		System.out.println(list.indexOf(20));
		System.out.println(list.indexOf(100));
		System.out.println(list.size());
		System.out.println(list.contains(30));
		list.removeLast();
		list.removeFirst();
		System.out.println("list size: " + list.size());
	}
}
