package com.training.programing;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class DuplicatesInArray {
	public static void main(String[] args) {  
			int [] arr= {2,3,1,2,3};
			Map<Integer,Integer> map =new HashMap<>();
			for(int i=0;i<arr.length;i++) {
				System.out.println("After iteration :" + i);
				if(map.containsKey(arr[i])) {
					System.out.println("After condition check : " + arr[i]);
					int result =map.get(arr[i]);
					System.out.println(result);
					result++;
					System.out.println(   map.put(arr[i], result));	
				 }else {
				 System.out.println(    map.put(arr[i], 1));
				}
			}
			ArrayList<Integer> al =new ArrayList<Integer>();
			for(int k : map.keySet()) {
				if(map.get(k)>1) 
					al.add(k);
				}
			System.out.println(al);
			}
}  