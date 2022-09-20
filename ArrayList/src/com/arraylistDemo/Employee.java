package com.arraylistDemo;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	int id;
	String name;
	int salary;

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	/*
	 * public List<Employee> getEmployee() { List<Employee> li=new
	 * ArrayList<Employee>(); li.add(new Employee("ajay", "deshmukh")); li.add(new
	 * Employee("Ram", "Pawar")); return li;
	 * 
	 * }
	 */
	
}
