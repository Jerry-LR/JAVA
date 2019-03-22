package com.jerry.ceshi;

public class Di1 {
	public static void main(String[] args) {
		int a=1;
		double b=2.0;
		//将a赋值给b
		 b=a;
		 System.out.println(b);
		 //从低级别往高级别转换直接可以转换叫做自动转换
		 //将b赋值给a,必须在b前面加上（int）不然不让你编译
		 a=(int)b;
		 System.out.println(a);
		 //从高级别往低级别转换会造成数据失去准确性，所以必须要转换时需要使用强制转换。
	}

}
