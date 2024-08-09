package com.training.programing;

import java.util.HashSet;
import java.util.Set;

public class IntersectionArray {
	public static void main(String[] args) {
		int n = 6, m = 5;
				int a[] = {1, 2, 3, 4, 5, 6};
				int b[] = {3, 4, 5, 6, 7}; 

		int counter=0 ;
		for(int i=0;i<n;i++) {
			int j=0;
			while(j<m && a[i]==b[j++]) {
				counter++;
			}
		}
		System.out.println("intersection of two arrays:"+counter);
		intersectionArray();
	}
	
	public static void intersectionArray() {
		int n=6,m=5;
		int a[] = {1, 2, 3, 4, 5, 6};
		int b[] = {3, 4, 5, 6, 7}; 
		
		Set<Integer> set1=new HashSet<>();
		Set<Integer> set2=new HashSet<>();
		
		for(int i=0;i<n;i++) {
			set1.add(a[i]);
		}
		for(int j=0;j<m;j++) {
			set2.add(b[j]);
		}
		set1.retainAll(set2);
		int result = set1.size();
		System.out.println("Intersection Of Two Arrays :"+ result );
 	}
	
	}