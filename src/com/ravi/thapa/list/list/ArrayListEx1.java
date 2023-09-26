package com.ravi.thapa.list.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<>(20);
		
		intList.add(2);
		intList.add(1);
		intList.add(3);
		intList.add(4);
		Collections.sort(intList);

		for(Integer intVal : intList) {
			System.out.println("Value : " + intVal);			
		}

	}

}
