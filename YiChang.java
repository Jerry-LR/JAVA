package com.jerry.yichang;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class YiChang {
	
	public void yiChang(String a,String b)
	{
		SimpleDateFormat date=new SimpleDateFormat(b);
		try {
			Date c=date.parse(a);
			System.out.println(c);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		}
		
	
	public static void main(String[] args) {
		YiChang a=new YiChang();
		a.yiChang("2019-03-26", "yyyy-MM-dd");
	}

}
