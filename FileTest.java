package com.jerry.file;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args)  {
	new FileTest().test();	
	}
	public void test() {
		//创建file对象。
		File file =new File ("D:\\test\\a\\b.txt");
		//boolean a=file.exists();
		//通过成员变量，获取文件的信息.
		String path =file.pathSeparator;
		char pathChar=file.pathSeparatorChar;
		System.out.println(path+" "+pathChar);
		//获取文件信息
		String fileName=file.getName();
		System.out.println(fileName);
		String realPath=file.getPath();
		System.out.println(realPath);
		//判断文件信息的方法
		boolean bl=file.isFile();//判断是否普通文件
		boolean bll=file.isDirectory();//判断是否是文件夹对象，即目录对象。
		System.out.println(bl+" "+bll);
		//获取文件字节长度。
		long length=file.length();
		System.out.println(length);
		//删除文件。
		//file.delete();
		try {
			//创建文件夹.
			File pathFile =new File("D:\\test\\a\\g");
					pathFile.mkdirs();
					file.createNewFile();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
		//System.out.println(a);
	}

}
