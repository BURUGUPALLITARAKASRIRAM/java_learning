 package com.training.programing;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
public class ParenthsisChecker {
	static boolean areBrackestBalanced(String s) {
		char [] arr =s.toCharArray();
		Map <Character ,Character> map =new HashMap<>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
		Stack <Character> stack =new Stack<Character>();
		for(int i=0;i<s.length();i++) {
			char currentChar =s.charAt(i);
			if(map.containsKey(currentChar)) {
				stack.push(currentChar);
			}else if(map.containsValue(currentChar)) {
				if(stack.isEmpty() || map.get(stack.pop())!=currentChar) {
					return false;
				}
			}
		}
		return stack.isEmpty();
}
	public static void main (String [] args) {
		String s ="([{}])";
		if(areBrackestBalanced(s)){
			System.out.println("Is Balanced");
			}else {
				System.out.println("Is Not Balnced");
			}	
	}	
}