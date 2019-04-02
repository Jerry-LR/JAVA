package com.jerry.suo;

public class Suo {
	private Object obj1;
	private Object obj2;
	public Suo(Object obj1, Object obj2) {
		super();
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	public void a(Object obj1,Object obj2) {
		synchronized (obj2) {
			System.out.println("这是010");
			synchronized (obj1) {
			System.out.println("这是020");	
			}
			
		}
	}
	public void b(Object obj1,Object obj2) {
		synchronized (obj2) {
			System.out.println("这是001");
			synchronized (obj1) {
			System.out.println("这是002");	
			}
			
		}
	}
	
	
	
	
}
