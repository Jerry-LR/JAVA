package com.zdkj.shuzu;

public class LianXi1 {
	public static void main(String[] args) {
		int oldArr[]= {1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
		//ȷ��������Ĵ�С
		int num=0;
		for(int i=0;i<oldArr.length;i++) 
		{
			if(oldArr[i]!=0)
			{
				num++;
			}
		}
		//���������飬���������飬�ҵ���Ϊ0�Ĳ��֣���ֵ���������顣
	int newArr[]= new int [num];
	int k=0;
	for(int j=0;j<oldArr.length;j++)
	{
		if(oldArr[j]!=0)
		{
			newArr[k]=oldArr[j];
			k++;//Kһ��Ҫ�Լӣ���Ȼ���鲻���Զ��Ƶ���һλ��
		}
	}
	for(int m:newArr)
	{
		System.out.println(m);
	}
	
	
	}

}
