package com.practice.recollection;
import java.util.ArrayList;
public class IndexSubArray 
{
	static ArrayList<Integer> subarraySum(int[] arr,int n,int s)
	{
		ArrayList<Integer> outputlist = new ArrayList<>();
		int i=0;
		int sum=0;
		for(int j=0;j<n;j++) {
			sum= sum =arr[j];
			
			while(sum >s) {
				sum=sum-arr[i];
				i++;
			}
			if(sum ==s && i<=j) {
				outputlist.add(i+1);
				outputlist.add(j+1);
				return outputlist;
			}
		}
		return outputlist;
	}
	 static ArrayList<Integer> subarraySum1(int[] arr,int n ,int s){
		 ArrayList<Integer> outputList1 = new ArrayList<>();
		 
		 for(int j=0;j<n;j++) {
			 int sum =0;
			 for(int i=j;i<n;i++) {
				 sum=sum+arr[i];
				 if(sum==s) {
					 outputList1.add(j);
					 outputList1.add(i);
					 continue;
				 }
				 else if(sum>5);
				 {
					 continue;	 
				 }
			 }
		 }	 
		return outputList1;
		 
	 }
	public static void main(String[] args) {
		int[] arr = {1,2,3,7,5};
		int sum =7;
		ArrayList<Integer> result =subarraySum(arr, arr.length,sum);
		for(int val : result) {
			System.out.print(val+ " ");
		}
		ArrayList<Integer> result1 = subarraySum1(arr, arr.length, sum);
		for(int val1 : result1) {
			System.out.println(val1  + " ");
		}
	}
}
