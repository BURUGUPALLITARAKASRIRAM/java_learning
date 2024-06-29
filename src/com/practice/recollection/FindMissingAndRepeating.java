package com.practice.recollection;

public class FindMissingAndRepeating {
	public static int[] findMissingAndReapting(int[] nums,int n) {
		int[] result =new int[2];
		
		int actualSum=0;
		int expectedsum=n*(n+1)/2;
		int repeatedNum=0;
		
		for(int num: nums ) {
			actualSum+=num;
		}
		repeatedNum= actualSum - expectedsum;
		int[] count =new int[n+1];
		for(int num : nums) {
			count[num]++;
		}
		for(int i=1;i<=n;i++) {
			if(count[i]==0) {
				result[1]=i;
				break;
			}
		}
		result[0]=repeatedNum;
		return result;
		
	}
	public static void main(String[] args) {
		int[] nums= {2,2};
		int n=nums.length;
		int[] result= findMissingAndReapting(nums, n);
		
		System.out.println("Repeated number:"+ result[0]);
		System.out.println("missing number:"+ result[1]);
	}

}
