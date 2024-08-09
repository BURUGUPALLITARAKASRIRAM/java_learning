package com.training.programing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leaders {
	public static List<Integer> findLeaders(int[] arr){
		List<Integer> al = new ArrayList<Integer>();
		int n =arr.length;
		for(int i=0;i<n;i++) {
			int j;
			for(j=0;j<n;j++) {
				if(arr[i]<arr[j])
					break;
			}
			if(j==n) {
				al.add(arr[i]);
			}
		}
		return al;
	}

	public static void main(String[] args) {
	int arr[] = {16,17,4,3,5,2};
	List<Integer> leaders =findLeaders(arr);
	System.out.println("leaders in the Array :");
	for(int i=0;i<leaders.size();i++) {
		System.out.print(leaders.get(i));
	}
	System.out.println();
	}
}
