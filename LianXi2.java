package com.zdkj.shuzu;

public class LianXi2 {
	public static void main(String[] args) {
		int a[]= {4,23,23,1,5,3,43,21};
		// 法一
		/*
		//新建一个数组，将a数组的值复制给b数组。
		int b[]=new int [a.length];
		for(int m=0;m<a.length;m++)
		{
			b[m]=a[m];
			
		}
		//将b数组按选择排序，排好顺序。
		for(int i=0;i<b.length;i++)
		{	for(int j=i+1;j<b.length;j++)
		{
			if(b[i]>b[j]) 
			{
				int g;
				g=b[i];
				b[i]=b[j];
				b[j]=g;
			}
		}
		}
		for(int d:b)
		{
			System.out.println(d);
		}
		//遍历a数组找到最大(最小)的数（b数组中最后（最前）一位相同的数字）
		//与第一个（最后一个）元素的值进行交换。
		for(int k=0;k<a.length;k++)
		{
			if(a[k]==b[b.length-1])
			{
				int y;
				y=a[k];
				a[k]=a[0];
				a[0]=y;
			}
			
			if(a[k]==b[0])
			{
				int x;
				x=a[k];
				a[k]=a[a.length-1];
				a[a.length-1]=x;
			}
			
		}
		for(int l:a)
		{
			System.out.println(l);
		}*/
		//法二
		//找出这个数组中的最大最小值。
		int max=a[0];
		int min=a[0];
		for(int q=0;q<a.length;q++)
		{
			if(max<a[q])
			{
				max=a[q];
			}
			if(min>a[q])
			{
				min=a[q];
			}
		}
		for(int w=0;w<a.length;w++)
		{
			if(a[w]==max) {
				a[w]=a[0];
				a[0]=max;
			}
			if (a[w]==min)
			{
				a[w]=a[a.length-1];
				a[a.length-1]=min;
			}
		}
		for(int t:a)
		{System.out.println(t);}
		
			
		
	
	
	
	
	
	
	
	
	
	
	
	
	}
		

}
