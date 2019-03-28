package com.jerry.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import com.jerry.pojo.Users;

public class GongJu {
	public void writer(List<Users> list,String path) {
		
		try {
			OutputStream out = new FileOutputStream(path);
			ObjectOutputStream objectOut = new ObjectOutputStream(out);
			objectOut.writeObject(list);
			objectOut.close();
			out.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
		
	}
	

