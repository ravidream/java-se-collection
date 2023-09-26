package com.ravi.thapa.list.arraydeque;

import java.util.ArrayDeque;

public class ArrayDequeEx {

	public static void main(String[] args) {
		ArrayDeque<String> deque = new ArrayDeque<String>();  
		   deque.add("John");    
		   deque.add("Mills");     
		   deque.add("Jeane");
		   System.out.println(deque.pollFirst());
		   System.out.println(deque.peek());
		   //System.out.println(deque.pop());		  
		   //System.out.println(deque.poll());
		  
		   //System.out.println(deque.pollLast());
		  /* for (String str : deque) {  
			   System.out.println(str);  
		   }  */
	}

}
