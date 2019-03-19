package come.jerry.fengzhuang;

public class TextBank  {

	public static void main(String[] args) {
		Account account=new Account();
		account.setAccount(3213,10000,"321321");
		Bank bank=new Bank();
		account=bank.openAccount(3213, "321321", 2);
		bank.deposit(account, 1000);
		bank.withdraw(account, 2);
		System.out.println(account.getBalance());
	}
}
