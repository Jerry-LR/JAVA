package com.zdkj.shuzu;

public class LianXi3 {

	public static void main(String[] args) {
		int a[][]= {{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
		
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				 
				sum=sum+a[i][j];
				}
		}
		System.out.println("公司年度资金总额为："+sum+"万元");	
	}

}
