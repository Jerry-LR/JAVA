package com.jerry.jihe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JiHe {
	public static void main(String[] args) {
		new JiHe().testList();
	}
	public void testList() {
		//����list����
		List list=new ArrayList();
		List li=new ArrayList(8);
		List ls=new ArrayList(list);
		//��ֵ
		list.add("����");
		list.add(55);
		ls.add("����");
		ls.add(22);
		//��һ�������е����ݴ浽��һ�������С�
		li.addAll(list);
		System.out.println(li.size());
		System.out.println(li.get(1));
		//�޸�
		li.set(1, 21);
		System.out.println(li.get(1));
		//forѭ����������
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		//��ǿforѭ����
		for(Object object:list)
		{
			System.out.println(object);
		}
		//iterator������ȡ���������󣬽��в�����
		Iterator iterator=list.iterator();
		while(iterator.hasNext()) {
			Object obj=iterator.next();
			System.out.println(obj);
		}
		//���б���ɾ������Ԫ�ء�
		li.clear();
		//���б����ָ����Ԫ�أ��򷵻� true ��
		list.contains("����");
		System.out.println(list.contains("����"));
		//������б�����Ԫ�أ��򷵻� true �� 
		li.isEmpty();
		System.out.println(li.isEmpty());
		//ɾ�����б���ָ��λ�õ�Ԫ�ء�ɾ��֮���������ٻ�ֱ����ǰ��䡣
		ls.remove(0);
		System.out.println(ls.get(0));
		//��ָ����Ԫ���滻���б���ָ��λ�õ�Ԫ�ء�
		ls.set(0, "����");
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
