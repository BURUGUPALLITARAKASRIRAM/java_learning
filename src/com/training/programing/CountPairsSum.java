package com.training.programing;
public class CountPairsSum {
public static int countpairs(int arr[],int k) {
	int result =0;
	for(int i=0;i<arr.length-1;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]+arr[j]==k) {
				result++;
			}
		}
	}
	System.out.println(result);
	return k;
}
    public static void main(String [] args) {
    	int arr[] = {1,5,7,1};
    	int k=6;
    	countpairs(arr, k);
    }
}