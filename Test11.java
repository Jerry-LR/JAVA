package com.jerry.lianxi11;

public class Test11 {
	public static void main(String[] args) {
		Cylinder cy1=new Cylinder(2,3,"��ɫ");
		cy1.setColor("��ɫ");
		String b=cy1.getColor();
		double a=cy1.area(); 
		cy1.volume();
		System.out.println("��ɫ�ǣ�"+b+"����ǣ�"+a);
		
	
	}
}
