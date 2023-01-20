package com.tarak.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map1 =new  HashMap<>();
		try (Scanner scanner = new Scanner(System.in)) {
			for (int i=0;i<3 ;i++) {
			System.out.println("Enter The Key ");
			int key=scanner.nextInt();
			System.out.println("Enter The Value ");
			String value= scanner.next();
			map1.put(key, value);
			}
		}
		System.out.println("Print the map::"+map1.get(123));
		
		
		

	}

}
