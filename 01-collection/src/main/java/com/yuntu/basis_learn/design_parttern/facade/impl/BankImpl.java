package com.yuntu.basis_learn.design_parttern.facade.impl;

import com.yuntu.basis_learn.design_parttern.facade.Bank;

public class BankImpl implements Bank {
	@Override
	public void createCount() {
		System.out.println("银行开户");
	}
}
