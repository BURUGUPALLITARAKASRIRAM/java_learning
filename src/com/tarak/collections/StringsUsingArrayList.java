package com.tarak.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringsUsingArrayList {



	public static void main(String[] args) {
    List<String> intList=new ArrayList<String>();
		
		 try (Scanner scanner = new Scanner(System.in)) {
			while (scanner.hasNext()) {
				intList.add(scanner.next());
				
			}
		}
		 
		 
		 System.out.println("Print Array"+intList);
		
		

	}

}
