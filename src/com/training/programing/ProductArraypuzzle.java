package com.training.programing;
import java.util.Arrays;
public class ProductArraypuzzle {
public static void productPuzzle() {
    int array[] = {10,3,5,6,2};
    int n=array.length;
    int newArr [] = new int [n];
    int totalMultiply=1;
    for(int i=0;i<n;i++) {
    	totalMultiply=totalMultiply*array[i];
    }
    int result =0;
    for(int j=0;j<n;j++) {
    	result=totalMultiply/array[j];
    	newArr[j]=result;
    }
    System.out.println(Arrays.toString(newArr));
}

	public static void main(String[] args) {
	productPuzzle(); 
	}
	
}