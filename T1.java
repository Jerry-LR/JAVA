package com.jerry.ceshi;

import java.io.Serializable;

public class T1 implements Serializable{
	public  String name;
	public  String writer;
	public double price;
	public T1() {}
	public T1(String name,String writer,double price) { 
	this.name=name;
	this.writer=writer;
	this.price=price;
	
}
}