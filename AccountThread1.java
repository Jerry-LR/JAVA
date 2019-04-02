package com.jerry.pojo;

public class AccountThread1 extends Thread{
	//接受用户
	private Account account ;
	
	//接收用户对象的有参构造方法
	public AccountThread1(Account account)
	{
		super();
		this.account=account;
	}
	@Override
	public void run() {
		System.out.println("当前余额: "+account.getBalance());
		
			for (int i = 0; i < 10; i++) {
				synchronized (account) {
				double bl=account.getBalance()-50;
				account.setBalance(bl);
				System.out.println("线程1: 余额: "+bl);
			}
		}
			
		}

}
