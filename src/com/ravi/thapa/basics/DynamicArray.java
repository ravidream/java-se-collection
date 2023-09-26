package com.ravi.thapa.basics;

import java.lang.reflect.Array;

public class DynamicArray {
	public static void main(String... strings) {
		Integer[] intArr = {1,2,3};		
		Integer[] newArr = (Integer[]) resizeArray(intArr, 10);
		System.out.println(newArr);

	}

	private static Object resizeArray(Object oldArray, int newSize) {
		int oldSize = Array.getLength(oldArray);
		Class elementType = oldArray.getClass().getComponentType();
		Object newArray = Array.newInstance(elementType, newSize);
		int preserveLength = Math.min(oldSize, newSize);
		if (preserveLength > 0)
			System.arraycopy(oldArray, 0, newArray, 0, preserveLength);
		return newArray;
	}
}
