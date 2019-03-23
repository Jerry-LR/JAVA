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
		//直接通过Object来创建对象。
		Object obj=new Object();
		//通过任意一个类的对象向上转型。
		Object obj1=new LeiKu();
		//返回对象的地址字符串。
		
		//System.out.println(obj.toString());
		//复制当前对象的内容，创建一个新的同类型对象。
		/*Dsad a=new Dsad(10,"aa");
		Dsad c =(Dsad) a.clone();
		System.out.println(c.c);
		System.out.println(c.d);*/
		LeiKu a=new LeiKu("abcdefg","abc");
		LeiKu b=(LeiKu) a.clone();
		//System.out.println(b);
		//比较两个对象的内容。
		LeiKu bijiao=new LeiKu("abcdefg","abc");
		boolean bl=bijiao.equals(a);
				System.out.println(bl);																					
		
		
		
		
		
	}

	

}
