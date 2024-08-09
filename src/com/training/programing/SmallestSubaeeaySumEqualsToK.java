package com.training.programing;
public class SmallestSubaeeaySumEqualsToK {
	public static int smallestSubarraySum(int [] arr,int k) {
		int result =Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			//System.out.println("for loop : " + i);
			int sum=0;
			for(int j=i;j<arr.length;j++) {
				//System.out.println("After nested for loop  :" + j );
				sum+=arr[j];
				//System.out.println("add to sum :"+ sum);
				result =Math.min(result, (j-i+1));
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int [] arr= {3,8,11,12,15};
		int k=11;
		int result =smallestSubarraySum(arr, k);
		System.out.println(result);
	}
}