package com.zdkj.shuzu;

public class PaiXu {
	public static void main(String[] args) {
		int a[]= {21,3,45,6,8,2,19};
		//√∞≈›≈≈–Ú
		for(int i=0;i<a.length;i++)
		{for(int j=0;j<a.length-1-i;j++)
		{
			
			if(a[j]<a[j+1])
			{
				int b;
				b=a[j];
				a[j]=a[j+1];
				a[j+1]=b;
			}
		
		
		}
		
		}
		for(int k:a)
		{
			System.out.println(k);
		}
		
		
		//—°‘Ò≈≈–Ú
		/*for(int i=0;i<a.length;i++)
			{for(int j=i+1;j<a.length;j++)
			{
				if (a[i]<a[j])
				{
					int b;
					b=a[i];
					a[i]=a[j];
					a[j]=b;
				}
			}}
		
		for(int k:a)
		{
			System.out.println(k);
		}*/
		
		
	
	}

}
