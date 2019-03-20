package com.jerry.lianxi11;

public class Test11 {
	public static void main(String[] args) {
		Cylinder cy1=new Cylinder(2,3,"红色");
		cy1.setColor("红色");
		String b=cy1.getColor();
		double a=cy1.area(); 
		cy1.volume();
		System.out.println("颜色是："+b+"面积是："+a);
		
	
	}
}
