package com.lr.learn;

public class ShuiXianHuaShu {
public static void main(String[] args) {
	
	for(int i=100;i<=999;i++)
	{
		int g;
		int s;
		int b;
		int z;
		b=i/100;
		s=i%100/10;
		g=i%100%10;
		z=b*b*b+s*s*s+g*g*g;
		if(z==i)
		{
			System.out.println(i);
		}
		
		
	}
}
}
