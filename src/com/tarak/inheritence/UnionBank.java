package com.tarak.inheritence;

public class UnionBank extends Bank {

	public UnionBank(double credit, double debit) {
		super(credit, debit);
	}

	@Override
	public String getBankName() {
		// TODO Auto-generated method stub
		return "UNION Bank";
	}

	@Override
	public String getIFSCCode() {
		// TODO Auto-generated method stub
		return "UNION00W123";
	}

}
