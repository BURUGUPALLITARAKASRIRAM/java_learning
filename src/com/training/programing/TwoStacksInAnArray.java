package com.training.programing;
public class TwoStacksInAnArray {
	private int [] arr;
	private  int top1,top2;
	private int size;
	public TwoStacksInAnArray(int capacity) {
        size = capacity;
        arr = new int[size];
        top1 = -1;
        top2 = size;
	}
	 public void push1(int value) {
	        if (top1 < top2 - 1) {  
	            arr[++top1] = value;
	        } else {
	            System.out.println("Stack Overflow for stack1");
	        }
	    }
	 public void push2(int value) {
	        if (top1 < top2 - 1) {  
	            arr[--top2] = value;
	        } else {
	            System.out.println("Stack Overflow for stack2");
	        }
	    }
	 public int pop1() {
	        if (top1 >= 0) {
	            return arr[top1--];
	        } else {
	            System.out.println("Stack1 Underflow");
	            return Integer.MIN_VALUE;
	        }
	    }
}
