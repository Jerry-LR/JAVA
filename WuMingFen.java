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
		System.out.println("�����ǣ�"+theMa+"�۵ķ�����"+quantity+"��"+"������"+likeSoup);
	}
	

}
