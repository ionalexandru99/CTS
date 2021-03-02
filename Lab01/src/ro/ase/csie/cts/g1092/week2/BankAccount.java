package ro.ase.csie.cts.g1092.week2;

public abstract class BankAccount extends Account {

	protected double balance;
	protected final String iban;
	
	public BankAccount(double balance, String iban) {
		this.iban = iban;
		this.balance = balance;
	}
	
	@Override
	public double getBalance() {
		return this.balance;
	}
}
