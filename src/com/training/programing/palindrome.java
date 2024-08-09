package com.training.programing;
public class palindrome {
	public static boolean palindrome(String str) {
		int l=0;
		int r=str.length()-1;
		while(l<r) {
			if(str.charAt(l)!=str.charAt(r)) {
				return false;
			}
			l++;
			r--;
			
		}
		return true;
	}
		
	public static void main(String[] args) {
		String str="madam";
		if(palindrome(str)) {
			System.out.println("is palindrome");
		}else {
			System.out.println("is not palindrome");
		}
	}
	}