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
		//��������
		Map map=new HashMap();
		//���ֵ��
		map.put(01, "����");
		map.put(02, "����");
		map.put(05, "����");
		//��ȡ���ݡ�
		//String name = (String) map.get(01);
		//�޸ġ�
		map.put(04, "����");
		map.replace(05, "����");
		
		//�Ƴ���
		//map.remove(04);
		String name = (String) map.get(04);
		
		//������
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
