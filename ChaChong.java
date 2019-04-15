import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.HashSet;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Server {
	//创建三个文件对象
	public File path1=new File("d:\\test\\payment1.txt");
	public File path2=new File("d:\\test\\payment2.txt");
	public File path3=new File("d:\\test\\payment3.txt");

	//进行两个文件之间的对比
	public void DuiBi() {
		/*创建三个文件用来存储内容，
		set1存储payment1.txt中的内容，
		set2存储payment2.txt中的内容，
		set3存储set1，或者set2中的备份，方便对比。
		*/
	
		Set<String> set1=new HashSet<String>();
		Set<String> set2=new HashSet<String>();
		Set<String> set3=new HashSet<String>();
		try {
			//创建文件输入流，将文件payment1中的内容读取到set1，set3集合中。
			Reader reader1 = new FileReader(path1);
			BufferedReader  bfReader1 = new BufferedReader(reader1);
			String a = bfReader1.readLine();
			while(a!=null)
			{
				set1.add(a);
				set3.add(a);
				//按行读取
				a = bfReader1.readLine();
			}
			
			//关闭资源流
			reader1.close();
			bfReader1.close();
			
			//创建文件输入流，将文件payment1中的内容读取到set2集合中。
			Reader reader2 = new FileReader(path2);
			BufferedReader  bfReader2 = new BufferedReader(reader2);
			String b = bfReader2.readLine();
			while(b!=null)
			{
				set2.add(b);
				
				b = bfReader2.readLine();
			}
			
			//关闭资源流
			reader2.close();
			bfReader2.close();
			
			//对比两个集合得到不同内容
			set1.removeAll(set2);
			set2.removeAll(set3);
			
			//创建文件输出流
			Writer writer = new FileWriter(path3);
			BufferedWriter bfWriter = new BufferedWriter(writer);
			
			//通过遍历将set1中的与set2不同的内容写到payment3.txt中去。
			for (String string : set1) {
				bfWriter.write(string+"\r\n");			
				bfWriter.newLine();
				bfWriter.flush();
			}
			
			//通过遍历将set2中的与set1不同的内容写到payment3.txt中去。
			for (String string : set2) {
				bfWriter.write(string+"\r\n");			
				bfWriter.newLine();
				bfWriter.flush();
			}
			
			//关闭资源流
			writer.close();
			bfWriter.close();	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Server a=new Server();
		a.DuiBi();
	}
}
