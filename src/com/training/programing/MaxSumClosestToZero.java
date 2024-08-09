package com.training.programing;

public class MaxSumClosestToZero {
	public static void maain(String [] args) {
		int arr[] = {-8,-66,-60};
		int closest = Integer.MAX_VALUE;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int sum =arr[i]+arr[j];
				if(Math.abs(sum)<Math.abs(closest)) {
					closest=sum;
				}
			}
		}
	System.out.println(closest);
	}

}
