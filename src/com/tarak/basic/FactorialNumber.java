package com.tarak.basic;
import java.util.Scanner;
public class FactorialNumber {


	public static void main(String[] args) {
	int n;
	long factorial=1;
	try (Scanner scanner = new Scanner(System.in)) {
		System.out.println("Enter any number ");
		n=scanner.nextInt();

	for(int i = n;i>0;i--)
	{
		factorial=factorial*i;
	}
	System.out.println("factorial "+factorial);
	}

}
}