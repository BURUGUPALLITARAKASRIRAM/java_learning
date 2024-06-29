package com.practice.recollection;

import java.util.Arrays;

public class KthSmallest {
	public static int kthSmallestElement(int[] arr,int k) {
		Arrays.sort(arr);
		return arr[k -1];
		
	}
	public static void main(String[] args) {
		int[] arr = {3,1,4,2,5};
		int k=2;
		
		int kthSmallestElement= kthSmallestElement(arr, k);
		System.out.println("The "+ k +"th smallest element is: " + kthSmallestElement);
		
	}
	

}
