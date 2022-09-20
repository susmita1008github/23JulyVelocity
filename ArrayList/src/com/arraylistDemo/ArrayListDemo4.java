package com.arraylistDemo;

import java.util.ArrayList;

public class ArrayListDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add("Abhay");
		for(Object o : al)
		{
			System.out.println("Data : "+o);
		}
	}

}
