package com.ravi.thapa.list.vector;

import java.util.Vector;

public class VectorEx1 {


	public static void main(String[] args) {
		Vector<Integer> intVector = new Vector<Integer>(20, 40);
		
		Vector<Integer> intVector2 = new Vector<Integer>();
		//System.out.println(intVector.capacity());
		intVector.add(10);
		intVector.add(20);	
		
		intVector.clear();
		
		for(Integer intVal: intVector) {
			System.out.println(intVal);
		}
		intVector2.addAll(intVector);
	}

}
