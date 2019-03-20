package com.jerry.chouxiang;

public class TestShape {
	public static void main(String[] args) {
		Area area=new Area() {
		};
		area.setA(2);
		area.setB(2);
		double b=area.getArea();
		System.out.println(b);
		
		
	}

}
