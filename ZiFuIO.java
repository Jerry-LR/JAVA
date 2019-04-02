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
			//创建字符输入出流。
			Reader in=new FileReader("d:\\test\\a\\a.txt");
			Writer out=new FileWriter("d:\\test\\a\\b.txt");
			//创建字符输入输出流。
			BufferedReader bufferIn=new BufferedReader(in);
			BufferedWriter bufferOut=new BufferedWriter(out);
			//创建一个字符型的变量用来存储读取出的内容。
			String message =bufferIn.readLine();
			//如果文本内容不能一行输出完成，循环。条件为当字符型变量为空时。
			while(message!=null)
			{
				bufferOut.write(message);
				
				bufferOut.newLine();
				 message =bufferIn.readLine();
				
			}
			
			//关闭输入输出流
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
