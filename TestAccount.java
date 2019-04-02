package com.jerry.pojo;

public class TestAccount {
	public static void main(String[] args) {
		Account account= new Account();
		account .setUsername("уехЩ");
		account.setBalance(5000);
		Thread thread1= new AccountThread1(account);
		Thread thread2=new AccountThread2(account);
		thread1.start();
		thread2.start();
				
	}

}
