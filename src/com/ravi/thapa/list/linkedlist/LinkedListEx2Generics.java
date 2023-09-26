package com.ravi.thapa.list.linkedlist;

import java.util.LinkedList;

public class LinkedListEx2Generics {
	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<>();
		names.add("Neel");
		names.add("Roky");
		names.add("John");
				
		System.out.println("LinkedList content: " + names);
		System.out.println("LinkedList size: " + names.size());
	}
}
