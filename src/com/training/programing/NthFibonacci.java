package com.training.programing;
public class NthFibonacci {
	 public static long fibonacci(int n) {
		if(n<=1) {
			return n;
		}
		return fibonacci(n-1)+fibonacci(n-2);
	 }
	 public static void main(String [] args) {
		 int n=30;
		 long fibValue=fibonacci(n);
		 System.out.println(n + "Is "+ fibValue);
	 }
}