package com.training.programing;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class MisingInSecondArray {
	public static void missingsecond(int [] arr1,int[] arr2,int n,int m) {
		/*
		 * List <Integer> al=new ArrayList<>(); Map <Integer,Integer> map=new
		 * HashMap<>(); for(int i=0;i<arr1.length;i++) { if(map.get(arr1[i]) != null) {
		 * if(map.containsKey(arr1[i])) {
		 * 
		 * } } } System.out.println(al);
		 */
	for(int i=0;i<n;i++) {
		int j;
		for(j=0;j<m;j++) 
			if(arr1[i]==arr2[j])
				break;
			if(j==m)
				System.out.print(arr1[i]+" ");
	}
	} 
	public static void main(String[] args) {
		int [] arr1= {1,4,6,7,11,12};
		int [] arr2= {7,4,12};
		int n = arr1.length;
		int m = arr2.length;
		missingsecond(arr1, arr2, n, m);	
	}
	}