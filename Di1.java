package com.jerry.ceshi;

public class Di1 {
	public static void main(String[] args) {
		int a=1;
		double b=2.0;
		//��a��ֵ��b
		 b=a;
		 System.out.println(b);
		 //�ӵͼ������߼���ת��ֱ�ӿ���ת�������Զ�ת��
		 //��b��ֵ��a,������bǰ����ϣ�int����Ȼ���������
		 a=(int)b;
		 System.out.println(a);
		 //�Ӹ߼������ͼ���ת�����������ʧȥ׼ȷ�ԣ����Ա���Ҫת��ʱ��Ҫʹ��ǿ��ת����
	}

}
