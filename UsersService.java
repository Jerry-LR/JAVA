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
	 *该方法为用户信息注册方法，参数user用于接收注册的用户信息 
	 *注册功能分析：注册功能需要保证用户的账户唯一，因此需要先拿输入的账户与已经用于的账户进行比对，
	 *			如果存现相同，则重新注册，如果无相同，则进行信息的添加（写入文件）
	 *步骤：
	 *	1、判断存储内容文件是否存在，不存在，则创建文件，并直接写入内容；已经存在，则获取已经拥有的内容，进行比较
	 *	2、根据处理结果进行结果响应。
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
					{//判断用户名是否相同，相同不准创建。
						if(user.getUsername().equals(userin.getUsername()))
						{
							return false;
						}
					}
					
				}else
					//判断路径是否存在，不存在则创建路径
					if(!pathFile.exists()) 
					{
						pathFile.mkdirs();
					}//创建文件
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
				
				System.out.println("请选择功能：");
				System.out.println("1、注册");
				System.out.println("2、登录");
				System.out.println("3、退出系统");
				int no = scanner.nextInt();
				
				switch(no) {
					case 1:		
					System.out.println("输入用户信息：");
					//键盘扫描对象
					
					System.out.println("账户：");
					String name = scanner.next();
					user.setUsername(name);
					
					System.out.println("密码：");
					String  password = scanner.next();
					user.setPassword(password);
					
					System.out.println("姓名：");
					user.setRealname(scanner.next());
					
					System.out.println("生日(格式为：1998-1-1)：");
					String birthday = scanner.next();
			
					Date birth = new SimpleDateFormat("yyyy-MM-dd").parse(birthday);
					user.setBirth(birth);
					//调用注册业务
					boolean bl = new UsersService().sss(user);
					if(bl) {
						System.out.println("注册成功");
					}else {
						System.out.println("账号已存在，请重新注册");
					}
					
					break;
					
					case 2:
						System.out.println("输入用户信息："); 
						System.out.println("账户：");
						String username = scanner.next();
						user.setUsername(username);
						System.out.println("密码：");
						String  uppassword = scanner.next();
						user.setPassword(uppassword);
						boolean bll = new SignUp().up(username, uppassword);
						if(bll) {
							System.out.println("登录成功");
						}else {
							System.out.println("登录失败");
						}
						break;
					case 3: System.out.println("退出本系统"); return;
				  }
			
			}
			} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
