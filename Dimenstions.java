package com.tarak.test;

public class Dimenstions {

int length;
int width;
int height;
int radius;

public Dimenstions(int length,int width) {
	this.length=length;
	this.width=width;
}
public Dimenstions() {
	
}
public Dimenstions(int radius) {
	this.radius=radius;
}

public int areaOfRectangle() {
	return this.length*this.width;
}
public double areaOfCircle() {
	return this.radius*3.14;
}

public int circumferenceOfReactangle() {
	return 2*(this.width+this.length);

}
public static double areaofSquare(int length) {
	return length * length;
}
}
