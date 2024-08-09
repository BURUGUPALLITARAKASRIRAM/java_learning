package com.training.programing;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
	/*	Stack<Integer> stack =new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());*/
			
			Stack<String> stack1 =new Stack();
			stack1.push("Taraka");
			stack1.push("sri");
			stack1.push("Ram");
			stack1.push("Burugupalli");
			System.out.println(stack1.peek());
			System.out.println(stack1.pop());
			System.out.println(stack1.peek());
			System.out.println(stack1.push("hello"));
			System.out.println(stack1.size());
			
		}
		}
	


