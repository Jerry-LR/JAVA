package com.jerry.lianxi9;

public class Bus implements Vehicle{
	@Override
	public void start(String a) {
		// TODO Auto-generated method stub
		System.out.println(a+"��������ʼ��");
	}
	@Override
	public void stop(String b) {
		// TODO Auto-generated method stub
		System.out.println(b+"������ͣ��");
	}
}
