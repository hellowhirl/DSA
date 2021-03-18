package com.DSA;

public class Main {
    public static void main(String[] args) throws Exception {
    	LinkedList list = new LinkedList();
    	list.addLast(10);
    	list.addLast(20);
    	list.addLast(30);
		System.out.println(list.indexOf(50));
		System.out.println(list.length());
		System.out.println(list.contains(30));
//    	list.addFirst(1);
//    	list.deleteFirst();
	}
}
