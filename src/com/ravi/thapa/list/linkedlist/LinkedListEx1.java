package com.ravi.thapa.list.linkedlist;

import java.util.LinkedList;

public class LinkedListEx1 {

	public static void main(String[] args) {
		LinkedList names = new LinkedList();
		names.add("Neel");
		names.add("Roky");
		names.add("John");
	    names.add(258);
				
		System.out.println("LinkedList content: " + names);
		System.out.println("LinkedList size: " + names.size());
	}

}
