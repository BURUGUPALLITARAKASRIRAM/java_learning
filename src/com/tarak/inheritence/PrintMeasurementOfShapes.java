package com.tarak.inheritence;

public class PrintMeasurementOfShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape1=new Square(10);
		Color color=new Square(10);
		System.out.println("Enter the side of Square:"+shape1.area());
		System.out.println("Enter the color of Square:"+color.getColor());
	
		
		
		Shape shape2=new Circle(3);
		System.out.println("Enter the radius of circle:"+shape2.area());
		
				
		Shape shape3=new Triangle(5, 5, 5, 5, 5);
		System.out.println("Enter the shape of Tringle:"+shape3.area());
		
		
		 
		Shape shape4=new Rectangle(2,3);
		System.out.println("Enter the Shape of Triangle:"+shape4.area());
	
		
		

	}

}
