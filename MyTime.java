package com.jerry.clas;

public class MyTime {
	/*private int hour;
	private int minute;
	private int second;
	public MyTime() {};
	public MyTime(int hour,int minute,int second)
	{
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	
	public int addSecond(int sec)
	{
		if(second+sec<60)
		{
			return second+sec;
		}else
		{
			minute+=minute/60;
			return second%60;  
		}
	}
	public int addMinute(int min)
	{
		if(minute+min<60)
		{
			return minute+min;
		}else
		{
			hour+=hour/60;
			return minute%60;  
		}
	}
	public int addHour(int hou)
	{
		if(hour+hou<24)
		{
			return hour+hou;
		}else
		{
			return hour%24;  
		}
	}*/
	
	

		
		//时
		private int hour;
		
		//分
		private int minute;
		
		//秒
		private int second;
		
		
		//有参构造方法，初始化成员变量
		public MyTime(int hour,int minute,int second) {
			this.hour = hour;
			this.minute = minute;
			this.second = second;
		}
		
		//无参构造方法
		public MyTime() {
			
		}
		
		//添加秒
		public void addSecond(int sec){
			//增加秒
			second=second+sec;
			
			//如果超60，则分增加
			if(second>=60) {
				
				//计算增加的分
				int mi = second/60;
				
				minute+=mi;
				
				//minute超出六十则时增加
				if(minute>=60) {
					int hr = minute/60;
					hour+=hr;
					
					//需要对时进行判断，如果时超24，则减24
					if(hour>=24) {
						hour %=24; 
					}
					
					//更新分
					minute = minute%60;
				}
				
				//更新秒
				second = second%60; 
				
			}
		}
		
		
		//增加分
		public void addMinute(int mi) {
			
			//增加
			minute+=mi;
			
			//如果分大于等于60，则进位
			if(minute>=60) {
				
				//计算增加的小时数
				int hr = minute/60;
				
				//计算时
				hour+=hr;
				
				//如果时超出24，则-24
				if(hour>=24) {
					hour = hour%24;
				}
				
				//更新分
				minute %=60;
			}
			
		}
		
		//增加时
		public void addHour(int hr) {
			//计算时增加
			hour +=hr;
			hour%=24;
		}
		
		

	

	
	
	public void subSecond(int sec)
	{
		if(second-sec>0)
		{
			 second=second-sec;
		}else
		{
			second=second-sec;
			minute=minute-second/60-1;
			second=second-sec;
			second=-second%60;  
			if(minute<0)
			{
			
				minute=-(minute-minute/60-1);
				if(hour<0)
				{
					hour=hour%24+24;
				}
				
			}
		}
		
	}
	public void subMinute(int min)
	{
		if(minute-min>0)
		{
			 minute=minute-min;
		}else
		{
			minute=minute-min;
			hour=hour-minute/60-1;
			minute=minute-min;
			minute=-minute%60;  
		}
	}
	public void subHour(int hou)
	{
		if(hour-hou>0)
		{
			hour=hour-hou;
		}else
		{
			hour=hour-hou;
			hour=-hour%24;  
		}
	}
	
	public void diaplay()
	{
		System.out.println("现在是："+hour+"时"+minute+"分"+second+"秒");
	}
	


}
