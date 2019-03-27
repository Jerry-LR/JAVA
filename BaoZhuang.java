package com.jerry.baozhuanglei;


import java.util.Date;



public class BaoZhuang 
{	
	public static void main(String[] args)  {
	
		Object j=2;
		String k="abcdefg";
	
	int i=3;
	//Integer in=new Integer(i);
	Integer in=Integer.valueOf(i); 
	Integer.bitCount(i);//返回指定的int值的二进制补码二进制表示中的 int数。 
	int a=in.byteValue();//返回此值 Integer为 byte的基本收缩转换后。
	in.floatValue();//返回此值 Integer为 float一个宽元转换后。
	in.toString();//返回它的值；throws NumberFormatException
	in.hashCode();//返回这个 Integer的哈希码。
	in.equals(j);//将此对象与指定的对象进行比较。 其结果是true当且仅当该参数不是null并且是Integer对象包含相同int值作为该对象。 
	Integer c=in.valueOf("213");
	//int num = Integer.getInteger("SIZE" , 5);
	//System.out.println(Integer.SIZE);
	double s=Math.ceil(3.33);//向上取整；
	double g=Math.min(6, 10);//取最小；
	double h=Math.pow(2, 0.5);//乘方；
	double l=Math.random();//随机数;
	double z=Math.abs(-213);//取绝对值；
	double x=Math.sqrt(2);//平方根；
	double v=Math.cbrt(2);//立方根；
	double b=Math.round(11.5);//四舍五入；
	//System.err.print(213);
	Date dt=new Date();
	dt.toString();//格式化日期转义格式yyyy-mm-dd。
	
	
	
	System.out.println(dt.toString());
	}

	
}
