package com.tarak.inheritence;

public abstract class Bank {
	double credit;
	double debit;
	public Bank(double credit,double debit) {
		this.credit=credit;
		this.debit=debit;
	}
	public double getBalance() {
		return credit-debit;
	}
	public String getMiniStatement() {
		return "This is ministatement";
	}

	public abstract String getBankName();
	
	public abstract String getIFSCCode();
}
