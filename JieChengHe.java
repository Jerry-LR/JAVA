package com.zdke.duixiang;

public class JieChengHe {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
	
		int b[]=new int[10];
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length;j++)
			{
				b[0]=1*a[0];
				b[j]=1*b[j-1]*a[j];
			}
		}
		int h=0;
		for(int k=0;k<b.length;k++)
		{
			h=h+b[k];
			System.out.println(h);
		}
	}
}
