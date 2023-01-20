package com.tarak.inheritence;

public class Rectangle implements Shape,Color {
	
	
	int width;
	 int length;

	 
	public Rectangle(int length, int width) {
		this.length=length;
		this.width=width;
		
		}
	public double area () {
	   
		return length*width;
	}

	public double circumference() {
		// TODO Auto-generated method stub
		return 2*(this.width+this.length);
	}
	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "BLUE";
	}
	
	}

