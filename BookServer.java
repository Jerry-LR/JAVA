package com.jerry.server;

import java.util.List;
import java.util.Scanner;

import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;

import com.jerry.pojo.Book;
import com.jerry.util.XmlUtil;

public class BookServer {
	private Scanner scanner =new Scanner(System.in);
	 
	private static Element root;
	private static XmlUtil util = new XmlUtil();
	private static Document document;
	private static String path="xml\\Book.xml";
	
	static {
		//����һ���ļ�
		DocumentFactory factory=new DocumentFactory();
		document=factory.createDocument();
		root=document.addElement("Book");
		util.write(document,path);
	}
	
	
	public void caiDan() {
		//�������
		while(true) {
		
		System.out.println("----------��ӭ����ͼ�����ϵͳ----------");
		System.out.println("��ѡ����Ĳ�����");
		System.out.println("1.ע��  ");
		System.out.println("2.��¼  ");
		System.out.println("3.�˳�ϵͳ  ");
		String in=scanner.next();
		if(in.equals("1")) {
			boolean bl=zhuce();
			if(bl)
			{
				System.out.println("ע��ɹ�");
			}else {
				System.out.println("ע��ʧ��");
			}
		}else if(in.equals("2")){
			System.out.println("��û����");
		}else if(in.equals("3")) {
			System.out.println("��û����");
		}
		}
	}
	
	
	public boolean zhuce() {
		//����ע�������
		Book book=new Book();
		System.out.println("�������û�����");
		String username= scanner.next();
		book.setUsername(username);
		
		boolean bl=chachong(username);
		if(bl==false)
		{
			return false;
		}
		
		
		System.out.println("���������룺");
		String password= scanner.next();
		book.setPassword(password);
		System.out.println("������绰��");
		String phone= scanner.next();
		book.setPhone(phone);
		System.out.println("������������");
		String name= scanner.next();
		book.setName(name);
		String a="1000"+book.getId();
		book.setNum(a);
		
		//���Ҹ�Ԫ�أ����û����Լ�����Ԫ����
		Element element =root.addElement("Book");
		String la=((Integer)book.getId()).toString();
		
		element.addElement("name").addText(book.getName());
		element.addElement("username").addText(book.getUsername());
		element.addElement("password").addText(book.getPassword());
		element.addElement("phone").addText(book.getPhone());
		element.addElement("id").addText(la);
		element.addElement("num").addText(book.getNum());
		util.write(document, path);
		return true;
		
	}
	
	public boolean chachong(String username) {
		//��ȡ���й���Ա��ǩ
				List<Element> list = root.elements();
				for (Element element : list) {
					if(element.element("username").getText().equals(username)) {
						return false;
					}
				}
				return true;
		
	}
	
	
	

}
