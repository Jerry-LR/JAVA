package com.jerry.ceshi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class ShiXian {
	
	static {
		List<T1> list=new ArrayList<T1>();
		try {
			T1 book=new T1("���","����",1);
			list.add(book);
			T1 book1=new T1("���","����",1);
			list.add(book1);
			T1 book2=new T1("��úú�","����",1);
			list.add(book2);
			T1 book3=new T1("��úúú�","����",1);
			list.add(book3);
			T1 book4=new T1("��úúúú�","����",1);
			list.add(book4);
			T1 book5=new T1("��úúúúú�","����",1);
			list.add(book5);
			T1 book6=new T1("��úúúúúú�","����",1);
			list.add(book6);
			T1 book7=new T1("��úúúúúúú�","����",1);
			list.add(book7);
			T1 book8=new T1("��úúúúúúúú�","����",1);
			list.add(book8);
			T1 book9=new T1("��úúúúúúúúú�","�Ű�",1);
			list.add(book9);
		File file=new File("D:\\test\\book.txt");
		if(!file.getParentFile().exists())
		{
			file.getParentFile().mkdirs();
		}
		
			file.createNewFile();
			OutputStream out=new FileOutputStream(file);
			ObjectOutputStream objout=new ObjectOutputStream(out);
			for (T1 t1 : list) {
				objout.writeObject(t1);
				
			}
		objout.close();
				out.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public void chaxun() {
		try {
		List<T1> list=new ArrayList<T1>();
		Scanner scanner =new Scanner(System.in);
		System.out.println("��������Ҫ���ҵ�������");
		String a=scanner.next();
		InputStream in;
			in = new FileInputStream("D:\\test\\book.txt");
			ObjectInputStream object=new ObjectInputStream(in);
			list.add((T1) object.readObject());
			for (T1 t1 : list) {
				if(t1.name.equals(a))
				{
					System.out.println("����:"+t1.name+"������:"+t1.writer+"�۸�:"+t1.price);
				}
			}
			
			
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
	
	
	
}
