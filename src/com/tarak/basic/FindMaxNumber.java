package com.tarak.basic;
import java.util.Scanner;
public class FindMaxNumber {

	public static void main(String[] args) {
	int a[]= new int[5];int max;
	try (Scanner scanner = new Scanner(System.in)) {
		System.out.println("Enter Array Elements");
		for(int i=0;i<5;i++)
		{
			a[i]=scanner.nextInt();
		}
	}
	 
	max=a[0];
	for(int i=0;i<5;i++)
	{
		if(max<a[i]) {
			max=a[i];
		} 
		}
	System.out.println("Maximum Elements"+max);

	}
	

}
