package come.jerry.fengzhuang;

public class SavingAccount extends Account{
	private double interestRate;
	public void setInterestRate(double interestRate) {
		if(0<interestRate&&interestRate<0.1)
		{
			this.interestRate=interestRate;
		}
		}
	public double getInterestRate() {
		return interestRate;
	}

}
