package com.ravi.thapa.list.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class LInkedListEx3LinkedListToArray {

	public static void main(String[] args) {		
		LinkedList<Integer> numbersList = new LinkedList<>();
		numbersList.add(1);
		numbersList.add(2);
		numbersList.add(3);
		numbersList.add(4);
		numbersList.add(5);
		Integer[] numbers = new Integer[numbersList.size()];
		
		numbers = numbersList.toArray(numbers);
		System.out.println(Arrays.toString(numbers));

	}

}
