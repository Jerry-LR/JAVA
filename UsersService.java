package com.jerry.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.jerry.pojo.Users;
import com.jerry.signup.SignUp;
import com.jerry.util.GongJu;

/*
	 *�÷���Ϊ�û���Ϣע�᷽��������user���ڽ���ע����û���Ϣ 
	 *ע�Ṧ�ܷ�����ע�Ṧ����Ҫ��֤�û����˻�Ψһ�������Ҫ����������˻����Ѿ����ڵ��˻����бȶԣ�
	 *			���������ͬ��������ע�ᣬ�������ͬ���������Ϣ����ӣ�д���ļ���
	 *���裺
	 *	1���жϴ洢�����ļ��Ƿ���ڣ������ڣ��򴴽��ļ�����ֱ��д�����ݣ��Ѿ����ڣ����ȡ�Ѿ�ӵ�е����ݣ����бȽ�
	 *	2�����ݴ��������н����Ӧ��
	 */
public class UsersService {
	public boolean sss(Users user) {
		try {
				File userFile=new File("d:\\test\\b.txt");
				File pathFile = userFile.getParentFile();
				List<Users> list =new ArrayList<Users>();
				if (userFile.exists()) 
				{
					
					InputStream in=new FileInputStream(userFile);
					ObjectInputStream objectIn= new ObjectInputStream(in);
					list=(List<Users>) objectIn.readObject();
					for(Users userin:list)
					{//�ж��û����Ƿ���ͬ����ͬ��׼������
						if(user.getUsername().equals(userin.getUsername()))
						{
							return false;
						}
					}
					
				}else
					//�ж�·���Ƿ���ڣ��������򴴽�·��
					if(!pathFile.exists()) 
					{
						pathFile.mkdirs();
					}//�����ļ�
		            userFile.createNewFile();
		            list.add(user);
		            new GongJu().writer(list,"d:\\users\\users.txt");
					
		    }
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return true;
}
	public void caidan() {
		try {
			while(true) {
		
				Scanner scanner = new Scanner(System.in);
				Users user = new Users();
				
				System.out.println("��ѡ���ܣ�");
				System.out.println("1��ע��");
				System.out.println("2����¼");
				System.out.println("3���˳�ϵͳ");
				int no = scanner.nextInt();
				
				switch(no) {
					case 1:		
					System.out.println("�����û���Ϣ��");
					//����ɨ�����
					
					System.out.println("�˻���");
					String name = scanner.next();
					user.setUsername(name);
					
					System.out.println("���룺");
					String  password = scanner.next();
					user.setPassword(password);
					
					System.out.println("������");
					user.setRealname(scanner.next());
					
					System.out.println("����(��ʽΪ��1998-1-1)��");
					String birthday = scanner.next();
			
					Date birth = new SimpleDateFormat("yyyy-MM-dd").parse(birthday);
					user.setBirth(birth);
					//����ע��ҵ��
					boolean bl = new UsersService().sss(user);
					if(bl) {
						System.out.println("ע��ɹ�");
					}else {
						System.out.println("�˺��Ѵ��ڣ�������ע��");
					}
					
					break;
					
					case 2:
						System.out.println("�����û���Ϣ��"); 
						System.out.println("�˻���");
						String username = scanner.next();
						user.setUsername(username);
						System.out.println("���룺");
						String  uppassword = scanner.next();
						user.setPassword(uppassword);
						boolean bll = new SignUp().up(username, uppassword);
						if(bll) {
							System.out.println("��¼�ɹ�");
						}else {
							System.out.println("��¼ʧ��");
						}
						break;
					case 3: System.out.println("�˳���ϵͳ"); return;
				  }
			
			}
			} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
