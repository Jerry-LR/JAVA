package com.jerry.di2;

public class Di2 {
	public void zifucishu(String a)
	{
		//2�����һ������������һ���ַ�����ÿ���ַ��ĳ��ִ�����
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
	
	//4������һ��Ӣ�����ж��ٸ�Сд��ĸ����д��ĸ�Լ����������֡�
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
		System.out.print("��д��"+daxie+" Сд��"+xiaoxie+" ���֣�"+shuzi);
		
	}
	//6�����ҡ�Hello world���г��ִ��������ַ�
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
		System.out.println("���ִ��������ǣ�"+g.charAt(c)+"  ������"+x+"��");
	}
	public static void main(String[] args) {
		Di2 c=new Di2();
		//c.zifucishu("dsafjdlksjfjdsafsaj");
		//c.Tongji("dsasda09808ADSA");
		c.zuiduo("Hoab Worlll");
	}

}
