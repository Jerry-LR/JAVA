package com.jerry.pojo;

public class AccountThread2 extends Thread {
	//�����û�
	private Account account ;
	//�����û�������вι��췽��
	public AccountThread2(Account account) {
	super();
	this.account=account;
}
	@Override
	public void run() {
		
			System.out.println("��ǰ���: "+account.getBalance());
		for(int i=0;i<10;i++)
		{synchronized (account) {
			double bl=account.getBalance()-500;
			account.setBalance(bl);
			System.out.println("�߳�2�� ��"+bl);
		}
		}
	}
}

