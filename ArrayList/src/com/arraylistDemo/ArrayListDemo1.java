package com.arraylistDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(10);

		ArrayList al2 = new ArrayList();
		al2.add(50);
		al2.add(60);
		al2.add(70);

		ArrayList al3 = new ArrayList();
		al3.addAll(al);
		al3.addAll(al2);
		System.out.println(al3);
		// by using iterator

		System.out.println("By using Iterator");
		Iterator<Integer> itr = al3.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
