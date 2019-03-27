package com.jerry.jihe;

import java.util.ArrayList;
import java.util.List;

public class JiHe1 {
	/*已知有十六支男子足球队参加2008 北京奥运会。
	写一个程序，把这16 支球队随机分为4 个组。
	采用	List集合和随机数2008 北京奥运会男足参
	赛国家： 科特迪瓦，阿根廷，澳大利亚，塞尔维亚，
	荷兰，尼日利亚、日本，美国，中国，新西 兰，
	巴西，比	利时，韩国，喀麦隆，洪都拉斯，
	意大利*/
	public void LianXi1() {
		String a="科特迪瓦，阿根廷，澳大利亚，塞尔维亚，荷兰，尼日利亚，日本，美国，中国，新西 兰，巴西，比	利时，韩国，喀麦隆，洪都拉斯，意大利";
		String[]b=a.split("，");
		List list=new ArrayList();
		for(Object object:b)
		{
			list.add(object);	
		}
		for (int i = 1; i < 5; i++) {
			System.out.println("第"+i+"组名单如下：");
			for (int j = 0; j < 4; j++) {
				int index =(int)(Math.random()*list.size());
				System.out.print(list.get(index)+" ");
				list.remove(index);
			}
			
			System.out.println("");
		}
	}
	
	public void LianXi2() {
		String a="科特迪瓦，阿根廷，澳大利亚，塞尔维亚，荷兰，尼日利亚，日本，美国，中国，新西兰，巴西，比利时，韩国，喀麦隆，洪都拉斯，意大利";
		String[]b=a.split("，");
		List list=new ArrayList();
		for(Object object:b)
		{
			list.add(object);	
		}
		for(int i=0;i<16;i++)
		{
			int index =(int)(Math.random()*list.size());
			if (i%4==0) {
				System.out.println("");
				
			}
			System.out.print(list.get(index)+" ");
			list.remove(index);
		}
	}
	
	public static void main(String[] args) {
		JiHe1 a=new JiHe1();
		a.LianXi2();
	}

}
