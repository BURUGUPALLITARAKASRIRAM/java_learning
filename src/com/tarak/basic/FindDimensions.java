package com.tarak.basic;

import com.tarak.test.Dimenstions;

public class FindDimensions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Dimenstions dim=new Dimenstions(12,15);
		System.out.println(" circumference of rectangle::"+ dim.circumferenceOfReactangle());

		Dimenstions circle=new Dimenstions(5);
		System.out.println("Area of Cricle::"+circle.areaOfCircle());
		
		
		System.out.println("Area of rectangle::"+dim.areaOfRectangle());
		
		System.out.println("Area of Square::"+Dimenstions.areaofSquare(11));
	}


}
