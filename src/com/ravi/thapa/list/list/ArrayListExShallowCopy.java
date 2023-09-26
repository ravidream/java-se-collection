package com.ravi.thapa.list.list;

import java.util.ArrayList;

public class ArrayListExShallowCopy {

	public static void main(String[] args) {
		ArrayList<EmployeeOne> empList = new ArrayList<>();
		EmployeeOne emp = new EmployeeOne(1, "ravi", "123 Test Avenue");
		EmployeeOne emp2 = new EmployeeOne(2, "Amar", "125 Test Avenue");
		EmployeeOne emp3 = new EmployeeOne(3, "Raju", "127 Test Avenue");
		EmployeeOne emp4 = new EmployeeOne(4, "Neel", "122 Test Avenue");

		empList.add(emp2);
		empList.add(emp);		
		empList.add(emp3);
		empList.add(emp4);
		
		/*
		ArrayList<EmployeeOne> empList2 =  empList; 
		
		empList.set(2, new EmployeeOne(2, "Jacob", "125 Test Avenue"));
		
		for(EmployeeOne e : empList) {
			System.out.println(e.getName());
		}
		System.out.println("*******************************");
		
		for(EmployeeOne e : empList2) {
			System.out.println(e.getName());
		}
		*/
		
		ArrayList<EmployeeOne> empListCloned2 =  (ArrayList<EmployeeOne>) empList.clone(); 
		
		empList.set(2, new EmployeeOne(2, "Jacob", "125 Test Avenue"));
		
		for(EmployeeOne e : empList) {
			System.out.println(e.getName());
		}
		System.out.println("*******************************");
		
		if(empList.get(2) == empListCloned2.get(2)) {
			System.out.println("test");
		}
		
		
		for(EmployeeOne e : empListCloned2) {
			System.out.println(e.getName());
		}

	}

}


class EmployeeOne {	
	private int id;
	private String name;
	private String add;
	
	
	
	public EmployeeOne(int id, String name, String add) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	
	
}
