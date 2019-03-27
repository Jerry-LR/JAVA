package com.jerry.file;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args)  {
	new FileTest().test();	
	}
	public void test() {
		//����file����
		File file =new File ("D:\\test\\a\\b.txt");
		//boolean a=file.exists();
		//ͨ����Ա��������ȡ�ļ�����Ϣ.
		String path =file.pathSeparator;
		char pathChar=file.pathSeparatorChar;
		System.out.println(path+" "+pathChar);
		//��ȡ�ļ���Ϣ
		String fileName=file.getName();
		System.out.println(fileName);
		String realPath=file.getPath();
		System.out.println(realPath);
		//�ж��ļ���Ϣ�ķ���
		boolean bl=file.isFile();//�ж��Ƿ���ͨ�ļ�
		boolean bll=file.isDirectory();//�ж��Ƿ����ļ��ж��󣬼�Ŀ¼����
		System.out.println(bl+" "+bll);
		//��ȡ�ļ��ֽڳ��ȡ�
		long length=file.length();
		System.out.println(length);
		//ɾ���ļ���
		//file.delete();
		try {
			//�����ļ���.
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
