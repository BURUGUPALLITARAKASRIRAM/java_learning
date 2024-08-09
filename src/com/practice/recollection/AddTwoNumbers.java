package com.practice.recollection;
public class AddTwoNumbers {
	public int a;
	  public int b;
	public AddTwoNumbers() {
		this(23);
		}
	public AddTwoNumbers(int a) {
		this(a,a);
	}
	
	public AddTwoNumbers(int a, int b) {
		this.a=a;
		this.b=b;	
	}
	public void sumOfTwoNumbers() {
		System.out.println(a+b);		
	}
}