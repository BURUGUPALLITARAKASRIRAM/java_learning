package com.tarak.collections;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> personAddress=new HashMap<>();
		personAddress.put("Tarak", "Nizampet,Hyderabad,287320");
		personAddress.put("Vaishnav", "Miyapur,Hyderabad,8945");
		personAddress.put("Bhrgav", "KHB main road, Bnaglaore,560032");
		personAddress.put("seetharam", "KHB 4th cross,Bangalore,560045");
		
		for (String name:personAddress.keySet()) {
			System.out.println("Key ::"+ name +" Value::"+ personAddress.get(name));
		}
		

	}

}
