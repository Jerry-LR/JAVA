package com.jerry.di2;

public class Di2 {
	public void zifucishu(String a)
	{
		//2、设计一个方法，查找一个字符串中每个字符的出现次数。
		char[] b = a.toCharArray();
		
		for(int i=0;i<b.length;i++)
		{
			int k=0;
			if(i!=0) {
				String ZhiQianDe=new String(b,0,i);
				String z=String.valueOf(b[i]);
				boolean bl=ZhiQianDe.contains(z);
				if(bl) {
					continue;
				}
			}
			for(int j=0;j<b.length;j++)
			{
				if(b[i]==b[j]) k+=1;
			}
			System.out.println(b[i]+" "+k);
		}
	}
	
	//4、计算一段英语中有多少个小写字母，大写字母以及阿拉伯数字。
	public void Tongji(String english) {
		int daxie=0;
		int xiaoxie=0;
		int shuzi=0;
		for(int i=0;i<english.length();i++)
		{
			int a=english.charAt(i);
			if(a>='A'&&a<='Z') {
				daxie++;
			}else if(a>='a'&&a<='z')
			{
				xiaoxie++;
			}else if(a>='0'&&a<='9') {
				shuzi++;
			}
			}
		System.out.print("大写："+daxie+" 小写："+xiaoxie+" 数字："+shuzi);
		
	}
	//6、查找”Hello world”中出现次数最多的字符
	public void zuiduo(String g) {
char[] b = g.toCharArray();
int x=0;
int c=0;
int[] a=new int[b.length];
		for(int i=0;i<b.length;i++)
		{
			int k=0;
			
			if(i!=0) {
				String ZhiQianDe=new String(b,0,i);
				String z=String.valueOf(b[i]);
				boolean bl=ZhiQianDe.contains(z);
				if(bl) {
					continue;
				}
			}
			for(int j=0;j<b.length;j++)
			{
				if(b[i]==b[j]) k+=1;
			}
			a[i]=k;
			System.out.println(b[i]+" "+k);
			if(x<a[i])
			{
				x=a[i];
				c=i;
			}
			
		}
		System.out.println("出现次数最多的是："+g.charAt(c)+"  出现了"+x+"次");
	}
	public static void main(String[] args) {
		Di2 c=new Di2();
		//c.zifucishu("dsafjdlksjfjdsafsaj");
		//c.Tongji("dsasda09808ADSA");
		c.zuiduo("Hoab Worlll");
	}

}
