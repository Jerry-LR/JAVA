import java.util.ArrayList;
import java.util.List;

public class MoneyService {

	private int money;  //红包总钱数
	private int num;	//红包个数
	public MoneyService(int money, int num) {
		super();
		this.money =  money;
		this.num = num;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
	//将红包拆分成相应的个数，并存入到集合中，返回集合，并将方法上锁。
	public synchronized List<Integer> getBao(){
		
		List<Integer> li=new ArrayList<Integer>();	
		int a;	//每次随机取到的钱
		int mn=getMoney()*100;  //余额
		
		while(num>1)
		{
			a=(int) Math.floor((Math.random()*(mn-num)));
			li.add(a);
			mn=mn-a;
			num--;	
		}
		li.add(mn);
		return li;}
	}

import java.util.List;

public class BaoService extends Thread{
	//接收红包
	public static List<Integer> li;
	//打印每个线程抢到的红包金额
	public void print() {
		int length =li.size();
		if(length>0)
		{
			double a=li.get(length-1);
			System.out.println(Thread.currentThread().getName()+"抢到红包： "+a/100);
			li.remove(length-1);		
		}
	}
	//重写run方法
	@Override
	public void run() {
		while(true) {
			synchronized (li) {
				if(li.size()==0)
				{
					break;
				}
				print();
			}
			try {
				sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


import java.util.List;

public class Test {
public static void main(String[] args) {
	List<Integer> list=new MoneyService(1000, 7).getBao();
	BaoService.li=list;
	for(int i=0;i<list.size();i++)
	{
		new BaoService().start();
	}
}}
