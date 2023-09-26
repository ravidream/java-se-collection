package com.ravi.thapa.list.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListEx5 {

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<>();
		Employee emp = new Employee(1, "ravi", "123 Test Avenue");
		Employee emp2 = new Employee(2, "Amar", "125 Test Avenue");
		Employee emp3 = new Employee(3, "Raju", "127 Test Avenue");
		Employee emp4 = new Employee(4, "Neel", "122 Test Avenue");
		//emp.setId(1);
		//emp.setName("Ravi");
		//emp.setAdd("123 Test Avenue");
		empList.add(emp2);
		empList.add(emp);		
		empList.add(emp3);
		empList.add(emp4);
		
		Collections.sort(empList);
		
		/*for(Employee e : empList) {
			System.out.println(e.getId() + "  " + e.getName() + "  " +  e.getAdd());
		}*/
		
		for(int i = 0; i < empList.size(); i++) {
			System.out.println(empList.get(i).getId() + "  " + empList.get(i).getName() + "  " +  empList.get(i).getAdd());
		}
	}

}

class EmployeeSortByName implements Comparator<Employee>{	
	public int compare(Employee empOne, Employee empTwo) {
		return empOne.getName().compareTo(empTwo.getName());
	}

}


class Employee implements Comparable<Employee>{	
	private int id;
	private String name;
	private String add;
	
	
	
	public Employee(int id, String name, String add) {
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
	
	@Override
	public int compareTo(Employee o) {		
		return this.getId() - o.getId();
	}	
	
	
	
}
