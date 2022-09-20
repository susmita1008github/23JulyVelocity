package com.arraylistDemo;

import java.util.ArrayList;

public class ArrayListMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(2,45);
		System.out.println("The size of List is : "+al.size());
		System.out.println("List : "+al);
		System.out.println(al.contains(70));
	}

}
