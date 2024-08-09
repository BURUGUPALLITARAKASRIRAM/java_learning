package com.training.programing;
import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.Map;
public class DuplicateInString {
	public static void duplicatesInString(String s) {
		Map<Character,Integer> map = new HashMap<>();
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(map.containsKey(ch)) {
				int counter = map.get(ch);
				map.put(ch, counter+1);
			}else {
				map.put(ch, 1);
			}
		}
		for(Character key : map.keySet()) {
			if(map.get(key)>1) {
			System.out.println("Characters:" + key + " occurance " + map.get(key));
			}
		}
		}
	public static void main (String [] args) {
		String s="ajjithii";
		duplicatesInString(s);
	}
}