package com.jerry.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IoLianXi {
	public void tupian() {
		//1��ȷ����ȡ���ļ�
				String pathi = "C:\\a\\a.jpg";
				String patho = "d:\\a\\c.jpg";
				try {
					//2�������������
					InputStream in = new FileInputStream(pathi);
					OutputStream out = new FileOutputStream(patho);
					//3����ȡ�ļ�����
					
					
					
					int i = in.read();
					 
					while(i!=-1) {
						i=in.read();
						out.write(i);
					}
					
					
					//4���ر������ͷ���Դ
					in.close();
					
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}}
	public static void main(String[] args) {
		IoLianXi a=new IoLianXi();
		a.tupian();
	}

}
	
			
				
		