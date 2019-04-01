package com.jerry.jihe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JiHe {
	public static void main(String[] args) {
		new JiHe().testList();
	}
	public void testList() {
		//创建list集合
		List list=new ArrayList();
		List li=new ArrayList(8);
		List ls=new ArrayList(list);
		//存值
		list.add("张三");
		list.add(55);
		ls.add("赵四");
		ls.add(22);
		//将一个集合中的内容存到另一个集合中。
		li.addAll(list);
		System.out.println(li.size());
		System.out.println(li.get(1));
		//修改
		li.set(1, 21);
		System.out.println(li.get(1));
		//for循环遍历集合
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		//增强for循环。
		for(Object object:list)
		{
			System.out.println(object);
		}
		//iterator方法获取迭代器对象，进行操作。
		Iterator iterator=list.iterator();
		while(iterator.hasNext()) {
			Object obj=iterator.next();
			System.out.println(obj);
		}
		//从列表中删除所有元素。
		li.clear();
		//此列表包含指定的元素，则返回 true 。
		list.contains("张三");
		System.out.println(list.contains("张三"));
		//如果此列表不包含元素，则返回 true 。 
		li.isEmpty();
		System.out.println(li.isEmpty());
		//删除该列表中指定位置的元素。删除之后后面的匀速会直接向前填充。
		ls.remove(0);
		System.out.println(ls.get(0));
		//用指定的元素替换此列表中指定位置的元素。
		ls.set(0, "赵四");
		System.out.println(ls.get(0));
		Object[] a=list.toArray();
		for(Object b:a)
		{
			System.out.println(b);
		}
		int f=(int) (Math.random()*15);
		System.out.println(f);
	}
	
}
