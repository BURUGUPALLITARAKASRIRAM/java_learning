package com.training.programing;
import java.util.HashMap;
public class FindPairs {
	public static void findPairs(int arr[],int n) {
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<n;i++) {
			if(map.containsKey(arr[i]+n)) {
				System.out.println("Pairs found:("+ arr[i] +" , "+ (arr[i]+n)+")");
				return ;
			}
			if(map.containsKey(arr[i]-n)) {
				System.out.println("Pairs found:( "+(arr[i]-n)+" , " + arr[i]+")");
				return;
			}
			map.put(arr[i], arr[i]);
		}
		System.out.println("No Pairs Exist:");
}
	public static void sum() {
		int[] array = { 1, 2, 3, 4, 5 };
		int sum =0;
		for(int i=0;i<=array.length;i++) {
			sum =sum+i;
		}
			System.out.println( "Sum of elsements:"+sum);
		

	}
	public static void main(String [] args) {
		int arr[] ={5, 20, 3, 2, 50, 80};
		int n=78;
		findPairs(arr, n);
		sum();
	}
}