package com.jerry.suo;

public class Thread1 extends Thread {
	private Object obj1;
	private Object obj2;
	public Thread1(Object obj1, Object obj2) {
		super();
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	
	@Override
	public void run() {
		synchronized (obj1) {
			System.out.println("这是001");
			synchronized (obj2) {
			System.out.println("这是002");	
			}
			
		}
		
	}

}
