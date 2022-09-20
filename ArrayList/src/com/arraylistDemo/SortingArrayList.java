package com.arraylistDemo;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Susmita");
		al.add("Abhay");
		al.add("Punit");
		al.add("Aish");
		al.add("Suyash");
		al.add("Pauni");
		al.add("Moksh");
		 System.out.println(" Before Sorted Data : "+al);
		 Collections.sort(al);
		 System.out.println("Sorted Data : "+al);
	}

}
