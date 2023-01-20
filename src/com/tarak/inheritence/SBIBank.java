package com.tarak.inheritence;

public class SBIBank extends Bank{

	public SBIBank(double credit, double debit) {
		super(credit, debit);
		
	}

	@Override
	public String getBankName() {
		// TODO Auto-generated method stub
		return "SBI Bank";
	}

	@Override
	public String getIFSCCode() {
		// TODO Auto-generated method stub
		return "SBI000W23";
	}

}
