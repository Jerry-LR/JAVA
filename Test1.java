package com.jerry.clas;

public class Test1 {
	public static void main(String[] args) {
		MyTime MyTime=new MyTime(3,4,5);
	    MyTime.addSecond(3000);
	    MyTime.addMinute(180);
	    MyTime.subHour(8);
	    MyTime.subMinute(56);
	    MyTime.subSecond(35);
		MyTime.diaplay();
	}

}
