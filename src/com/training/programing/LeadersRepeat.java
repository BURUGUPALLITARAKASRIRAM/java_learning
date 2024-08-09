package com.training.programing;
import java.util.ArrayList;
import java.util.List;
public class LeadersRepeat {
    static List<Integer> leaders(int arr[], int n) {
		List<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			int j;
			for(j=0;j<arr.length;j++) {
				if(arr[i]<arr[j])
					break;
			}
 			if(j==n)
			al.add(arr[i]);
		}
		return al;		
}
    public static void main (String[] args) {
		int arr[] = {16,17,4,3,5,2};
		int n= arr.length;
		System.out.println("leaders in array are:");
		List<Integer> result = leaders(arr, n);
		for(int i=0;i<result.size();i++) {
			int leader = result.get(i);
			System.out.println(leader);
		}
	}
}