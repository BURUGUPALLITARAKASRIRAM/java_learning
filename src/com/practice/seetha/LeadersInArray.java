package com.practice.seetha;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInArray {
	public static List<Integer> findLeadersInArray(int [] arr){
		List<Integer> leaders =new ArrayList<Integer>();
	int n=arr.length;
	int max=Integer.MIN_VALUE;
	for(int i=n-1;i>=0;i--) {
		if(arr[i]>max) {
			leaders.add(arr[i]);
			max
			=arr[i];
		}
	}
		Collections.reverse(leaders);
		return leaders;
	}
	public static void main(String[] args) {
		int [] arr= {16,17,4,3,5,2};
		List<Integer> leaders =findLeadersInArray(arr);
		for(int leader : leaders) {
			System.out.print(leader+"  ");
		}
	}
}
