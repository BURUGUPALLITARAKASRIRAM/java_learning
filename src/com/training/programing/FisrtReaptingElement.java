package com.training.programing;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class FisrtReaptingElement {
	public static void reaptingElement() {
		int arr[]= {1,3,4,4,5,7};
		int repeated=-1;
		Map<Integer,Integer> map =new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				if(repeated ==-1 || repeated > map.get(arr[i])) {
					repeated=map.get(arr[i]);
				}
			}
			else {
				map.put(arr[i], i);
			}
		}
		System.out.println("first time:"+ repeated);
	}
	public static void main(String[] args) {
		reaptingElement();
		secondTime();
		int arr[] = {1,2,4,3,2,7};
		int repeated=-1;
		Map<Integer,Integer> map= new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				if(repeated == -1 || repeated >map.get(arr[i])) {
					repeated=map.get(arr[i]);
				}
			}else {
				map.put(arr[i], i);
			}
		}
		System.out.println(repeated + " st position is repeating" );
		
		int [] arr1= {1,4,3,4,5,6};
		int n = arr1.length;
		int index = firstRepeatedElement(arr1, n);
		if(index ==-1) {
			System.out.println("No Repeating Element :");
		}else {
			System.out.println(arr1[index]);
		}
	}
	public static void secondTime() {
		int arr[] = {1,4,3,4,5,6};
		int repeated =-1;
		Map <Integer,Integer> map= new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				if(repeated==-1 || repeated>map.get(arr[i])) {
					repeated =map.get(arr[i]) ;
					}
				}
			else {
				map.put(arr[i], i);
			}
		}
		System.out.println(repeated);
	}
///////////	////////////////////////////////////////////////////////////////
	public static int firstRepeatedElement(int arr1[] ,int n) {
		for(int i=0;i<arr1.length;i++) {
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[i]==arr1[j]) {
					return i;
				}
			}
		}
		return 1;
}
}
