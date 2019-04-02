package com.jerry.suo;

public class Test {
	public static void main(String[] args) {
		Object obj1=new Object();
		Object obj2=new Object();
		
		Thread th1=new Thread1(obj1,obj2);
		Runnable th2=new Thread2(obj1, obj2);
		Thread th3=new Thread(th2);
		th1.start();
		th3.start();
		
		
	}

}
