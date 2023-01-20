package com.tarak.collections;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList1 =new ArrayList<>();
		
		intList1.add(1);
		intList1.add(2);
		intList1.add(3);
		intList1.add(4);
		 System.out.println(intList1);
		 
		 List<Integer> intList2 =new ArrayList<>();
		 
		 intList2.add(5);
		 intList2.add(6);
		 intList2.add(7);
		 intList2.add(8);
		  System.out.println(intList2);
		 
		  intList1.addAll( intList2);
		  System.out.println(intList1);
		 
		

	}

}
