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
	
	

		
		//ʱ
		private int hour;
		
		//��
		private int minute;
		
		//��
		private int second;
		
		
		//�вι��췽������ʼ����Ա����
		public MyTime(int hour,int minute,int second) {
			this.hour = hour;
			this.minute = minute;
			this.second = second;
		}
		
		//�޲ι��췽��
		public MyTime() {
			
		}
		
		//�����
		public void addSecond(int sec){
			//������
			second=second+sec;
			
			//�����60���������
			if(second>=60) {
				
				//�������ӵķ�
				int mi = second/60;
				
				minute+=mi;
				
				//minute������ʮ��ʱ����
				if(minute>=60) {
					int hr = minute/60;
					hour+=hr;
					
					//��Ҫ��ʱ�����жϣ����ʱ��24�����24
					if(hour>=24) {
						hour %=24; 
					}
					
					//���·�
					minute = minute%60;
				}
				
				//������
				second = second%60; 
				
			}
		}
		
		
		//���ӷ�
		public void addMinute(int mi) {
			
			//����
			minute+=mi;
			
			//����ִ��ڵ���60�����λ
			if(minute>=60) {
				
				//�������ӵ�Сʱ��
				int hr = minute/60;
				
				//����ʱ
				hour+=hr;
				
				//���ʱ����24����-24
				if(hour>=24) {
					hour = hour%24;
				}
				
				//���·�
				minute %=60;
			}
			
		}
		
		//����ʱ
		public void addHour(int hr) {
			//����ʱ����
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
		System.out.println("�����ǣ�"+hour+"ʱ"+minute+"��"+second+"��");
	}
	


}
