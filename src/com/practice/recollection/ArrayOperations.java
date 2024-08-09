package com.practice.recollection;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayOperations {	
	public static void main(String[] args) {
		 int[] arr= {1,3,2,7,8};
		 int index=2;
		 int newvalue=5;
		 arr[index]=newvalue;
		 System.out.println("Replace The index");
		 for(int i=0;i<arr.length;i++) {
			 if(index==i) {
				 arr[i]=newvalue;	
				 arr[i]=arr[i]*2;
			 }
		 }
		 System.out.println(Arrays.toString(arr));
	}	
}