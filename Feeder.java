package com.jerry.animal;

public class Feeder {
	public static String name;
	public Feeder() {}
	public Feeder(String name)
	{
		this.name=name;
	}
	public static void feed() {
		System.out.print(name+"ι");
	}

}
