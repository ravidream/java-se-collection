package com.ravi.thapa.set;

import java.util.TreeSet;

public class TreeSetEx3 {
	 public static void main(String args[]){    
		 TreeSet<Integer> set=new TreeSet<Integer>();    
		         set.add(24);    
		         set.add(66);    
		         set.add(12);    
		         set.add(15);    
		         System.out.println("Lowest Value: "+set.pollFirst());    
		         System.out.println("Highest Value: "+set.pollLast());    
		 } 
}
