package com.jerry.leiku;


public class LeiKu  implements Cloneable{
	String num="abcdefg";
	String numbwe="abc";
	String lala="abc";
	public LeiKu() {};
	public LeiKu(String num,String number) {
		this.num=num;
		this.numbwe=number;
	}
	
	public LeiKu(String lala) {
		this.lala=lala;
	}

	
	public static void main(String[] args) throws CloneNotSupportedException {
		//ֱ��ͨ��Object����������
		Object obj=new Object();
		//ͨ������һ����Ķ�������ת�͡�
		Object obj1=new LeiKu();
		//���ض���ĵ�ַ�ַ�����
		
		//System.out.println(obj.toString());
		//���Ƶ�ǰ��������ݣ�����һ���µ�ͬ���Ͷ���
		/*Dsad a=new Dsad(10,"aa");
		Dsad c =(Dsad) a.clone();
		System.out.println(c.c);
		System.out.println(c.d);*/
		LeiKu a=new LeiKu("abcdefg","abc");
		LeiKu b=(LeiKu) a.clone();
		//System.out.println(b);
		//�Ƚ�������������ݡ�
		LeiKu bijiao=new LeiKu("abcdefg","abc");
		boolean bl=bijiao.equals(a);
				System.out.println(bl);																					
		
		
		
		
		
	}

	

}
