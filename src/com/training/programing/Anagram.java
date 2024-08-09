package com.training.programing;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class Anagram {
	static boolean areAnagram(String s1,String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<s1.length();i++) {
			char ch = s1.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		for(int j=0;j<s2.length();j++) {
			char ch1 =s2.charAt(j);
			if(map.containsKey(ch1)||map.get(ch1)==0)
				map.put(ch1, map.get(ch1)-1);
		}
		return true;
	}
	public static boolean checkAnagram(String str1,String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
			char [] arr1= str1.toCharArray();
			char [] arr2= str2.toCharArray();
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
		Arrays.equals(arr1, arr2);
		return true;	
	}
	public static void main(String[] args) {
		String s1="act";
		String s2="cat";
		
		if(areAnagram(s1, s2)) {
			System.out.println("is anagram");
		}else {
			System.out.println("is not anagram");
		}
		
		  String str1="listen";
		  String str2="silent";
		  boolean areAnagram = checkAnagram(str1,str2);
		  if(areAnagram) { 
		 System.out.println("is anagram"); 
		}else {
		 System.out.println("is not anagram"); 
		 }
	}
} 