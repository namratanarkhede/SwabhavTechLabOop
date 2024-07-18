package com.aurionpro.model;

public class SavingAccount extends Account {

	private double MIN_BALANCE;

	public SavingAccount(int accountNo, String name, double balance, double MIN_BALANCE) {
		super(accountNo, name, balance);
		this.MIN_BALANCE = MIN_BALANCE;
	}
	@Override
	public void debit(double amount) {
		if(amount >0) {
			if(getBalance()-amount >= MIN_BALANCE) {
				setBalance(getBalance() - amount);
				System.out.println("Amount debited: " + amount+ " Total Balance: " +getBalance());
				return;
			}
			System.out.println("Minimum balance requirement not met. cannot debit amount");
			return;
		}
		System.out.println("Invalid input");
		
	}
	@Override
	public String toString() {
		return "SavingAccount [MIN_BALANCE=" + MIN_BALANCE + ", AccountNo=" + getAccountNo() + ", Name="
				+ getName() + ", Balance=" + getBalance() + "]";
	}
	
	

}
