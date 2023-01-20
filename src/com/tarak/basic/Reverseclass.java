package com.tarak.basic;

import java.util.Scanner;
 public class Reverseclass{
    public static void main (String args[]){
        try (Scanner scanner = new Scanner(System.in)) {
			String inputString="";
			while(scanner.hasNext()){
			   inputString =scanner.next();
			}
			char[] chars=inputString.toCharArray();
			String outputString="";
   for(int i=chars.length-1 ;i>=0;i--)
   {
			outputString=outputString+ chars[i];
   }
   System.out.println("Reverse String :"+ outputString);
		}
    }
    
}
