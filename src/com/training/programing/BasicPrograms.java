package com.training.programing;
public class BasicPrograms {
	public static int findMissingElements(int arr[]) {
		int n =arr.length+1;
		int total=0;
		for(int i=1;i<=n;i++) {
			total^=i;
		}
		for(int i=0;i<arr.length;i++) {
			total^=arr[i];
		}
		return total;
	}
	public static void main(String [] args) {
		int arr[] = {1,2,4,5};
		int missing =findMissingElements(arr);
		System.out.println("The Missing Number In The Array :"+ missing);
	}
}
