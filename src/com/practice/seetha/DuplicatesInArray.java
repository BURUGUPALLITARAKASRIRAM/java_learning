package com.practice.seetha;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class DuplicatesInArray {
	public static List<Integer> duplicateArray(int arr[]) {
		List<Integer> al =new ArrayList<>();
		List <Integer> duplicateList =new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if(al.contains(arr[i])) {
				duplicateList.add(arr[i]);
			}else {
				al.add(arr[i]);
			}
		}
		return duplicateList;	
	}
	public static Map<Integer,Integer> duplicateSecond(int arr[]){
		Map<Integer,Integer> hs=new HashMap<Integer, Integer>();
		Map<Integer,Integer> duplicatehs=new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
			if(hs.containsKey(arr[i])) {
				duplicatehs.put(arr[i], i);
			}else {
				hs.put(arr[i], i);
			}
		}
		return duplicatehs;
	}
	///////////////////////////////////////////////
	public static  ArrayList<Integer> arrayDuplicates(int [] arr1){
		List <Integer> al =new ArrayList<Integer>();
		for(int i=0;i<arr1.length;i++) {
			if(!al.contains(arr1[i])) {
				al.add(arr1[i]);
			}
		}
		System.out.println( " easy method" +  al.toString());
		return (ArrayList<Integer>) al;
	}
	public static void main(String [] args) {
		int arr[]= {2,3,1,2,3};
		System.out.println(duplicateSecond(arr).keySet());
		int arr1[] = {2,3,1,2,3};
		arrayDuplicates(arr1);
	}
}