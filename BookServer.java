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
		//创建一个文件
		DocumentFactory factory=new DocumentFactory();
		document=factory.createDocument();
		root=document.addElement("Book");
		util.write(document,path);
	}
	
	
	public void caiDan() {
		//检测输入
		while(true) {
		
		System.out.println("----------欢迎进入图书管理系统----------");
		System.out.println("请选择你的操作：");
		System.out.println("1.注册  ");
		System.out.println("2.登录  ");
		System.out.println("3.退出系统  ");
		String in=scanner.next();
		if(in.equals("1")) {
			boolean bl=zhuce();
			if(bl)
			{
				System.out.println("注册成功");
			}else {
				System.out.println("注册失败");
			}
		}else if(in.equals("2")){
			System.out.println("还没做完");
		}else if(in.equals("3")) {
			System.out.println("还没做完");
		}
		}
	}
	
	
	public boolean zhuce() {
		//进行注册操作。
		Book book=new Book();
		System.out.println("请输入用户名：");
		String username= scanner.next();
		book.setUsername(username);
		
		boolean bl=chachong(username);
		if(bl==false)
		{
			return false;
		}
		
		
		System.out.println("请输入密码：");
		String password= scanner.next();
		book.setPassword(password);
		System.out.println("请输入电话：");
		String phone= scanner.next();
		book.setPhone(phone);
		System.out.println("请输入姓名：");
		String name= scanner.next();
		book.setName(name);
		String a="1000"+book.getId();
		book.setNum(a);
		
		//查找根元素，将用户属性加入子元素中
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
		//获取所有管理员标签
				List<Element> list = root.elements();
				for (Element element : list) {
					if(element.element("username").getText().equals(username)) {
						return false;
					}
				}
				return true;
		
	}
	
	
	

}
