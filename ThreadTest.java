package com.jerry.xiancheng;

public class ThreadTest extends Thread{
	private Thread thread;
	public ThreadTest() {
		// TODO Auto-generated constructor stub
	}
	public ThreadTest(Thread thread) {
		 this.thread = thread;
	}
	@Override
public void run() {
	for (int i = 0; i < 100; i++) {
		System.out.println("线程2: 第"+i+"次运行");
		/*if (i==10)
		{
			try {
				new Thread().sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		
		
		if(i==10)
	{
		try {
			thread.join(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	}
}
}
