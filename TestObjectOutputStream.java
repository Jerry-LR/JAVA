package com.jerry.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Date;

public class TestObjectOutputStream {

	public void outStudent() {
		//创建学生对象。
		Student student =new Student();
		student.setName("张三");
		student.setId(657567575);
		student.setBirth(new Date());
		Student student1 = new Student();
		student1.setId(23213213);
		student1.setName("李四");
		student1.setBirth(new Date());
		
		try {
			//创建输出流；
			OutputStream out=new FileOutputStream("d:\\test\\student.txt");
			//创建对象输出流；
			ObjectOutputStream objectOut=new ObjectOutputStream(out);
			//输出内容
			objectOut.writeObject(student);
			objectOut.writeObject(student1);
			//关闭流，释放资源
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
