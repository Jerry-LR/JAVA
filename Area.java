package com.jerry.chouxiang;

public abstract class Area extends Shape{

	private double a;
	private double b;
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	
	public double getArea() {
		// TODO Auto-generated method stub
		return a*b;
	}
	
}
