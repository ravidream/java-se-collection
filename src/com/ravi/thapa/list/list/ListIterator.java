package com.ravi.thapa.list.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListIterator {

	public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>(20);
        List<Integer> list = Collections.synchronizedList(intList);
		
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(4);
		
		Iterator<Integer> intListIte = list.iterator();
		
		while(intListIte.hasNext()) {
			System.out.println(intListIte.next());
			list.remove(1);
		}
	}

}
