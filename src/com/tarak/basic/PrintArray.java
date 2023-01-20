package com.tarak.basic;

import java.util.Scanner;
public class PrintArray{
    public static void main(String args[]) {
      int[] array =new int[10];
      try (Scanner scanner = new Scanner(System.in)) {
		int i=0;
		  while (scanner.hasNext()){
		      array[i++]=scanner.nextInt();
		  }
	}
      printArray(array);
    } 
    private static void printArray(int array[] ){
        System.out.print("Given input Array  ");
        for(int i=0;i<10;i++){ 
            
        System.out.print(array[i]+" ");
        }
        int[] array1 =new int [10];
        for(int i=0;i<10;i++)
        {
            array1[i]=array[i]*5;
        
            
        }
         System.out.println();
        System.out.print("output of the program is ");
        for(int i=0;i<10;i++)
        {
            System.out.println(array1[i]+"  ");
        }
    }

    
}