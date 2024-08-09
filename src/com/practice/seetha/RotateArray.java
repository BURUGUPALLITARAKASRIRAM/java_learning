package com.practice.seetha;
import java.util.Arrays;
public class RotateArray {
	public static int[] rotateArray(int arr[],int n) {
		int k=0;
		int d=2;
		int arr1[] =new int [5];
		for(int i=d;i<n;i++)
		{
			arr1[k++]=arr[i];
		}
		for(int i=0;i<d;i++)
		{
			arr1[k++]=arr[i];
		}
		System.out.println(Arrays.toString(arr1));
		return arr1 ;		
	}
	public static int[] rotateArray1(int arr[],int n) {
		int k=0;
		int d=2;
		int arr1[] = new int[5];
		for(int i=d+1;i<n;i++) {
			arr1[k++]=arr[i];
		}
		for(int i=0;i<d+1;i++) {
			arr1[k++]= arr[i];
		}
		System.out.println(Arrays.toString(arr1));
		return arr;
	}
	public static void main(String[] args)
	{
		int arr[]= {1,2,3,5,8};
		int n=5;
		rotateArray(arr, n);
		rotateArray1(arr, n);
	}
}