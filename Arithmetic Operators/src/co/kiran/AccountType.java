package co.kiran;

public abstract class AccountType implements Account {
	double INITIALBALANCE = 1000;
	double totalBalance;
	final double RATEOFINTEREST = 5;
	public void deposit(double amount) {
		//TODO Auto-generated method stub
		totalBalance = totalBalance+amount;
	}
	public void withdraw(double amount) {
		//TODO Auto-generated method stub
		if(amount>totalBalance)
		{
			System.out.println("Insufficient Amount");
		}
		else {
			totalBalance = totalBalance-amount;
		}
		
	}
	public double checkBalance() {
		//TODO Auto-generated method stub
		return totalBalance+RATEOFINTEREST;
	}
}
