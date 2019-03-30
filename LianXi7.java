package com.jerry.baozhuanglei;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//创建一个方法可以对1990年1月2日，1990-1-1，1998.9.8和1997/1/1进行解析。
public class LianXi7 {
	public void jiexi(String a) throws ParseException
	{
		
		
		
		
		if(a.contains("-"))
		{
			SimpleDateFormat b=new SimpleDateFormat("YYYY-MM-dd");
			Date f=b.parse(a);
			System.out.println(f);
		}else if(a.contains("."))
		{
			SimpleDateFormat c=new SimpleDateFormat("YYYY.MM.dd");
			Date g=c.parse(a);
			System.out.println(g);
		}else if(a.contains("/"))
		{SimpleDateFormat d=new SimpleDateFormat("YYYY/MM/dd");
			Date h=d.parse(a);
			System.out.println(h);
		}else if(a.contains("年"))
		{SimpleDateFormat e=new SimpleDateFormat("YYYY年MM月dd");
			Date i=e.parse(a);
			System.out.println(i);
		}
		
		
	}
	public void lalala(String a,String b) throws ParseException
	{
		SimpleDateFormat q=new SimpleDateFormat(b);
		Date dt=q.parse(a);
		System.out.println(dt);
	}
	public static void main(String[] args) throws ParseException {
		LianXi7 a=new LianXi7();
		 a.jiexi("1998-04-16");
		a.lalala("1998-04-16", "yyyy-MM-dd");
		
		
	}

}
