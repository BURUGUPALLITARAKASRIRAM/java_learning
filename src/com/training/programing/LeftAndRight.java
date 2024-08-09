package com.training.programing;
import java.util.Arrays;
public class LeftAndRight {
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8} ;
	        int left = 1;
	        int right = 5;
	      //  rotateLeftByOne(arr, left, right);
			/*
			 * for(int i=0;i<arr.length;i++) { System.out.print(arr[i]+" "); }
			 */
	       rotate(arr, left, right);
	       
	        System.out.println();
	    }
	    public static void rotateLeftByOne(int[] arr, int left, int right) {
	        int temp = arr[left];
	        System.out.println("firstly temp >  "+temp);
	        for (int i = left; i < right; i++) {
	           System.out.print(arr[i] = arr[i + 1]);
	           System.out.println();
	        }
	        System.out.println("arr[right]>"+arr[right]);
	        arr[right] = temp;
	    }
	    
	    public static void rotate(int arr[],int left,int right) {
	    	int k=0;
	    	int len =arr.length;
	    	int newArray [] =new int[len];
	    	
	    	for(int i=left;i<=right;i++) {
	    	newArray[k++] =arr[i];
	    	}
	    	for(int j=0;j<left;j++) {
	    		newArray[k++]=arr[j];
	    	}
	    	for(int k1=right+1;k1<arr.length;k1++) {
	    		newArray[k++]=arr[k1];
	    	}
	    	System.out.println(Arrays.toString(newArray));
	    }
	}
