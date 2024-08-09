package com.training.programing;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class RemovingDuplicate {
	public static int[] duplicatesInArray(int arr[]){
		List <Integer> al =new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			System.out.println("after for loop:"+ i);
			if(!al.contains(arr[i])){
				System.out.println("after condition check:" );
				al.add(arr[i]);
			}	
		}
		System.out.println(al.toString());
		return arr;
	}
	public static void main(String [] args) {
		int[] arr = {3,7,4,7,8,3};
		int [] afterDuplicates =duplicatesInArray(arr);
		System.out.println("Original Array :"+ Arrays.toString(arr));
			}
}
