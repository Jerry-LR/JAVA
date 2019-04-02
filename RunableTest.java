package com.jerry.xiancheng;

import javax.swing.plaf.SliderUI;

public class RunableTest implements Runnable {
private Thread thread;
public RunableTest() {
	// TODO Auto-generated constructor stub
}
public RunableTest(Thread thread) {
	 this.thread = thread;
}
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("线程1: 第"+i+"次运行");
		/*if(i==10)
		{
			try {
				new Thread().sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		}
	}

}
