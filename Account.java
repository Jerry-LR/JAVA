package com.jerry.map;
/*.�����⣺��Map��
���Account �������£�
private long id;  
 private double balance;  
 private String password;
Ҫ��������ƣ�ʹ�ø�Account �����ܹ��Զ�����id�� ����һ��List ���£�
List list = new ArrayList(); 
list.add(new Account(10.00, ��1234��)); 
list.add(new Account(15.00, ��5678��)); 
list.add(new Account(0, ��1010��)); 
Ҫ���List �е����ݷŵ�һ��Map �У���Map �ļ�Ϊid��ֵΪ��Ӧ��Account ���� ��	��������Map����ӡ����Account �����id
 �����
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Account {
	 private long id;  
	 private double balance;  
	 private String password;
	 public Account () {};
	 public Account( double balance, String password) {
		super();
		
		this.balance = balance;
		this.password = password;
	}
	 public Account( long id) {
			super();
			
			this.id=id;
		}
	 
	 
	 
	 public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void sss() {
		 List list = new ArrayList(); 
		 list.add(new Account(10.00, "1234")); 
		 list.add(new Account(15.00, "5678")); 
		 list.add(new Account(0, "1010"));
		 Map map=new HashMap();
		 for(int i=0;i<list.size();i++)
		 {
			 Account a=(Account) list.get(i);
			 a.id=i;//(long) (Math.random()*10000);
			 map.put(a.id, list.get(i));
		 }
		 Set keys=map.keySet();
			for(Object key:keys)
			{
				Account b=(Account) map.get(key);
				System.out.println("id��:"+key+" ���Ϊ:"+b.balance);
			}
		 
		 
	 }

	 public static void main(String[] args) {
		Account c=new Account();
		c.sss();
	}
	

}
