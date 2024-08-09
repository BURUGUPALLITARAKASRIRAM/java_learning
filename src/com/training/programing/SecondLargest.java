package com.training.programing;
public class SecondLargest {
	public static void secondLargest() {
		int arr []= {10,5,8,9,6};
		int fMax= Integer.MIN_VALUE;
		int sMax= Integer.MIN_VALUE;
		int tMax= Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(fMax<arr[i]) {
				tMax=sMax;
				sMax=fMax;
				fMax=arr[i];
			}else if(sMax<arr[i]) {
				sMax=arr[i];
			}else if(tMax<arr[i]) {
				tMax =arr[i];
			}
		}
		System.out.println("Second Largest >" + tMax);	
	}
	public static void main(String[] args) {
		secondLargest();
	}
}