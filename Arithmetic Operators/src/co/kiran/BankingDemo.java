package co.kiran;

public class BankingDemo {
	public static void main(String args[]) {
		Savingaccount sav1 = new Savingaccount(5000);
		sav1.deposit(5000);
		System.out.println(sav1.checkBalance());
		sav1.withdraw(2500);
		System.out.println(sav1.checkBalance());
	}

}
