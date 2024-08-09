package com.training.programing;
public class palindromeIntegers {
	public static void main(String [] args) {
		int input =1771;
		int rev=0;
		int k=input;
		while(k>0) {
			int rem =k%10;
			k=k/10;
			rev =(rev*10)+rem;
			}
		if(rev==input) {
			System.out.println("Is Palindrome");
		}else {
			System.out.println("Is Not Palindrome");
		}
	}
}
