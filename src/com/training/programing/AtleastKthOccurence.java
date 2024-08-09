package com.training.programing;
import java.util.Arrays;
public class AtleastKthOccurence {
	public static int atleastOccurance(int [] arr,int k) {
		int newArray [] =new int [10];
		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
			newArray[num]++;
			}
		for(int j=0;j<arr.length;j++) {
			if(newArray[j]>=k) {
				return j;
			}
		}
		return -1;	
	}
	public static void main(String[] args) {
        int[] arr = {1, 7, 4, 3, 4, 8, 7};
        int k = 2;
        int result = atleastOccurance(arr, k);
        if (result == -1) {
            System.out.println("No element occurs at least " + k + " times.");
        } else {
            System.out.println("The smallest element that occurs at least " + k + " times is: " + result);
        }
	}
}