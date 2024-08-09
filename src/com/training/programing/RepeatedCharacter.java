package com.training.programing;
import java.util.HashMap;
public class RepeatedCharacter {
	public static char fisrtRepeatedChar(String s) {
		HashMap<Character,Integer> map = new HashMap<>();
		char[] arr= s.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				return arr[i];
			}else {
				map.put(arr[i], 1);
			}
		}
		return 0;
	}
		public static void main(String[] args) {
	        String str = "abcdefadghija";
	        char firstRepeated = fisrtRepeatedChar(str);
	        if (firstRepeated != '0'){
	            System.out.println("First repeated character in the string \"" + str + "\" is: " + firstRepeated);
	        }else{
	            System.out.println("No repeated characters found in the string \"" + str + "\"");
	        }
	    }
}