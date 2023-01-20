package com.tarak.collections;

import java.util.ArrayList;
import java.util.List;

public class SizeofTheList {

	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList=new ArrayList<>();
		
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		intList.add(6);
		
		//How removeIf works
		intList.removeIf(s -> (s%2 ==0));
		//How iterator works
		for (Integer abc: intList) {
			System.out.println("Integer list::"+abc);
		}
		//what is the size of the list
		
		System.out.println("Size of the list"+ intList.size());
		}

}
