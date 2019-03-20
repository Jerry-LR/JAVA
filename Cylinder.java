package com.jerry.lianxi11;

public class Cylinder implements C{
	public double radius;
	public double height;
	public String color;
	

	public Cylinder(double radius, double height,String color) {
		super();
		this.radius = radius;
		this.height = height;
		this.color=color;
	}
	public String getColor() {
		return color;
	}

	@Override
	public double area() {
		
		return 2*A*radius*height+A*radius*radius;
	}

	@Override
	public void setColor(String c) {
		// TODO Auto-generated method stub
		this.color=color;
		
	}

	@Override
	public void volume() {
		// TODO Auto-generated method stub
		System.out.println("Ìå»ýÊÇ£º"+A*radius*radius*height);
	}
	

}
