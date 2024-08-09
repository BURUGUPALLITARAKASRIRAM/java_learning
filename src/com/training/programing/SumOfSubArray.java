package com.training.programing;
public class SumOfSubArray {
	 public static int maxSubarraySum(int[] nums) {
	        int maxEndingHere = nums[0];
	        int maxSoFar = nums[0]; 
	  	        for (int i = 1; i < nums.length; i++) {
	            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
	            maxSoFar = Math.max(maxSoFar, maxEndingHere);
	        }  
	        return maxSoFar;
	    }
	 public static int sumOfSubarray(int [] arr) {
		 int  n =arr.length;
		 int totalSum =0;
		 for(int i=0;i<n;i++) {
			 System.out.println(i);
			 totalSum=totalSum+arr[i]+(i+1)*(n-1);
		 }
		 return totalSum;
	 }
	    public static void main(String[] args) {
	        int[] nums = {4,3,1,5,6};
	        int maxSum = maxSubarraySum(nums);
	        System.out.println("Maximum sum of contiguous subarray: " + maxSum);
	        
	        int [] arr = {4,3,1,5,6};
	        System.out.println(sumOfSubarray(arr));
	    }
}
