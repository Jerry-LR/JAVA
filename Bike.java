package com.jerry.lianxi9;

public class Bike implements Vehicle{
	@Override
	public void start(String b) {
		// TODO Auto-generated method stub
		System.out.println(b+"自行车开始走");
	}
	@Override
	public void stop(String a) {
		// TODO Auto-generated method stub
		System.out.println(a+"自行车停下");
	}
}
