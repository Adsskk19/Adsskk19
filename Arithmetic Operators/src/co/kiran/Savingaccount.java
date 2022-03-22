package co.kiran;

public abstract class Savingaccount extends AccountType {
	double totalBalance;
	final double RATEOFINTEREST = 5;
	private double INITIALBALANCE;
	Savingaccount(double INITIALBALANCE){
		this.INITIALBALANCE = INITIALBALANCE;
	}

}
