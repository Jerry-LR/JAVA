package come.jerry.fengzhuang;

public class Bank {
	
	Account account=new Account();
	public Account openAccount(long id, String password, int type) {
		//Account aaccount=null;
		if(type==0) {
			Account account=new Account();
			account.setId(id);
			account.setPassword(password);
			
		}
		else if(type==1)
		{
			account=new SavingAccount();
			account.setId(id);
			account.setPassword(password);
		
			}
		else if(type==2)
		{
			account=new CreditAccount();
			account.setId(id);
			account.setPassword(password);
		}
		return account;
		
	}
	public double deposit(Account a, double amount)
	{
		double b=a.getBalance();
		b+=amount;
		a.setBalance(b);
		return b;
	}
	double withdraw(Account a, double amount)
	{
		double d=a.getBalance();
		d-=amount;
		a.setBalance(d);
		return d;
	}
	
}
	
		
		




