package come.jerry.fengzhuang;

public class Account {
	private long id;
	private double balance;
	private String password;
	
	public Account() {}
	public void setAccount(long id, double balance, String password) {
		this.id = id;
		this.balance = balance;
		this.password = password;
	}
	
	public void setId(long id) {
		this.id=id;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public void setPassword(String password) {
		
		if(password.length()==6)
		{
			this.password=password;
		}
		else
		{
			System.out.println("不是6位不能修改！");
		}
	}
	
	
	public long getId() {
		return id;
	}
	public double getBalance() {
		return balance;
	}
	public String getPassword() {
		return null;
	}
	
	

}
