package com.zdkj.shuzu;

public class LianXi1 {
	public static void main(String[] args) {
		int oldArr[]= {1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
		//确定新数组的大小
		int num=0;
		for(int i=0;i<oldArr.length;i++) 
		{
			if(oldArr[i]!=0)
			{
				num++;
			}
		}
		//建立新数组，遍历老数组，找到不为0的部分，将值给到新数组。
	int newArr[]= new int [num];
	int k=0;
	for(int j=0;j<oldArr.length;j++)
	{
		if(oldArr[j]!=0)
		{
			newArr[k]=oldArr[j];
			k++;//K一定要自加，不然数组不会自动移到下一位。
		}
	}
	for(int m:newArr)
	{
		System.out.println(m);
	}
	
	
	}

}
