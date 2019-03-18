package com.jerry.clas;
//设计一个类Student，该类包括姓名、学号和成绩。设计一个方法，按照成绩从高到低的顺序输出姓名、学号和成绩信息
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
			System.out.println("姓名："+d[k].name+" "+" "+"学号"+d[k].num+"  "+"成绩"+d[k].chengji);
		}
		
	}
	
	

}
