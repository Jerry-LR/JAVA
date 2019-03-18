package com.zfkj.duixiang;

public class WuMingFen {
	String theMa;
	int quantity;
	boolean likeSoup;
	public WuMingFen() {}
	public  WuMingFen(String rou,int num,boolean t) 
	{
		this.likeSoup=t;
		this.quantity=num;
		this.theMa=rou;
	}
	public  WuMingFen(String rou,int num)
	{
		this.quantity=num;
		this.theMa=rou;
	}
	public void check()
	{
		System.out.println("面码是："+theMa+"粉的分量："+quantity+"两"+"带汤吗"+likeSoup);
	}
	

}
