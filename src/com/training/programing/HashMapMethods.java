package com.training.programing;

import java.util.HashMap;
import java.util.Map;

public class HashMapMethods {
	public static void main(String [] args) {
		Map <Integer,String> map= new HashMap<>();
		map.put(1, "India");
		map.put(2, "England");
		map.put(3, "Australia");
		map.put(4, "America");
		
		System.out.println(map.containsKey("key contains:"+ 1));
		System.out.println(map.containsValue("Value Contains:"+ "Australia"));
		System.out.println("Return all the entries in a map:"+ map.entrySet());
		System.out.println("get the value of an entry in map:" +map.get(2));
		System.out.println("Output the value of an entry in a map,"+ map.getOrDefault(1, ""));
		System.out.println("Output the value of an entry in a map,"+ map.getOrDefault(5, ""));
		System.out.println("Return all the keys in a map"+ map.keySet());
		
		map.replace(2, "Paris");
		map.put(5, "Canada");
		map.replace(3, "Londan");
		System.out.println("Replacing Values"+map);
		System.out.println("Return all values in map"+map.values());
	}

}
