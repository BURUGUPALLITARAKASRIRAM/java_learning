package com.practice.seetha;
import java.util.Arrays;
public class LeftRotationOfArray {
	public static void leftRotate(int arr[]) {
		int d=3;
		int k=0;
		int [] newArr = new int [5];
		for(int i=d;i<arr.length;i++) {
			newArr[k++]=arr[i];
		}
		for(int i=0;i<d;i++) {
			newArr[k++]=arr[i];
		}
		System.out.println(Arrays.toString(newArr));
	}
	public static void main (String [] args) {
		int arr[] = {1,2,3,4,5};
		leftRotate(arr);
	}
}