package com.jerry.jihe;

import java.util.ArrayList;
import java.util.List;

public class JiHe1 {
	/*��֪��ʮ��֧��������Ӳμ�2008 �������˻ᡣ
	дһ�����򣬰���16 ֧��������Ϊ4 ���顣
	����	List���Ϻ������2008 �������˻������
	�����ң� ���ص��ߣ�����͢���Ĵ����ǣ�����ά�ǣ�
	�������������ǡ��ձ����������й������� ����
	��������	��ʱ������������¡���鶼��˹��
	�����*/
	public void LianXi1() {
		String a="���ص��ߣ�����͢���Ĵ����ǣ�����ά�ǣ��������������ǣ��ձ����������й������� ������������	��ʱ������������¡���鶼��˹�������";
		String[]b=a.split("��");
		List list=new ArrayList();
		for(Object object:b)
		{
			list.add(object);	
		}
		for (int i = 1; i < 5; i++) {
			System.out.println("��"+i+"���������£�");
			for (int j = 0; j < 4; j++) {
				int index =(int)(Math.random()*list.size());
				System.out.print(list.get(index)+" ");
				list.remove(index);
			}
			
			System.out.println("");
		}
	}
	
	public void LianXi2() {
		String a="���ص��ߣ�����͢���Ĵ����ǣ�����ά�ǣ��������������ǣ��ձ����������й���������������������ʱ������������¡���鶼��˹�������";
		String[]b=a.split("��");
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
