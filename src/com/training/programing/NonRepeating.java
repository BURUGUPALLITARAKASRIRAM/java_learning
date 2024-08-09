package com.training.programing;
import java.util.HashMap;
import java.util.Map;
public class NonRepeating {
	public static char nonRepeating(String s) {
	int newArray [] = new int [26];
	for(int i=0;i<s.length();i++) {
		char ch = s.charAt(i);
		newArray[ch]++;
	}
	for(int j=0;j<s.length();j++) {
		char ch1 =s.charAt(j);
		if(newArray[ch1]==1){
			return ch1;
		}
	}
	char $ = 0;
	return $;
	}
	public static void main(String [] args) {
		String s="Hello";
		char result=nonRepeating(s);
		if(result=='$') {
			System.out.println("No Repeating Element is found:");
		}else {
			System.out.println("Repeating Element is >"+ result);
		}
	}
}