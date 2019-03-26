package com.jerry.yichang;

public class ZiDingYiYiChang extends RuntimeException{
 public ZiDingYiYiChang() {
	 this("年龄必须大于17小于60");
 }
public ZiDingYiYiChang(String message)
{
	super(message);
	
	}
}
