package com.practice.recollection;

import java.util.ArrayList;

public  class IndexSubArray 

{

	static ArrayList<Integer> subarraySum(int[] arr,int n,int s)
	{
		ArrayList<Integer> outputlist = new ArrayList<>();
		int i=0;
		int sum=0;
		for(int j=0;j<n;j++) {
			sum= sum =arr[j];
			
			while(sum >s) {
				sum=sum-arr[i];
				i++;
			}
			if(sum ==s && i<=j) {
				outputlist.add(i+1);
				outputlist.add(j+1);
				return outputlist;
			}
		}
		return outputlist;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,7,5};
		int sum =7;
		int[] result =subarraySum(arr,sum);
		for(int val : result) {
			System.out.print(val + " ");
			
		}
	}
	private static int[] subarraySum(int[] arr, int sum) {
		// TODO Auto-generated method stub
		return null;
	}

}
