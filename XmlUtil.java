package com.jerry.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class XmlUtil {
	private String encoding="GBK";
	public void write(Document document,String path) {
		//判断路径是否存在
		File file =new File(path);
		File pathFile=file.getParentFile();
		if(!pathFile.exists())
		{
			pathFile.mkdirs();
		}
		//设置输出流字符集
		OutputFormat format=new OutputFormat();
		format.setEncoding(encoding);
		
		
		try {
			//获取xml输出流
			XMLWriter writer=new XMLWriter(new FileWriter(file),format);
			//输出
			writer.write(document);
			
			writer.close();
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
