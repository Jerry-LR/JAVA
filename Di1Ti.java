package com.zfkj.duixiang;

public class Di1Ti {
	int a,b;
	public Di1Ti(){}
	public int sum(int a,int b)
	{
		return a+b;
	}
	public int sub(int a,int b)
	{
		return a-b;
	}
	public int mul(int a,int b)
	{
		return a*b;
	}
	public int div(int a,int b)
	{
		return a/b;
	}
	public static void main(String[] args) {
		Di1Ti a=new Di1Ti();
		int  c,d;
		c=20;
		d=10;
		
		
		System.out.println("����֮��"+a.sum(c, d)+"����֮��"+a.sub(c, d)+"����֮��"+a.mul(c, d)+"����֮��"+a.div(c, d));
		
		
		
	}
}
