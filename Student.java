package com.jerry.jihe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*�ڶ��� ��
������Student ����
private String name;  
    	private int age;  
    	private int score;  
    	private String classNum; 
���У�classNum ��ʾѧ���İ�ţ����硰class05���� ������List List list = new ArrayList();
list.add(new Student(��Tom��, 18, 100, ��class05��));  
list.add(new Student(��Jerry��, 22, 70, ��class04��)); 
list.add(new Student(��Owen��, 25, 90, ��class05��)); 
list.add(new Student(��Jim��, 30,80 , ��class05��)); 
list.add(new Student(��Steve��, 28, 66, ��class06��));
list.add(new Student(��Kevin��, 24, 100, ��class04��));
�����list �Ļ����ϣ��������Ҫ�� 
1�� ��������ѧ����ƽ������
2�� ��������༶��ƽ����
*/
public class Student {
	private String name;  
	private int age;  
	private int score;  
	private String classNum;
	public Student() {}
	public Student(String name, int age, int score, String classNum) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
		this.classNum = classNum;
	}
	public void ssss() {
		List list = new ArrayList();
		float a=0;
		float b=0;
		float si=0;
		float sir=0;
		float wu=0;
		float wur=0;
		float l=0;
		float lr=0;
		 list.add(new Student("Tom", 18, 100, "class05"));  
		 list.add(new Student("Jerry", 22, 70, "class04")); 
		 list.add(new Student("Owen", 25, 90, "class05")); 
		 list.add(new Student("Jim", 30,80 , "class05")); 
		 list.add(new Student("Steve", 28, 66, "class06"));
		 list.add(new Student("Kevin", 24, 100, "class04"));
		 Iterator iterator=list.iterator();
			while(iterator.hasNext()) {
				Student obj=(Student) iterator.next();
				
				a+=obj.age;
				b=a/list.size();
				if(obj.classNum.contains("4"))
				{
					si+=obj.score;
					sir++;
				}else if (obj.classNum.contains("5"))
				{
					wu+=obj.score;
					wur++;
				}else if (obj.classNum.contains("6"))
				{
					l+=obj.score;
					lr++;
				}
				
	}System.out.println("����ѧ����ƽ������: "+b);
	 System.out.println("�����༶��ƽ����: "+"4�� : "+si/sir+" 5�� : "+wu/wur+" 6�� : "+l/lr);
			}
	public static void main(String[] args) {
		 
		Student a=new Student();
		a.ssss();
	
	}}


