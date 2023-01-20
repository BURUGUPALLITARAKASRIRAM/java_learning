package com.tarak.collections;

import java.util.ArrayList;
import java.util.List;

public class FindMiddleElement {

	private static List<Integer> list;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList=new ArrayList<>();
		
		intList.add(8);
		intList.add(7);
		intList.add(5);
		intList.add(4);
		intList.add(7);
		
		
		System.out.println(list);
		System.out.println("Middle element:"+ intList.get((intList.size()/2)));
 
	}

}
