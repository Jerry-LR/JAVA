package com.jerry.Xml;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class XmlService {
		//解析xml文件
	public void parse() {
		//创建解析器对象
		SAXReader reader =new SAXReader();
		
		//提供文件对象
		File xmlFile=new File("sss\\hello.xml");
		
		try {
			//通过解析器读取文件并形成文件内容的文档对象
			Document document =reader.read(xmlFile);
			//获取根元素
			Element root =document.getRootElement();
			
			//打印根元素
			System.out.println("根元素"+root.getName());
			//获取根元素的子元素
			//获取所有子元素
			List<Element> list=root.elements();
			for (Element element : list) {
				System.out.println("根元素的子元素:"+element.getName());
			}
			//根据元素名获取单个子元素
			Element element=root.element("student1");
			System.out.println(element.getStringValue());
			//获取元素的属性
			Attribute attr=root.element("student3").attribute("name");
			//获取属性值
			String value = attr.getValue();
			System.out.println(value);
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		}
	
	
	//修改文档内容
	public void write() {
		//创建解析器对象
		SAXReader reader =new SAXReader();
		
		try {
			//获取文档内容
			Document document = reader.read(new File("sss\\hello.xml"));
			System.out.println(document.getXMLEncoding());
			
			//获取根元素
			Element root = document.getRootElement();
			
			//获取子元素student3的子元素属性name
			Attribute name = root.element("student3").attribute("name");
			
			//修改内容
			name.setValue("haha");
			System.out.println(name.getStringValue());
			
			//根元素添加子元素
			root.addElement("student4");
			
			//给根元素添加子元素和子元素属性
			Element el = root.addElement("student4");
			/*el.addAttribute("name", "老六");
			el.addAttribute("age", "21");
			
			System.out.println(el.attributeValue("name"));
			*/
			//删除元素
			List<Element> list=root.elements("student4");
			for (Element element : list) {
				root.remove(element);
				}
			System.out.println(el.attributeValue("name"));
		
			//重新写出文档内容
			XMLWriter write = new XMLWriter(new FileWriter("sss\\hello.xml"));
		
			write.write(document);
			write.close();
		
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
}
