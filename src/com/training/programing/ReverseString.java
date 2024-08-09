package com.training.programing;
public class ReverseString {
	public static void main(String[] args) {
	String s1= "Taraka Sriram ";
	String s2 ="";

	char [] ch = s1.toCharArray();
	
	for(int i=ch.length-1;i>=0;i--) {
		s2=s2+ch[i];
	}
	System.out.println(s2);
		System.out.println();
		
		reverseString();
		removeWhiteSpaces();
		whiteSpacesWithStringBuffer();
	}
	public static void reverseString() {
		String s= "RAMA RAO";
		String s1="";
		for(int i=s.length()-1;i>=0;i--) {
			char ch=s.charAt(i);
			s1=s1+ch;
		}
		System.out.println("This Is Second Method : "+s1);	
		System.out.println();
	}
	public static void removeWhiteSpaces() {
		String s="Rohi th  Sharma";
		String s1=s.replaceAll("\\s","");
		System.out.println("Removing White Spaces in String : "+s1);
		System.out.println();
	}
	public static void whiteSpacesWithStringBuffer() {
		String s="Virendra Sehwag";
		char[] ch=s .toCharArray();
		StringBuffer sb= new StringBuffer();
		for(int i=0; i<ch.length;i++) {
			if(ch[i]!=' ') {
				sb.append(ch[i]);
			}			
		}
		System.out.println("Removing White Spaces with Stringbuffer:"+sb);
	}
}