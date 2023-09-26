package com.ravi.thapa.list.list;

import java.util.ArrayList;

public class ArrayListExDeepCopy {

	public static void main(String[] args) {
		ArrayList<Employee2> empList = new ArrayList<>();
		Employee2 emp = new Employee2(1, "ravi", "123 Test Avenue");
		Employee2 emp2 = new Employee2(2, "Amar", "125 Test Avenue");
		Employee2 emp3 = new Employee2(3, "Raju", "127 Test Avenue");
		Employee2 emp4 = new Employee2(4, "Neel", "122 Test Avenue");

		empList.add(emp2);
		empList.add(emp);		
		empList.add(emp3);
		empList.add(emp4);
		
		
		
		ArrayList<Employee2> empListCloned2 =  (ArrayList<Employee2>) empList.clone(); 
		
		
		empList.set(2, new Employee2(2, "Jacob", "125 Test Avenue"));
		
		for(Employee2 e : empList) {
			System.out.println(e.getName());
		}
		System.out.println("*******************************");
		
		for(Employee2 e : empListCloned2) {
			System.out.println(e.getName());
		}
	}

}


class Employee2 implements Cloneable {	
	private int id;
	private String name;
	private String add;	
	
	
	public Employee2(int id, String name, String add) {
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
    protected Object clone() throws CloneNotSupportedException {
        Employee2 employee = null;
        try  {
        	employee = (Employee2) super.clone();                    }
        catch (CloneNotSupportedException e)  {
            throw new RuntimeException(e);
        }
        return employee;
    }
	
}

