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
		//����xml�ļ�
	public void parse() {
		//��������������
		SAXReader reader =new SAXReader();
		
		//�ṩ�ļ�����
		File xmlFile=new File("sss\\hello.xml");
		
		try {
			//ͨ����������ȡ�ļ����γ��ļ����ݵ��ĵ�����
			Document document =reader.read(xmlFile);
			//��ȡ��Ԫ��
			Element root =document.getRootElement();
			
			//��ӡ��Ԫ��
			System.out.println("��Ԫ��"+root.getName());
			//��ȡ��Ԫ�ص���Ԫ��
			//��ȡ������Ԫ��
			List<Element> list=root.elements();
			for (Element element : list) {
				System.out.println("��Ԫ�ص���Ԫ��:"+element.getName());
			}
			//����Ԫ������ȡ������Ԫ��
			Element element=root.element("student1");
			System.out.println(element.getStringValue());
			//��ȡԪ�ص�����
			Attribute attr=root.element("student3").attribute("name");
			//��ȡ����ֵ
			String value = attr.getValue();
			System.out.println(value);
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		}
	
	
	//�޸��ĵ�����
	public void write() {
		//��������������
		SAXReader reader =new SAXReader();
		
		try {
			//��ȡ�ĵ�����
			Document document = reader.read(new File("sss\\hello.xml"));
			System.out.println(document.getXMLEncoding());
			
			//��ȡ��Ԫ��
			Element root = document.getRootElement();
			
			//��ȡ��Ԫ��student3����Ԫ������name
			Attribute name = root.element("student3").attribute("name");
			
			//�޸�����
			name.setValue("haha");
			System.out.println(name.getStringValue());
			
			//��Ԫ�������Ԫ��
			root.addElement("student4");
			
			//����Ԫ�������Ԫ�غ���Ԫ������
			Element el = root.addElement("student4");
			/*el.addAttribute("name", "����");
			el.addAttribute("age", "21");
			
			System.out.println(el.attributeValue("name"));
			*/
			//ɾ��Ԫ��
			List<Element> list=root.elements("student4");
			for (Element element : list) {
				root.remove(element);
				}
			System.out.println(el.attributeValue("name"));
		
			//����д���ĵ�����
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
