package com.zdke.duixiang;

public class Dog {
	public String name;
	
	public int age;
	public char sex;
	public char daxiao;
	
	public Dog() {};
	public Dog(char sex ) {
			
			
			this.sex=sex;
		}
	Dog(int age){
		this.age=age;
	}
	protected Dog(String name){
		this.name=name;
	}
	public char tixing() {
		return '´ó';
		
	}
	
}
