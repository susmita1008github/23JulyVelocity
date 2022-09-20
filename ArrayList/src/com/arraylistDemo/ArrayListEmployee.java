package com.arraylistDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> al= new ArrayList<Employee>();
		
		al.add(new Employee(101,"Susmita",85000));
		al.add(new Employee(108,"Abhay",150000));
		
		Iterator<Employee> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	
	}

}
