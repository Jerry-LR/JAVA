package com.jerry.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Date;

public class TestObjectOutputStream {

	public void outStudent() {
		//����ѧ������
		Student student =new Student();
		student.setName("����");
		student.setId(657567575);
		student.setBirth(new Date());
		Student student1 = new Student();
		student1.setId(23213213);
		student1.setName("����");
		student1.setBirth(new Date());
		
		try {
			//�����������
			OutputStream out=new FileOutputStream("d:\\test\\student.txt");
			//���������������
			ObjectOutputStream objectOut=new ObjectOutputStream(out);
			//�������
			objectOut.writeObject(student);
			objectOut.writeObject(student1);
			//�ر������ͷ���Դ
			objectOut.close();
			out.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		TestObjectOutputStream a=new TestObjectOutputStream();
		a.outStudent();
	}
	
}
