package com.ravi.thapa.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue<>();
		queue.offer(5);
		queue.offer(1);
		queue.offer(2);
        System.out.println("Queue: " + queue);
        int accessedNumber = queue.peek();
        
        System.out.println("Accessed Element: " + accessedNumber);
        int removedNumber = queue.poll();
        
        System.out.println("Removed Element: " + removedNumber);

        System.out.println("Updated Queue: " + queue);
        
        Iterator ite = queue.iterator();
        
        
        while(ite.hasNext()) {
        	System.out.println(ite.next());
        }
        
	}

}
