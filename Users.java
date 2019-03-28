package com.jerry.pojo;

import java.io.Serializable;
import java.util.Date;

public class Users implements Serializable{
	private String username;
	private String password;
	private int id;
	private String realname;
	private Date birth;
	private static int num=0;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public Users(){
		id=num++;
	}

}
