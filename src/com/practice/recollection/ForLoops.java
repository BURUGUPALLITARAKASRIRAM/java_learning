package com.practice.recollection;

public class ForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int i;
	for(i=1;;) {
		if(i<10) {
			System.out.println(i);
			i*=2;
		}else
			break;}
	
		System.out.println(i);
		reversearray();
				}
	public static void reversearray() {
		int [] a= {1,2,3,4,5};
		System.out.println("Normal array");
		for(int i1=0;i1<a.length;i1++) {
		System.out.print(a[i1]+" ");	
		}
		System.out.println();
		System.out.println("Reverse array");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
	}
	}

