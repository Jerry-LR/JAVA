package com.jerry.leikulianxi;

public class Di1 {
	public static void main(String[] args) {
		String a="Persion.java";
		String b="Persion.java.txt";
		int ac=a.lastIndexOf(".");
		int bc=b.lastIndexOf(".");
		String d=a.substring(ac);
	String e=b.substring(bc);
	
	System.out.println("a的扩展名为："+d);
	System.out.println("b的扩展名为："+e);
}
}
