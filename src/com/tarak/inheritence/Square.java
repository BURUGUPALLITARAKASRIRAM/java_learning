package com.tarak.inheritence;

public class Square implements Shape,Color{
	
	int length;
	public Square(int length) {
		this.length=length;
	}

	public double area() {
		// TODO Auto-generated method stub
		return length*length;
	}

	public double circumference() {
		// TODO Auto-generated method stub
		return 4*length;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "RED";
	}


}
