package com.zdkj.shuzu;

public class LianXi2 {
	public static void main(String[] args) {
		int a[]= {4,23,23,1,5,3,43,21};
		// ��һ
		/*
		//�½�һ�����飬��a�����ֵ���Ƹ�b���顣
		int b[]=new int [a.length];
		for(int m=0;m<a.length;m++)
		{
			b[m]=a[m];
			
		}
		//��b���鰴ѡ�������ź�˳��
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
		//����a�����ҵ����(��С)������b�����������ǰ��һλ��ͬ�����֣�
		//���һ�������һ����Ԫ�ص�ֵ���н�����
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
		//����
		//�ҳ���������е������Сֵ��
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
