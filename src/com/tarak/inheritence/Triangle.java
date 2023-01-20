package com.tarak.inheritence;

public class Triangle implements Shape {
	int height;
	int base;
	int side1;
	int side2;
	int side3;
	


	public Triangle(int height, int base, int side1, int side2, int side3) {
		this.height = height;
		this.base = base;
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double area() {
		// TODO Auto-generated method stub
		return height*base/2;
	}

	public double circumference() {
		
		// TODO Auto-generated method stub
		return side1+side2+side3;
	}

	
	}
	
   

