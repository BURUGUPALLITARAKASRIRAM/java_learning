package com.practice.recollection;
import java.util.HashSet;
public class hashSetRevision {
	public static void main(String[] args) {
		HashSet<String> cars = new HashSet<>() ;
		cars.add("Honda");
		cars.add("Hundia");
		cars.add("Ford");
		cars.add("Nissan");
		cars.add("Honda");
		//cars.remove("Ford");
		//System.out.println(cars);
		//System.out.println(cars);
		//System.out.println(cars.contains("Benz"));
		//System.out.println(cars.contains("Honda"));
		//cars.clear();
		//System.out.println("Cleared all:");
		//System.out.println(cars.size());
		for(String i : cars) {
			System.out.print(i+ " ");
		}
	
		HashSet<Integer> num =new HashSet<>();
		num.add(2);
		num.add(4);
		num.add(6);
		num.add(8);
		
		for(int i=0;i<=10;i++) {
			if(num.contains(i)) {
				System.out.println(i +": Number was found in a set ");
			}else {
				System.out.println(i +": Number was not found in a set");
			}
		}		
	}
}