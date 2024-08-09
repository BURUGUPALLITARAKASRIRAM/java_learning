package com.training.programing;
public class SmallestSubArrayWithSumGreaterThenX {
	public static void smallest(int arr[],int x) {
		int small= Integer.MAX_VALUE;
		int count =0;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			if(sum>x) {
				if(count<small) {
					small=count;
				}
				count=0;
				sum=0;
			}else {
				count++;
			}
		}
		System.out.println("Smallest subarray sum is greater then x >"  + small);
	}
				public static void main(String[] args) {
				int arr[]= {1, 4, 45, 6, 0, 19};
				int  x=51;
				smallest(arr, x);
			}
	}