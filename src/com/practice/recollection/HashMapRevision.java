package com.practice.recollection;

import java.util.HashMap;

public class HashMapRevision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm =new HashMap<>();
		
		hm.put(0, "India");
		hm.put(1, "Dubai");
		hm.put(2, "America");
		hm.put(3, "England");
		hm.put(4, "Netherland");
		
		System.out.println("After assing :"+ hm);
		
		hm.put(0, "welcome Inida");
		System.out.println(hm);
		
		hm.put(3, "Goodbye England");
		System.out.println(hm);
		
		
		System.out.println("Using Get to indetify :"+hm.get(0));
		
		System.out.println("Removing :"+hm.remove(3));
		
		hm.clear();
		System.out.println("To Remove All:"+hm);
		
		for(Integer i : hm.keySet()) {
			System.out.println("KEySet :"+ i);
		}
	}
}
