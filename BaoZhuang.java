package com.jerry.baozhuanglei;


import java.util.Date;



public class BaoZhuang 
{	
	public static void main(String[] args)  {
	
		Object j=2;
		String k="abcdefg";
	
	int i=3;
	//Integer in=new Integer(i);
	Integer in=Integer.valueOf(i); 
	Integer.bitCount(i);//����ָ����intֵ�Ķ����Ʋ�������Ʊ�ʾ�е� int���� 
	int a=in.byteValue();//���ش�ֵ IntegerΪ byte�Ļ�������ת����
	in.floatValue();//���ش�ֵ IntegerΪ floatһ����Ԫת����
	in.toString();//��������ֵ��throws NumberFormatException
	in.hashCode();//������� Integer�Ĺ�ϣ�롣
	in.equals(j);//���˶�����ָ���Ķ�����бȽϡ� ������true���ҽ����ò�������null������Integer���������ͬintֵ��Ϊ�ö��� 
	Integer c=in.valueOf("213");
	//int num = Integer.getInteger("SIZE" , 5);
	//System.out.println(Integer.SIZE);
	double s=Math.ceil(3.33);//����ȡ����
	double g=Math.min(6, 10);//ȡ��С��
	double h=Math.pow(2, 0.5);//�˷���
	double l=Math.random();//�����;
	double z=Math.abs(-213);//ȡ����ֵ��
	double x=Math.sqrt(2);//ƽ������
	double v=Math.cbrt(2);//��������
	double b=Math.round(11.5);//�������룻
	//System.err.print(213);
	Date dt=new Date();
	dt.toString();//��ʽ������ת���ʽyyyy-mm-dd��
	
	
	
	System.out.println(dt.toString());
	}

	
}
