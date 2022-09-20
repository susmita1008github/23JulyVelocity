package com.arraylistDemo;

import java.util.ArrayList;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("10");
		al.add("Pune");
		al.add("Mumbai");
		al.add("Delhi");
	
		
		for(String str:al)
		{
			System.out.println("Data "+str);
		}
	}

}
