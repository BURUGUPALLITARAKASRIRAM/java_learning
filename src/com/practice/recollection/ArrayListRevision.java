package com.practice.recollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListRevision {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		 list.add( 10);
		 list.add( 20);
		 list.add( 40);
		 list.add( 30);
		 list.add( 50);
		 list.add( 60);
		 list.add( 70);
		// list.remove(0);
		// list.remove(2);
		// list.remove(4);
		//Collections.sort(list); 
		  System.out.println("Arraylist:"+ list);
		 int list1 = list.get(3);
		 System.out.println("GetList:"+list1);
		 int size =list.size();
		 System.out.println(size);
		 
		 ArrayList<Integer> result = new ArrayList<>();
		 //for(int i=0;i<list.size();i++) {
		 for(int i : list) {
			 result.add(i*2);
		//int	  multiply =list.get(i)*2;
			// int divided =list.get(i)/2;
			 //System.out.print(multiply+" ");
	//
			  }
		System.out.println(result);	
}
}