package com.jerry.lianxi9;

public class Bike implements Vehicle{
	@Override
	public void start(String b) {
		// TODO Auto-generated method stub
		System.out.println(b+"���г���ʼ��");
	}
	@Override
	public void stop(String a) {
		// TODO Auto-generated method stub
		System.out.println(a+"���г�ͣ��");
	}
}
