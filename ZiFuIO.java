package com.jerry.zifuio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ZiFuIO {
	public static void main(String[] args) {
		ZiFuIO a=new ZiFuIO();
		a.buffer();
	}
	public void ZiFuIO() {}
	public void ziFu() {
		try {
			Reader in=new FileReader("d:\\test\\a\\b.txt");
			Writer out=new FileWriter("d:\\test\\a\\a.txt");
			int i=in.read();
			while(i!=-1)
			{
				out.write(i);
				i=in.read();
			}
			out.close();
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void buffer() {
		try {
			//�����ַ����������
			Reader in=new FileReader("d:\\test\\a\\a.txt");
			Writer out=new FileWriter("d:\\test\\a\\b.txt");
			//�����ַ������������
			BufferedReader bufferIn=new BufferedReader(in);
			BufferedWriter bufferOut=new BufferedWriter(out);
			//����һ���ַ��͵ı��������洢��ȡ�������ݡ�
			String message =bufferIn.readLine();
			//����ı����ݲ���һ�������ɣ�ѭ��������Ϊ���ַ��ͱ���Ϊ��ʱ��
			while(message!=null)
			{
				bufferOut.write(message);
				
				bufferOut.newLine();
				 message =bufferIn.readLine();
				
			}
			
			//�ر����������
			bufferOut.close();
			bufferIn.close();
			out.close();
			in.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
}
