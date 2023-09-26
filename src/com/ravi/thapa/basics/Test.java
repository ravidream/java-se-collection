package com.ravi.thapa.basics;

public class Test {

	public static void main(String[] args) {
		Test test = new Test();
		test.iterateEx(Integer.parseInt(args[0]));
	}
	
	
	public void iterateEx(int count) {
		for(int i = 0; i < count; i++) {
			System.out.println("print i : " + i);
		}
	}
}
