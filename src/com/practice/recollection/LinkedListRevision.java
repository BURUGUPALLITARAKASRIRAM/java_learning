package com.practice.recollection;

import java.util.LinkedList;

public class LinkedListRevision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<>();
		
		ll.add("Abhi");
		ll.add("Bhanu");
		ll.add("Dheeraj");
		ll.add("egale");
		System.out.println("initial Stage of adding :"+ ll);
		ll.add(2, "Cherry");
		System.out.println("After adding inedx :"+ ll);
		
		LinkedList<String> ll2 = new LinkedList<>();
		ll2.add("Funny");
		ll2.add("Ganesh");
		ll2.add("Harish");
		ll.addAll(ll2);
		System.out.println("After AddAll :"+ll);
       
		ll.addFirst("Arjun");
		System.out.println("After AddFirst :"+ll);
		
		ll.addLast("Imran");
		System.out.println("After AddLast :"+ll);
		
		ll.add(10, "Jaswanth");
		System.out.println("after Adding Index :"+ll);
		
		
	}
	

}
