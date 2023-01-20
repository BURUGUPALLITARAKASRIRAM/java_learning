package com.tarak.inheritence;

public class Circle implements Shape {
	int radius;
	
	
	public Circle(int radius) {
		this.radius= radius;
		
	}

	public double area() {
		// TODO Auto-generated method stub
		return 3.14*this.radius*this.radius;
	}

	public double circumference() {
		
		// TODO Auto-generated method stub
		return 2*3.14*this.radius;
	}

	
	}
	


