package com.training.programing;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
public class RomanToInt {
	public static int romanToInt(String s) {
              HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
   int result=0;
   int prevValue=0;
   for(int i=s.length()-1;i>=0;i--) {
	   char currentChar = s.charAt(i);
	   int currentValues= romanValues.get(currentChar);
	   if(currentValues>=prevValue) {
		   result+=currentValues;
	   }else {
		   result-=currentValues;
	   }
   }
    return result;
	}
	 public static void main(String[] args) {
		 String n="VI";
		 int integerValue=romanToInt(n);
		 System.out.println( " Roman number " + n + " is equal to integer: " + integerValue);
	 }
}
  