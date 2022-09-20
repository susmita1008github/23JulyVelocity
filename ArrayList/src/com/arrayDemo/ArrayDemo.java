package com.arrayDemo;

import java.util.ArrayList;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList<>();
		
		al.add(5);
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(25);
		al.add(5);
		al.add("pune");
		al.add(null);
		al.add(true);
		al.add(1,25);
		al.remove(2);
		
		System.out.println(al);

	}

}
