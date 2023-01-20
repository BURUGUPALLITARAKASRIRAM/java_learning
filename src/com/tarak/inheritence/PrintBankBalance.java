package com.tarak.inheritence;

public class PrintBankBalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank sbBank=new SBIBank(100, 10);
		System.out.println("Bank balace"+sbBank.getBalance());
		System.out.println("Bank IFSC"+sbBank.getIFSCCode());
	}

}
