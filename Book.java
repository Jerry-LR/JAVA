package com.jerry.pojo;

public class Book {
	private String name; //����
	private int id;		//id
	private String num;	//���
	private String username; //�˻�
	private String password; //����
	private String phone;	 //��ϵ�绰
	private static int no=0;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Book() {
		id=++no;
	}
	
	
	
}
