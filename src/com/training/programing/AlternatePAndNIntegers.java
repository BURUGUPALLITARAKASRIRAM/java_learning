package com.training.programing;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.text.Position;
public class AlternatePAndNIntegers {	
	static void postiveAndNegative(int arr[],int n) {
		int pos=0;
		int neg=0;
		int len =arr.length;
		int newArray [] = new int [len];
		List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();
        for(int i=0;i<n;i++) {
        	if(arr[i]>0) {
        		positive.add(arr[i]);
        	}else {
        		negative.add(arr[i]);
        	}
        }
        for(int j=0;j<n;j++) {
        	if(j%2==0 && pos<positive.size()) {
        		newArray[j]= positive.get(pos++);
        	}else {
        		newArray[j]= negative.get(neg++);
        	}
        }
        System.out.println("alternative pos & neg nums >" +Arrays.toString(newArray));
		}
	////////////////////////////***///////////////////////////////
	public static void posAndNeg(int [] array,int n1) {
		int pos=0;
		int neg=0;
		int len =array.length;
		int newArray [] = new int [len];
		List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();
        
        for(int i=0;i<array.length;i++) {
        	if(array[i]>0) {
        		positive.add(array[i]);
        	}else {
        		negative.add(array[i]);
        	}
        }
        for(int j=0;j<len;j++) {
        	if(j%2==0 && pos<positive.size()) {
        		newArray[j]=positive.get(pos++);
        	}else {
        		newArray[j]=negative.get(neg++);
        	}
        }
        System.out.println(Arrays.toString(newArray));
	}
	public static void main(String[] args) {
			int arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2};
			int n=9;
			postiveAndNegative(arr, n);
			posAndNeg( arr, n);
	}
}