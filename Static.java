package com.jerry.clas;

public class Static {
	static String name;
	static String sex;
	int age;
	static{
		System.out.println("������������������������������");
	}
	public void Static(String name) {
		this.name=name;
		
	}
	public  Static(String name) {
		System.out.println(name);
	}
	public void Static() {}
	public static void run() {
		System.out.println("��");
	}
	public static void  say() {
		System.out.println(name);
	}

}
