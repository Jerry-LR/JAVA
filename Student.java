package com.jerry.clas;
//���һ����Student���������������ѧ�źͳɼ������һ�����������ճɼ��Ӹߵ��͵�˳�����������ѧ�źͳɼ���Ϣ
public class Student {
	String name;
	int num;
	int chengji;
	public Student() {};
	public Student(String name,int num,int chengji) {
		this.chengji=chengji;
		this.name=name;
		this.num=num;
	}
	public void chengji(Student a,Student b,Student c) {
		Student[]d= {a,b,c};
		for(int i=0;i<d.length;i++)
		{
			for(int j=i+1;j<d.length;j++)
			{
				if(d[i].chengji<d[j].chengji)
				{
					Student temp;
					temp=d[i];
					d[i]=d[j];
					d[j]=temp;
					
				}
			}
		}
		for(int k=0;k<d.length;k++)
		{
			System.out.println("������"+d[k].name+" "+" "+"ѧ��"+d[k].num+"  "+"�ɼ�"+d[k].chengji);
		}
		
	}
	
	

}
