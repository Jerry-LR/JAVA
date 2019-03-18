package com.lr.learn;

public class ChengFaBiao {
	public static void main(String[] args) {
		
		for(int i=9;i>0;i--)
		{
			for(int j=i;j>=1;j--)
			{
				if(i*j<10)
				{
					System.out.print(j+"*"+i+"="+i*j+"  ");
				}else
				{
					System.out.print(j+"*"+i+"="+i*j+" ");
				}
				
			}
			System.out.println("");
		}	
	}

}
