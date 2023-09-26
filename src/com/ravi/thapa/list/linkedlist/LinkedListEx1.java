package com.ravi.thapa.list.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx1 {

	public static void main(String[] args) {
		List names = new LinkedList();
		names.add("Neel");
		names.add("Roky");
		names.add("John");
	    names.add(258);
				
		System.out.println("LinkedList content: " + names);
		System.out.println("LinkedList size: " + names.size());
	}

}
