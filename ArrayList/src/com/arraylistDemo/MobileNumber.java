package com.arraylistDemo;

import java.util.ArrayList;
import java.util.*;


public class MobileNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 Mobile numbers : ");
		for(int i=0;i<=5;i++) {
			al.add(sc.nextInt());
			
		}
System.out.println(al);

	Iterator<Integer> ltr=al.iterator();
	while(ltr.hasNext())
	{
		System.out.println(ltr.next());
	}
	}

}
