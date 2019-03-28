package com.jerry.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestObjectInputStream {
	public void in() {
		
		try {
			//创建字节输入流
			InputStream in=new FileInputStream("d:\\test\\student.txt");
			//创建对象输入流
			ObjectInputStream object=new ObjectInputStream(in);
			//输入对象
			/*Student student =(Student) object.readObject();
			System.out.println(student.getId()+student.getName()+student.getBirth());
			Student student1 =(Student) object.readObject();
			System.out.println(student1.getId()+student1.getName()+student1.getBirth());*/
			List<Student> list=new ArrayList<Student>();
			list.add((Student) object.readObject());
			Iterator iterator=list.iterator();
			while(iterator.hasNext()) {
				Student obj=(Student) iterator.next();
				
				
				System.out.println(obj.getName());
			}
			
			
			
			//关闭输入流
			object.close();
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new TestObjectInputStream().in();
		
		
	}

}
