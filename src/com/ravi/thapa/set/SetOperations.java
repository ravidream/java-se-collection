package com.ravi.thapa.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetOperations {
	public static void main(String args[]){    
        Integer[] A = {1,2,3};  
        Integer[] B = {3,4,5};  
        Set<Integer> set1 = new HashSet<Integer>();    
        set1.addAll(Arrays.asList(A));    
        Set<Integer> set2 = new HashSet<Integer>();    
        set2.addAll(Arrays.asList(B));    
    
        // Union  
        Set<Integer> uniondata = new HashSet<Integer>(set1);    
        uniondata.addAll(set2);    
        System.out.print("Union of set1 and set2 is:");    
        System.out.println(uniondata);    
    
        // Finding Intersection of set1 and set2    
        Set<Integer> intersectionData = new HashSet<Integer>(set1);    
        intersectionData.retainAll(set2);    
        System.out.print("Intersection of set1 and set2 is:");    
        System.out.println(intersectionData);    
    
        // Finding Difference of set1 and set2    
        Set<Integer> differenceData = new HashSet<Integer>(set1);    
        differenceData.removeAll(set2);    
        System.out.print("Difference of set1 and set2 is:");    
        System.out.println(differenceData);    
    }    
}
