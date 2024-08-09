package com.training.programing;
import java.util.HashMap;
import java.util.Map;
public class Keypair {
	public static boolean keyPairsInArray(int arr[],int x) {
		Map<Integer,Integer> map =new HashMap<Integer, Integer>();
		for( int i=0;i<arr.length;i++) {
			int result=x-arr[i];
			System.out.println(result);
			if(map.containsKey(result)) {
				System.out.println("pairs found :("+arr[i]+","+result+")");
				return true;
			}
			map.put(arr[i], i);
		}
		return false;
	}
	public static void main(String [] args) {
		int arr[] = {1, 4, 45, 6, 10, 8};
		int x=16;
		boolean result =keyPairsInArray(arr, x);
		System.out.println(result);
	
	}
	
}
