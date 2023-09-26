package com.ravi.thapa.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx2Duplicate {
	public static void main(String args[]) {
		HashSet<String> set = new HashSet<String>();
		set.add("Dave");
		set.add("Jude");
		set.add("Ben");
		set.add("Dave");

		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
