package com.jerry.clas;

public class StudentTest {
	public static void main(String[] args) {
		Student st1=new Student("张三",24,88);
		Student st2=new Student("李四",22,99);
		Student st3=new Student("王五",26,66);
		Student paiming=new Student();
		paiming.chengji(st1, st2, st3);
	}

}
