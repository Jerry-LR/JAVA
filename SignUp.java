package com.jerry.signup;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import com.jerry.pojo.Users;

/*
 * 登录功能
 * 先将数据提取出来，进行对比，如果账号密码全部相同，允许登录，有一个不相同，不许登录。
 */


public class SignUp {
	public boolean up(String username,String password)
	{
		try {
			List<Users> list=new ArrayList<Users>();
		File file =new File("d:\\test\\b.txt");
		InputStream in=new FileInputStream(file);
		ObjectInputStream objectin=new ObjectInputStream(in);
		list=(List<Users>) objectin.readObject();
		for(Users user1:list)
		{
			if(user1.getUsername().equals(username)&&user1.getPassword().equals(password))
			{
				return true;
			}
		}
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		return false;
		
	}

}
