package com.ravi.thapa.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {
	public static void main(String...strings) {
		Set<String> data = new LinkedHashSet<String>();   
	    
        data.add("John");   
        data.add("Mills");   
        data.add("Dave");   
        data.add("Ben");   
    
        System.out.println(data);  
	}
}
