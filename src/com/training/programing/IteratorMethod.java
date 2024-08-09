package com.training.programing;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al=new ArrayList<>();
		al.add("mobiles");
		al.add("are");
		al.add("Use");
		al.add("to");
		al.add("make");
		al.add("calls");
		
		System.out.println("The List is:"+ al);
		
		Iterator<String> iter = al.iterator();
		 System.out.println("The iterator values of the list are : ");
		 while(iter.hasNext()) {
			 System.out.print(iter.next()+" ");
		 }
		

	}

}
