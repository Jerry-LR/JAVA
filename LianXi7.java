package com.jerry.baozhuanglei;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//����һ���������Զ�1990��1��2�գ�1990-1-1��1998.9.8��1997/1/1���н�����
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
		}else if(a.contains("��"))
		{SimpleDateFormat e=new SimpleDateFormat("YYYY��MM��dd");
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
