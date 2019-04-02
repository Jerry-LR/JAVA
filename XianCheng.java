package com.jerry.xiancheng;

public  class XianCheng {
	public static void main(String[] args)   {
		Thread thread =new ThreadTest();
		Runnable runnable = new RunableTest();
		Thread th2=new Thread(runnable);
		
		
		thread.start();
		th2.start();
	
	}

	
		
	}
	
		
	
	
	


