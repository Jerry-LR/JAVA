package com.jerry.animal;

public class Animal {
	public static String name;
	public Animal() {}
	public  Animal(String name) {
		this.name=name;
		
	}
	public static void eat()
	{
		System.out.println(name+"³Ô"+Food.name);
	}

}
