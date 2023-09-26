package com.ravi.thapa.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueEx {

	public static void main(String[] args) {
		 Queue<Integer> queue = new LinkedList<>();

	        // offer elements to the Queue
	        queue.offer(1);
	        queue.offer(2);
	        queue.offer(3);
	        
	        System.out.println("Queue: " + queue);

	        int accessedNumber = queue.peek();
	        
	        System.out.println("Accessed Element: " + accessedNumber);
	        System.out.println("Queue: " + queue);

	        int removedNumber = queue.poll();
	        System.out.println("Removed Element: " + removedNumber);

	        System.out.println("Updated Queue: " + queue);

	}

}
