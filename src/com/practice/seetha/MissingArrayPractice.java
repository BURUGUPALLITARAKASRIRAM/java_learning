package com.practice.seetha;
import java.util.Arrays;
public class MissingArrayPractice {
	public static int missingArrayBySum(int arr[] ,int n) {
		int expSum=0;
		int oriSum=0;
		for(int i=1;i<=n;i++) {
			System.out.println(i);
			   expSum=expSum+i;
		}
	//expSum=(n*(n+1))/2;
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr " +  arr[i]);
			oriSum=oriSum+arr[i];
		}
		return expSum-oriSum;
	}
	public static void main(String[] args) {
		int arr[]= {1, 2, 4, 6, 3, 7, 8};
		int n=8;
		System.out.println("missing in array"+missingArrayBySum(arr,n));
	}
}
