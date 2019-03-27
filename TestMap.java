package com.jerry.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestMap {	
	public static void main(String[] args) {
		//创建对象。
		Map map=new HashMap();
		//添加值。
		map.put(01, "张三");
		map.put(02, "赵四");
		map.put(05, "王五");
		//获取内容。
		//String name = (String) map.get(01);
		//修改。
		map.put(04, "王五");
		map.replace(05, "张三");
		
		//移除。
		//map.remove(04);
		String name = (String) map.get(04);
		
		//遍历。
		Set keys=map.keySet();
		for(Object key:keys)
		{
			System.out.println(key+" : "+map.get(key));
		}
		Collection values=map.values();
		for(Object object:values)
		{
			System.out.println(object);
		}
		List<String> list=new ArrayList<String>();
		list.add("nihao");
		list.add("dsa");
		list.add("dsada");
		String g=list.get(0);
		Set<Account> s=new HashSet<Account>();
		s.add(new Account(10.0,"21389082139821"));
		System.out.println(s.iterator()	);
		
		
		
		
		
	}

}
